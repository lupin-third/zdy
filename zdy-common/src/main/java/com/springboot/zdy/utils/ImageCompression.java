package com.springboot.zdy.utils;

import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


/**
 * @author dengyuan zhang 
 * @date 2021/5/10 - 11:08
 * 图片压缩类工具
 */
public class ImageCompression {
    private static final Logger logger = LoggerFactory.getLogger(ImageCompression.class);
    private static final Integer ZERO = 0;
    private static final Integer ONE_ZERO_TWO_FOUR = 1024;
    private static final Integer NINE_ZERO_ZERO = 900;
    private static final Integer THREE_TWO_SEVEN_FIVE = 3275;
    private static final Integer TWO_ZERO_FOUR_SEVEN = 2047;
    private static final Double ZERO_EIGHT_FIVE = 0.85;
    private static final Double ZERO_SIX = 0.6;
    private static final Double ZERO_FOUR_FOUR = 0.44;
    private static final Double ZERO_FOUR = 0.4;

    /**
     * 根据指定大小压缩图片
     *
     * @param imageBytes  源图片字节数组
     * @param desFileSize 指定图片大小，单位kb
     * @return 压缩质量后的图片字节数组
     */
    public static byte[] ImageCompressForScale(byte[] imageBytes, long desFileSize) {
        if (imageBytes == null || imageBytes.length <= ZERO || imageBytes.length < desFileSize * ONE_ZERO_TWO_FOUR) {
            return imageBytes;
        }
        long srcSize = imageBytes.length;
        double accuracy = getAccuracy(srcSize / ONE_ZERO_TWO_FOUR);
        try {
            while (imageBytes.length > desFileSize * ONE_ZERO_TWO_FOUR) {
                ByteArrayInputStream inputStream = new ByteArrayInputStream(imageBytes);
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream(imageBytes.length);
                Thumbnails.of(inputStream)
                        .scale(accuracy)
                        .outputQuality(accuracy)
                        .toOutputStream(outputStream);
                imageBytes = outputStream.toByteArray();
            }
            logger.info("图片原大小={}kb | 压缩后大小={}kb",
                    srcSize / ONE_ZERO_TWO_FOUR, imageBytes.length / ONE_ZERO_TWO_FOUR);
        } catch (Exception e) {
            logger.error("【图片压缩】msg=图片压缩失败!", e);
        }
        return imageBytes;
    }

    /**
     * 自动调节精度(经验数值)
     *
     * @param size 源图片大小
     * @return 图片压缩质量比
     */
    private static double getAccuracy(long size) {
        double accuracy;
        if (size < NINE_ZERO_ZERO) {
            accuracy = ZERO_EIGHT_FIVE;
        } else if (size < TWO_ZERO_FOUR_SEVEN) {
            accuracy = ZERO_SIX;
        } else if (size < THREE_TWO_SEVEN_FIVE) {
            accuracy = ZERO_FOUR_FOUR;
        } else {
            accuracy = ZERO_FOUR;
        }
        return accuracy;
    }
    /*
    *
    * 另一个图片压缩工具，不能指定压缩大小，但是压缩不会丢失精度，图片清晰
    *
    * */
    public static InputStream AutoImageCompression(MultipartFile file) throws IOException {
        //获取文件输入流
        InputStream inputStream = file.getInputStream();
        try {
            // 把图片读入到内存中
            BufferedImage bufImg = ImageIO.read(inputStream);
            // 压缩代码,存储图片文件byte数组
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            //防止图片变红,这一步非常重要
            BufferedImage bufferedImage = new BufferedImage(bufImg.getWidth(), bufImg.getHeight(), BufferedImage.TYPE_INT_RGB);
            bufferedImage.createGraphics().drawImage(bufImg,0,0, Color.WHITE,null);
            //先转成jpg格式来压缩,然后在通过OSS来修改成源文件本来的后缀格式
            ImageIO.write(bufferedImage,"jpg",bos);
            //获取输出流
            inputStream = new ByteArrayInputStream(bos.toByteArray());
            return inputStream;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }finally {
            inputStream.close();
        }
    }
}
