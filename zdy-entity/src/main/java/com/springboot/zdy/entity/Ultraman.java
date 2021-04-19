package com.springboot.zdy.entity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author zhang dengyuan
 * @since 2021-04-19
 */
public class Ultraman implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer ultramanId;

    private String ultramanDeptName;

    private String ultramanDeptCode;

    private String ultramanLight;

    private String ultramanMaxSkill;

    private String ultramanName;

    private String ultramanColor;

    private String ultramanSex;

    private String ultramanAge;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUltramanId() {
        return ultramanId;
    }

    public void setUltramanId(Integer ultramanId) {
        this.ultramanId = ultramanId;
    }

    public String getUltramanDeptName() {
        return ultramanDeptName;
    }

    public void setUltramanDeptName(String ultramanDeptName) {
        this.ultramanDeptName = ultramanDeptName;
    }

    public String getUltramanDeptCode() {
        return ultramanDeptCode;
    }

    public void setUltramanDeptCode(String ultramanDeptCode) {
        this.ultramanDeptCode = ultramanDeptCode;
    }

    public String getUltramanLight() {
        return ultramanLight;
    }

    public void setUltramanLight(String ultramanLight) {
        this.ultramanLight = ultramanLight;
    }

    public String getUltramanMaxSkill() {
        return ultramanMaxSkill;
    }

    public void setUltramanMaxSkill(String ultramanMaxSkill) {
        this.ultramanMaxSkill = ultramanMaxSkill;
    }

    public String getUltramanName() {
        return ultramanName;
    }

    public void setUltramanName(String ultramanName) {
        this.ultramanName = ultramanName;
    }

    public String getUltramanColor() {
        return ultramanColor;
    }

    public void setUltramanColor(String ultramanColor) {
        this.ultramanColor = ultramanColor;
    }

    public String getUltramanSex() {
        return ultramanSex;
    }

    public void setUltramanSex(String ultramanSex) {
        this.ultramanSex = ultramanSex;
    }

    public String getUltramanAge() {
        return ultramanAge;
    }

    public void setUltramanAge(String ultramanAge) {
        this.ultramanAge = ultramanAge;
    }

    @Override
    public String toString() {
        return "Ultraman{" +
        ", id=" + id +
        ", ultramanId=" + ultramanId +
        ", ultramanDeptName=" + ultramanDeptName +
        ", ultramanDeptCode=" + ultramanDeptCode +
        ", ultramanLight=" + ultramanLight +
        ", ultramanMaxSkill=" + ultramanMaxSkill +
        ", ultramanName=" + ultramanName +
        ", ultramanColor=" + ultramanColor +
        ", ultramanSex=" + ultramanSex +
        ", ultramanAge=" + ultramanAge +
        "}";
    }
}
