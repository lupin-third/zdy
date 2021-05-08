package com.springboot.zdy.entity;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.Date;
/**
 * <p>
 * 
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-05-08
 */
public class ZdyEncyclopediaTab implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 奥特曼名1
     */
    private String ultramanName1;

    /**
     * 奥特曼图1
     */
    private String ultramanImage1;

    /**
     * 奥特曼名2
     */
    private String ultramanName2;

    /**
     * 奥特曼图2
     */
    private String ultramanImage2;

    /**
     * 奥特曼名3
     */
    private String ultramanName3;

    /**
     * 奥特曼图3
     */
    private String ultramanImage3;

    /**
     * 变身器
     */
    private String transfiguration;

    /**
     * 人间体1
     */
    private String ultramanTransformPerson1;

    /**
     * 人间体图1
     */
    private String ultramanTransformPersonImage1;

    /**
     * 人间体2
     */
    private String ultramanTransformPerson2;

    /**
     * 人间体图2
     */
    private String ultramanTransformPersonImage2;

    /**
     * 人间体3
     */
    private String ultramanTransformPerson3;

    /**
     * 人间体图3
     */
    private String ultramanTransformPersonImage3;

    /**
     * 人间体4
     */
    private String ultramanTransformPerson4;

    /**
     * 人间体图4
     */
    private String ultramanTransformPersonImage4;

    /**
     * 人间体5
     */
    private String ultramanTransformPerson5;

    /**
     * 人间体图5
     */
    private String ultramanTransformPersonImage5;

    /**
     * 战队名
     */
    private String ultramanTeam;

    /**
     * 战队年份
     */
    private Integer ultramanTeamYear;

    /**
     * 战队背景及历史介绍
     */
    private String ultramanTeamHistory;

    /**
     * 战队人物合照
     */
    private String ultramanTeamImage;

    /**
     * 战机及其他交通工具名称1
     */
    private String aircraftOrCarName1;

    /**
     * 战机及其他交通工具名称2
     */
    private String aircraftOrCarName2;

    /**
     * 战机及其他交通工具名称3
     */
    private String aircraftOrCarName3;

    /**
     * 战机及其他交通工具名称4
     */
    private String aircraftOrCarName4;

    /**
     * 战机及其他交通工具名称5
     */
    private String aircraftOrCarName5;

    /**
     * 战机及其他交通工具图1
     */
    private String aircraftOrCarImage1;

    /**
     * 战机及其他交通工具图2
     */
    private String aircraftOrCarImage2;

    /**
     * 战机及其他交通工具图3
     */
    private String aircraftOrCarImage3;

    /**
     * 战机及其他交通工具图4
     */
    private String aircraftOrCarImage4;

    /**
     * 战机及其他交通工具图5
     */
    private String aircraftOrCarImage5;

    /**
     * 战队成员姓名1
     */
    private String ultramanTeamPerson1;

    /**
     * 战队成员图片1
     */
    private String ultramanTeamImage1;

    /**
     * 战队成员介绍1
     */
    private String ultramanTeamPersonDetails1;

    /**
     * 战队成员姓名2
     */
    private String ultramanTeamPerson2;

    /**
     * 战队成员图片2
     */
    private String ultramanTeamImage2;

    /**
     * 战队成员介绍2
     */
    private String ultramanTeamPersonDetails2;

    /**
     * 战队成员姓名3
     */
    private String ultramanTeamPerson3;

    /**
     * 战队成员图片3
     */
    private String ultramanTeamImage3;

    /**
     * 战队成员介绍3
     */
    private String ultramanTeamPersonDetails3;

    /**
     * 战队成员姓名4
     */
    private String ultramanTeamPerson4;

    /**
     * 战队成员图片4
     */
    private String ultramanTeamImage4;

    /**
     * 战队成员介绍4
     */
    private String ultramanTeamPersonDetails4;

    /**
     * 战队成员姓名5
     */
    private String ultramanTeamPerson5;

    /**
     * 战队成员图片5
     */
    private String ultramanTeamImage5;

    /**
     * 战队成员介绍5
     */
    private String ultramanTeamPersonDetails5;

    /**
     * 战队成员姓名6
     */
    private String ultramanTeamPerson6;

    /**
     * 战队成员图片6
     */
    private String ultramanTeamImage6;

    /**
     * 战队成员介绍6
     */
    private String ultramanTeamPersonDetails6;

    /**
     * 战队成员姓名7
     */
    private String ultramanTeamPerson7;

    /**
     * 战队成员图片7
     */
    private String ultramanTeamImage7;

    /**
     * 战队成员介绍7
     */
    private String ultramanTeamPersonDetails7;

    /**
     * 战队成员姓名8
     */
    private String ultramanTeamPerson8;

    /**
     * 战队成员图片8
     */
    private String ultramanTeamImage8;

    /**
     * 战队成员介绍8
     */
    private String ultramanTeamPersonDetails8;

    /**
     * 创建者
     */
    private String createUsername;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /**
     * 创建者编号
     */
    private Integer createCode;

    /**
     * 修改者
     */
    private String updateUsername;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 修改者编号
     */
    private Integer updateCode;

    /**
     * 状态
     */
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUltramanName1() {
        return ultramanName1;
    }

    public void setUltramanName1(String ultramanName1) {
        this.ultramanName1 = ultramanName1;
    }

    public String getUltramanImage1() {
        return ultramanImage1;
    }

    public void setUltramanImage1(String ultramanImage1) {
        this.ultramanImage1 = ultramanImage1;
    }

    public String getUltramanName2() {
        return ultramanName2;
    }

    public void setUltramanName2(String ultramanName2) {
        this.ultramanName2 = ultramanName2;
    }

    public String getUltramanImage2() {
        return ultramanImage2;
    }

    public void setUltramanImage2(String ultramanImage2) {
        this.ultramanImage2 = ultramanImage2;
    }

    public String getUltramanName3() {
        return ultramanName3;
    }

    public void setUltramanName3(String ultramanName3) {
        this.ultramanName3 = ultramanName3;
    }

    public String getUltramanImage3() {
        return ultramanImage3;
    }

    public void setUltramanImage3(String ultramanImage3) {
        this.ultramanImage3 = ultramanImage3;
    }

    public String getTransfiguration() {
        return transfiguration;
    }

    public void setTransfiguration(String transfiguration) {
        this.transfiguration = transfiguration;
    }

    public String getUltramanTransformPerson1() {
        return ultramanTransformPerson1;
    }

    public void setUltramanTransformPerson1(String ultramanTransformPerson1) {
        this.ultramanTransformPerson1 = ultramanTransformPerson1;
    }

    public String getUltramanTransformPersonImage1() {
        return ultramanTransformPersonImage1;
    }

    public void setUltramanTransformPersonImage1(String ultramanTransformPersonImage1) {
        this.ultramanTransformPersonImage1 = ultramanTransformPersonImage1;
    }

    public String getUltramanTransformPerson2() {
        return ultramanTransformPerson2;
    }

    public void setUltramanTransformPerson2(String ultramanTransformPerson2) {
        this.ultramanTransformPerson2 = ultramanTransformPerson2;
    }

    public String getUltramanTransformPersonImage2() {
        return ultramanTransformPersonImage2;
    }

    public void setUltramanTransformPersonImage2(String ultramanTransformPersonImage2) {
        this.ultramanTransformPersonImage2 = ultramanTransformPersonImage2;
    }

    public String getUltramanTransformPerson3() {
        return ultramanTransformPerson3;
    }

    public void setUltramanTransformPerson3(String ultramanTransformPerson3) {
        this.ultramanTransformPerson3 = ultramanTransformPerson3;
    }

    public String getUltramanTransformPersonImage3() {
        return ultramanTransformPersonImage3;
    }

    public void setUltramanTransformPersonImage3(String ultramanTransformPersonImage3) {
        this.ultramanTransformPersonImage3 = ultramanTransformPersonImage3;
    }

    public String getUltramanTransformPerson4() {
        return ultramanTransformPerson4;
    }

    public void setUltramanTransformPerson4(String ultramanTransformPerson4) {
        this.ultramanTransformPerson4 = ultramanTransformPerson4;
    }

    public String getUltramanTransformPersonImage4() {
        return ultramanTransformPersonImage4;
    }

    public void setUltramanTransformPersonImage4(String ultramanTransformPersonImage4) {
        this.ultramanTransformPersonImage4 = ultramanTransformPersonImage4;
    }

    public String getUltramanTransformPerson5() {
        return ultramanTransformPerson5;
    }

    public void setUltramanTransformPerson5(String ultramanTransformPerson5) {
        this.ultramanTransformPerson5 = ultramanTransformPerson5;
    }

    public String getUltramanTransformPersonImage5() {
        return ultramanTransformPersonImage5;
    }

    public void setUltramanTransformPersonImage5(String ultramanTransformPersonImage5) {
        this.ultramanTransformPersonImage5 = ultramanTransformPersonImage5;
    }

    public String getUltramanTeam() {
        return ultramanTeam;
    }

    public void setUltramanTeam(String ultramanTeam) {
        this.ultramanTeam = ultramanTeam;
    }

    public Integer getUltramanTeamYear() {
        return ultramanTeamYear;
    }

    public void setUltramanTeamYear(Integer ultramanTeamYear) {
        this.ultramanTeamYear = ultramanTeamYear;
    }

    public String getUltramanTeamHistory() {
        return ultramanTeamHistory;
    }

    public void setUltramanTeamHistory(String ultramanTeamHistory) {
        this.ultramanTeamHistory = ultramanTeamHistory;
    }

    public String getUltramanTeamImage() {
        return ultramanTeamImage;
    }

    public void setUltramanTeamImage(String ultramanTeamImage) {
        this.ultramanTeamImage = ultramanTeamImage;
    }

    public String getAircraftOrCarName1() {
        return aircraftOrCarName1;
    }

    public void setAircraftOrCarName1(String aircraftOrCarName1) {
        this.aircraftOrCarName1 = aircraftOrCarName1;
    }

    public String getAircraftOrCarName2() {
        return aircraftOrCarName2;
    }

    public void setAircraftOrCarName2(String aircraftOrCarName2) {
        this.aircraftOrCarName2 = aircraftOrCarName2;
    }

    public String getAircraftOrCarName3() {
        return aircraftOrCarName3;
    }

    public void setAircraftOrCarName3(String aircraftOrCarName3) {
        this.aircraftOrCarName3 = aircraftOrCarName3;
    }

    public String getAircraftOrCarName4() {
        return aircraftOrCarName4;
    }

    public void setAircraftOrCarName4(String aircraftOrCarName4) {
        this.aircraftOrCarName4 = aircraftOrCarName4;
    }

    public String getAircraftOrCarName5() {
        return aircraftOrCarName5;
    }

    public void setAircraftOrCarName5(String aircraftOrCarName5) {
        this.aircraftOrCarName5 = aircraftOrCarName5;
    }

    public String getAircraftOrCarImage1() {
        return aircraftOrCarImage1;
    }

    public void setAircraftOrCarImage1(String aircraftOrCarImage1) {
        this.aircraftOrCarImage1 = aircraftOrCarImage1;
    }

    public String getAircraftOrCarImage2() {
        return aircraftOrCarImage2;
    }

    public void setAircraftOrCarImage2(String aircraftOrCarImage2) {
        this.aircraftOrCarImage2 = aircraftOrCarImage2;
    }

    public String getAircraftOrCarImage3() {
        return aircraftOrCarImage3;
    }

    public void setAircraftOrCarImage3(String aircraftOrCarImage3) {
        this.aircraftOrCarImage3 = aircraftOrCarImage3;
    }

    public String getAircraftOrCarImage4() {
        return aircraftOrCarImage4;
    }

    public void setAircraftOrCarImage4(String aircraftOrCarImage4) {
        this.aircraftOrCarImage4 = aircraftOrCarImage4;
    }

    public String getAircraftOrCarImage5() {
        return aircraftOrCarImage5;
    }

    public void setAircraftOrCarImage5(String aircraftOrCarImage5) {
        this.aircraftOrCarImage5 = aircraftOrCarImage5;
    }

    public String getUltramanTeamPerson1() {
        return ultramanTeamPerson1;
    }

    public void setUltramanTeamPerson1(String ultramanTeamPerson1) {
        this.ultramanTeamPerson1 = ultramanTeamPerson1;
    }

    public String getUltramanTeamImage1() {
        return ultramanTeamImage1;
    }

    public void setUltramanTeamImage1(String ultramanTeamImage1) {
        this.ultramanTeamImage1 = ultramanTeamImage1;
    }

    public String getUltramanTeamPersonDetails1() {
        return ultramanTeamPersonDetails1;
    }

    public void setUltramanTeamPersonDetails1(String ultramanTeamPersonDetails1) {
        this.ultramanTeamPersonDetails1 = ultramanTeamPersonDetails1;
    }

    public String getUltramanTeamPerson2() {
        return ultramanTeamPerson2;
    }

    public void setUltramanTeamPerson2(String ultramanTeamPerson2) {
        this.ultramanTeamPerson2 = ultramanTeamPerson2;
    }

    public String getUltramanTeamImage2() {
        return ultramanTeamImage2;
    }

    public void setUltramanTeamImage2(String ultramanTeamImage2) {
        this.ultramanTeamImage2 = ultramanTeamImage2;
    }

    public String getUltramanTeamPersonDetails2() {
        return ultramanTeamPersonDetails2;
    }

    public void setUltramanTeamPersonDetails2(String ultramanTeamPersonDetails2) {
        this.ultramanTeamPersonDetails2 = ultramanTeamPersonDetails2;
    }

    public String getUltramanTeamPerson3() {
        return ultramanTeamPerson3;
    }

    public void setUltramanTeamPerson3(String ultramanTeamPerson3) {
        this.ultramanTeamPerson3 = ultramanTeamPerson3;
    }

    public String getUltramanTeamImage3() {
        return ultramanTeamImage3;
    }

    public void setUltramanTeamImage3(String ultramanTeamImage3) {
        this.ultramanTeamImage3 = ultramanTeamImage3;
    }

    public String getUltramanTeamPersonDetails3() {
        return ultramanTeamPersonDetails3;
    }

    public void setUltramanTeamPersonDetails3(String ultramanTeamPersonDetails3) {
        this.ultramanTeamPersonDetails3 = ultramanTeamPersonDetails3;
    }

    public String getUltramanTeamPerson4() {
        return ultramanTeamPerson4;
    }

    public void setUltramanTeamPerson4(String ultramanTeamPerson4) {
        this.ultramanTeamPerson4 = ultramanTeamPerson4;
    }

    public String getUltramanTeamImage4() {
        return ultramanTeamImage4;
    }

    public void setUltramanTeamImage4(String ultramanTeamImage4) {
        this.ultramanTeamImage4 = ultramanTeamImage4;
    }

    public String getUltramanTeamPersonDetails4() {
        return ultramanTeamPersonDetails4;
    }

    public void setUltramanTeamPersonDetails4(String ultramanTeamPersonDetails4) {
        this.ultramanTeamPersonDetails4 = ultramanTeamPersonDetails4;
    }

    public String getUltramanTeamPerson5() {
        return ultramanTeamPerson5;
    }

    public void setUltramanTeamPerson5(String ultramanTeamPerson5) {
        this.ultramanTeamPerson5 = ultramanTeamPerson5;
    }

    public String getUltramanTeamImage5() {
        return ultramanTeamImage5;
    }

    public void setUltramanTeamImage5(String ultramanTeamImage5) {
        this.ultramanTeamImage5 = ultramanTeamImage5;
    }

    public String getUltramanTeamPersonDetails5() {
        return ultramanTeamPersonDetails5;
    }

    public void setUltramanTeamPersonDetails5(String ultramanTeamPersonDetails5) {
        this.ultramanTeamPersonDetails5 = ultramanTeamPersonDetails5;
    }

    public String getUltramanTeamPerson6() {
        return ultramanTeamPerson6;
    }

    public void setUltramanTeamPerson6(String ultramanTeamPerson6) {
        this.ultramanTeamPerson6 = ultramanTeamPerson6;
    }

    public String getUltramanTeamImage6() {
        return ultramanTeamImage6;
    }

    public void setUltramanTeamImage6(String ultramanTeamImage6) {
        this.ultramanTeamImage6 = ultramanTeamImage6;
    }

    public String getUltramanTeamPersonDetails6() {
        return ultramanTeamPersonDetails6;
    }

    public void setUltramanTeamPersonDetails6(String ultramanTeamPersonDetails6) {
        this.ultramanTeamPersonDetails6 = ultramanTeamPersonDetails6;
    }

    public String getUltramanTeamPerson7() {
        return ultramanTeamPerson7;
    }

    public void setUltramanTeamPerson7(String ultramanTeamPerson7) {
        this.ultramanTeamPerson7 = ultramanTeamPerson7;
    }

    public String getUltramanTeamImage7() {
        return ultramanTeamImage7;
    }

    public void setUltramanTeamImage7(String ultramanTeamImage7) {
        this.ultramanTeamImage7 = ultramanTeamImage7;
    }

    public String getUltramanTeamPersonDetails7() {
        return ultramanTeamPersonDetails7;
    }

    public void setUltramanTeamPersonDetails7(String ultramanTeamPersonDetails7) {
        this.ultramanTeamPersonDetails7 = ultramanTeamPersonDetails7;
    }

    public String getUltramanTeamPerson8() {
        return ultramanTeamPerson8;
    }

    public void setUltramanTeamPerson8(String ultramanTeamPerson8) {
        this.ultramanTeamPerson8 = ultramanTeamPerson8;
    }

    public String getUltramanTeamImage8() {
        return ultramanTeamImage8;
    }

    public void setUltramanTeamImage8(String ultramanTeamImage8) {
        this.ultramanTeamImage8 = ultramanTeamImage8;
    }

    public String getUltramanTeamPersonDetails8() {
        return ultramanTeamPersonDetails8;
    }

    public void setUltramanTeamPersonDetails8(String ultramanTeamPersonDetails8) {
        this.ultramanTeamPersonDetails8 = ultramanTeamPersonDetails8;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateCode() {
        return updateCode;
    }

    public void setUpdateCode(Integer updateCode) {
        this.updateCode = updateCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ZdyEncyclopediaTab{" +
        ", id=" + id +
        ", ultramanName1=" + ultramanName1 +
        ", ultramanImage1=" + ultramanImage1 +
        ", ultramanName2=" + ultramanName2 +
        ", ultramanImage2=" + ultramanImage2 +
        ", ultramanName3=" + ultramanName3 +
        ", ultramanImage3=" + ultramanImage3 +
        ", transfiguration=" + transfiguration +
        ", ultramanTransformPerson1=" + ultramanTransformPerson1 +
        ", ultramanTransformPersonImage1=" + ultramanTransformPersonImage1 +
        ", ultramanTransformPerson2=" + ultramanTransformPerson2 +
        ", ultramanTransformPersonImage2=" + ultramanTransformPersonImage2 +
        ", ultramanTransformPerson3=" + ultramanTransformPerson3 +
        ", ultramanTransformPersonImage3=" + ultramanTransformPersonImage3 +
        ", ultramanTransformPerson4=" + ultramanTransformPerson4 +
        ", ultramanTransformPersonImage4=" + ultramanTransformPersonImage4 +
        ", ultramanTransformPerson5=" + ultramanTransformPerson5 +
        ", ultramanTransformPersonImage5=" + ultramanTransformPersonImage5 +
        ", ultramanTeam=" + ultramanTeam +
        ", ultramanTeamYear=" + ultramanTeamYear +
        ", ultramanTeamHistory=" + ultramanTeamHistory +
        ", ultramanTeamImage=" + ultramanTeamImage +
        ", aircraftOrCarName1=" + aircraftOrCarName1 +
        ", aircraftOrCarName2=" + aircraftOrCarName2 +
        ", aircraftOrCarName3=" + aircraftOrCarName3 +
        ", aircraftOrCarName4=" + aircraftOrCarName4 +
        ", aircraftOrCarName5=" + aircraftOrCarName5 +
        ", aircraftOrCarImage1=" + aircraftOrCarImage1 +
        ", aircraftOrCarImage2=" + aircraftOrCarImage2 +
        ", aircraftOrCarImage3=" + aircraftOrCarImage3 +
        ", aircraftOrCarImage4=" + aircraftOrCarImage4 +
        ", aircraftOrCarImage5=" + aircraftOrCarImage5 +
        ", ultramanTeamPerson1=" + ultramanTeamPerson1 +
        ", ultramanTeamImage1=" + ultramanTeamImage1 +
        ", ultramanTeamPersonDetails1=" + ultramanTeamPersonDetails1 +
        ", ultramanTeamPerson2=" + ultramanTeamPerson2 +
        ", ultramanTeamImage2=" + ultramanTeamImage2 +
        ", ultramanTeamPersonDetails2=" + ultramanTeamPersonDetails2 +
        ", ultramanTeamPerson3=" + ultramanTeamPerson3 +
        ", ultramanTeamImage3=" + ultramanTeamImage3 +
        ", ultramanTeamPersonDetails3=" + ultramanTeamPersonDetails3 +
        ", ultramanTeamPerson4=" + ultramanTeamPerson4 +
        ", ultramanTeamImage4=" + ultramanTeamImage4 +
        ", ultramanTeamPersonDetails4=" + ultramanTeamPersonDetails4 +
        ", ultramanTeamPerson5=" + ultramanTeamPerson5 +
        ", ultramanTeamImage5=" + ultramanTeamImage5 +
        ", ultramanTeamPersonDetails5=" + ultramanTeamPersonDetails5 +
        ", ultramanTeamPerson6=" + ultramanTeamPerson6 +
        ", ultramanTeamImage6=" + ultramanTeamImage6 +
        ", ultramanTeamPersonDetails6=" + ultramanTeamPersonDetails6 +
        ", ultramanTeamPerson7=" + ultramanTeamPerson7 +
        ", ultramanTeamImage7=" + ultramanTeamImage7 +
        ", ultramanTeamPersonDetails7=" + ultramanTeamPersonDetails7 +
        ", ultramanTeamPerson8=" + ultramanTeamPerson8 +
        ", ultramanTeamImage8=" + ultramanTeamImage8 +
        ", ultramanTeamPersonDetails8=" + ultramanTeamPersonDetails8 +
        ", createUsername=" + createUsername +
        ", createTime=" + createTime +
        ", createCode=" + createCode +
        ", updateUsername=" + updateUsername +
        ", updateTime=" + updateTime +
        ", updateCode=" + updateCode +
        ", status=" + status +
        "}";
    }
}
