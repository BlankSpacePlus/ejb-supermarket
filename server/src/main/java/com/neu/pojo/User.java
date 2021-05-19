package com.neu.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private Integer id; //id

    private String userCode; //用户编码

    private String userName;

    private String userPassword;

    private Integer gender;

    private Date birthday;

    private String phone;

    private String address;

    private Integer userRole; //用户角色

    private Integer createdBy; //创建者

    private Date creationDate; //创建时间

    private Integer modifyBy; //更新者

    private Date modifyDate; //更新时间

    private Integer age; //年龄

    private String userRoleName; //用户角色名称

    public User() {
    }

    public User(Integer id, String userCode, String userName, String userPassword, Integer gender,
                Date birthday, String phone, String address, Integer userRole, Integer createdBy,
                Date creationDate, Integer modifyBy, Date modifyDate, Integer age, String userRoleName) {
        this.id = id;
        this.userCode = userCode;
        this.userName = userName;
        this.userPassword = userPassword;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
        this.userRole = userRole;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.age = age;
        this.userRoleName = userRoleName;
    }

    /**
     * 计算年龄
     * @return 计算年龄
     */
    public Integer getAge() {
        Date date = new Date();
        Integer age = date.getYear() - birthday.getYear();
        return age;
    }

    public String getUserRoleName() {
        return userRoleName;
    }

    public void setUserRoleName(String userRoleName) {
        this.userRoleName = userRoleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

}
