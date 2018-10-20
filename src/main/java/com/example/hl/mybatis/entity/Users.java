package com.example.hl.mybatis.entity;

import java.io.Serializable;

public class Users implements Serializable {
    private Integer userid;

    private String username;

    private Boolean gender;

    private String card;

    private String phone;

    private String tel;

    private String address;

    private static final long serialVersionUID = 1L;

    public Users(Integer userid, String username, Boolean gender, String card, String phone, String tel, String address) {
        this.userid = userid;
        this.username = username;
        this.gender = gender;
        this.card = card;
        this.phone = phone;
        this.tel = tel;
        this.address = address;
    }

    public Users() {
        super();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}