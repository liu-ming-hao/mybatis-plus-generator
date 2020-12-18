package com.zhengqing.aigou.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhengqing
 * @since 2020-12-18
 */
@TableName("ORDER_HOLDER")
public class OrderHolder extends Model<OrderHolder> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @TableField("NAME")
    private String name;

    @TableField("SEX")
    private String sex;

    @TableField("ID_TYPE")
    private String idType;

    @TableField("ID_CARD")
    private String idCard;

    @TableField("PHONE")
    private String phone;

    @TableField("BIRTHDAY")
    private LocalDateTime birthday;

    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    @TableField("DELETE_FLAG")
    private String deleteFlag;

    @TableField("VERSION")
    private String version;

    @TableField("ID_EXP_DATE")
    private LocalDateTime idExpDate;

    @TableField("EMAIL")
    private String email;

    @TableField("ADDRESS")
    private String address;

    @TableField("PROVINCE_CODE")
    private String provinceCode;

    @TableField("PROVINCE_NAME")
    private String provinceName;

    @TableField("CITY_CODE")
    private String cityCode;

    @TableField("CITY_NAME")
    private String cityName;

    @TableField("REGION_CODE")
    private String regionCode;

    @TableField("REGION_NAME")
    private String regionName;

    @TableField("JOB_CODE")
    private String jobCode;

    @TableField("JOB_NAME")
    private String jobName;

    @TableField("ID_TYPE_NAME")
    private String idTypeName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LocalDateTime getIdExpDate() {
        return idExpDate;
    }

    public void setIdExpDate(LocalDateTime idExpDate) {
        this.idExpDate = idExpDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getIdTypeName() {
        return idTypeName;
    }

    public void setIdTypeName(String idTypeName) {
        this.idTypeName = idTypeName;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OrderHolder{" +
        "id=" + id +
        ", name=" + name +
        ", sex=" + sex +
        ", idType=" + idType +
        ", idCard=" + idCard +
        ", phone=" + phone +
        ", birthday=" + birthday +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", deleteFlag=" + deleteFlag +
        ", version=" + version +
        ", idExpDate=" + idExpDate +
        ", email=" + email +
        ", address=" + address +
        ", provinceCode=" + provinceCode +
        ", provinceName=" + provinceName +
        ", cityCode=" + cityCode +
        ", cityName=" + cityName +
        ", regionCode=" + regionCode +
        ", regionName=" + regionName +
        ", jobCode=" + jobCode +
        ", jobName=" + jobName +
        ", idTypeName=" + idTypeName +
        "}";
    }
}
