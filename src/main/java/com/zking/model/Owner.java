package com.zking.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Owner {

    private String o_number;

    private String o_name;

    private String o_state;

    private String o_ownerphone;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date o_jdata;

    private String o_carder;

    private String o_sex;

    private String o_company;

    private String o_birthday;

    private String o_phone;

    private String o_remarks;

    private String o_man;

    private String o_tel;

    private String o_address;


    private String t_number;

    private String t_element;

    private String t_house;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date o_check_date;

    private String o_image;

    public Owner( String o_number, String o_name, String o_state, String o_ownerphone, Date o_jdata, String o_carder, String o_sex, String o_company, String o_birthday, String o_phone, String o_remarks, String o_man, String o_tel, String o_address,  String t_number, String t_element, String t_house, Date o_check_date,String o_image) {
        this.o_number = o_number;
        this.o_name = o_name;
        this.o_state = o_state;
        this.o_ownerphone = o_ownerphone;
        this.o_jdata = o_jdata;
        this.o_carder = o_carder;
        this.o_sex = o_sex;
        this.o_company = o_company;
        this.o_birthday = o_birthday;
        this.o_phone = o_phone;
        this.o_remarks = o_remarks;
        this.o_man = o_man;
        this.o_tel = o_tel;
        this.o_address = o_address;
        this.t_number = t_number;
        this.t_element = t_element;
        this.t_house = t_house;
        this.o_check_date = o_check_date;
        this.o_image=o_image;
    }

    public Owner() {
        super();
    }

    public String getO_number() {
        return o_number;
    }

    public void setO_number(String o_number) {
        this.o_number = o_number;
    }

    public String getO_name() {
        return o_name;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public String getO_state() {
        return o_state;
    }

    public void setO_state(String o_state) {
        this.o_state = o_state;
    }

    public String getO_ownerphone() {
        return o_ownerphone;
    }

    public void setO_ownerphone(String o_ownerphone) {
        this.o_ownerphone = o_ownerphone;
    }

    public Date getO_jdata() {
        return o_jdata;
    }

    public void setO_jdata(Date o_jdata) {
        this.o_jdata = o_jdata;
    }

    public String getO_carder() {
        return o_carder;
    }

    public void setO_carder(String o_carder) {
        this.o_carder = o_carder;
    }

    public String getO_sex() {
        return o_sex;
    }

    public void setO_sex(String o_sex) {
        this.o_sex = o_sex;
    }

    public String getO_company() {
        return o_company;
    }

    public void setO_company(String o_company) {
        this.o_company = o_company;
    }

    public String getO_birthday() {
        return o_birthday;
    }

    public void setO_birthday(String o_birthday) {
        this.o_birthday = o_birthday;
    }

    public String getO_phone() {
        return o_phone;
    }

    public void setO_phone(String o_phone) {
        this.o_phone = o_phone;
    }

    public String getO_remarks() {
        return o_remarks;
    }

    public void setO_remarks(String o_remarks) {
        this.o_remarks = o_remarks;
    }

    public String getO_man() {
        return o_man;
    }

    public void setO_man(String o_man) {
        this.o_man = o_man;
    }

    public String getO_tel() {
        return o_tel;
    }

    public void setO_tel(String o_tel) {
        this.o_tel = o_tel;
    }

    public String getO_address() {
        return o_address;
    }

    public void setO_address(String o_address) {
        this.o_address = o_address;
    }


    public String getT_number() {
        return t_number;
    }

    public void setT_number(String t_number) {
        this.t_number = t_number;
    }

    public String getT_element() {
        return t_element;
    }

    public void setT_element(String t_element) {
        this.t_element = t_element;
    }

    public String getT_house() {
        return t_house;
    }

    public void setT_house(String t_house) {
        this.t_house = t_house;
    }

    public Date getO_check_date() {
        return o_check_date;
    }

    public void setO_check_date(Date o_check_date) {
        this.o_check_date = o_check_date;
    }

    public String getO_image() {
        return o_image;
    }

    public void setO_image(String o_image) {
        this.o_image = o_image;
    }
}