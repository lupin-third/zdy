package com.springboot.zdy.entity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * <p>
 * 
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-04-27
 */
public class ZdyMemeTab implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 梗名
     */
    private String memeName;

    /**
     * 名梗内容
     */
    private String memeContent;

    /**
     * 名梗出处
     */
    private String memeFrom;

    /**
     * 名梗贡献者
     */
    private String memeContributor;

    /**
     * 创建人(默认当前登录者)
     */
    private String createUsername;

    /**
     * 创建时间(默认当前系统时间)
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 当前用户名唯一code
     */
    private Integer createCode;

    /**
     * 修改人(预防恶意卡bug篡改数据)
     */
    private String updateUsername;

    /**
     * 修改时间(默认当前时间)
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    /**
     * 当前用户名唯一code(若为空则代表非本人操作)
     */
    private Integer updateCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemeName() {
        return memeName;
    }

    public void setMemeName(String memeName) {
        this.memeName = memeName;
    }

    public String getMemeContent() {
        return memeContent;
    }

    public void setMemeContent(String memeContent) {
        this.memeContent = memeContent;
    }

    public String getMemeFrom() {
        return memeFrom;
    }

    public void setMemeFrom(String memeFrom) {
        this.memeFrom = memeFrom;
    }

    public String getMemeContributor() {
        return memeContributor;
    }

    public void setMemeContributor(String memeContributor) {
        this.memeContributor = memeContributor;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateCode() {
        return createCode;
    }

    public void setCreateCode(Integer createCode) {
        this.createCode = createCode;
    }

    public String getUpdateUsername() {
        return updateUsername;
    }

    public void setUpdateUsername(String updateUsername) {
        this.updateUsername = updateUsername;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateCode() {
        return updateCode;
    }

    public void setUpdateCode(Integer updateCode) {
        this.updateCode = updateCode;
    }

    @Override
    public String toString() {
        return "ZdyMemeTab{" +
        ", id=" + id +
        ", memeName=" + memeName +
        ", memeContent=" + memeContent +
        ", memeFrom=" + memeFrom +
        ", memeContributor=" + memeContributor +
        ", createUsername=" + createUsername +
        ", createTime=" + createTime +
        ", createCode=" + createCode +
        ", updateUsername=" + updateUsername +
        ", updateTime=" + updateTime +
        ", updateCode=" + updateCode +
        "}";
    }
}
