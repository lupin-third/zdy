package com.springboot.zdy.utils;

import java.text.SimpleDateFormat;

/**
 * @author dengyuan zhang
 * @date 2021/10/18 - 11:42
 */
public class DateUtil {
    public static final SimpleDateFormat datetimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final SimpleDateFormat dateparttimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * 将字符串日期时间转换成java.util.Date类型
     * <p>
     * 日期时间格式yyyy-MM-dd HH:mm:ss
     *
     * @param datetime
     * @return
     */
//    public static Date parseDatetime(String datetime) throws ParseException {
//        return new datetimeFormat.parse(datetime);
//    }
}
