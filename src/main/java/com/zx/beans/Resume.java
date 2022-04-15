package com.zx.beans;

public class Resume {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String imaurl;
    private String address;
    private String phone;
    private String email;
    private String hobby;
    private String major;
    private String workExperience;
    private String selfEvaluation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImaurl() {
        return imaurl;
    }

    public void setImaurl(String imaurl) {
        this.imaurl = imaurl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getSelfEvaluation() {
        return selfEvaluation;
    }

    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

    public Resume(String name, int age, String imaurl, String address, String phone, String email, String hobby, String major, String workExperience, String selfEvaluation) {
        this.name = name;
        this.age = age;
        this.imaurl = imaurl;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.hobby = hobby;
        this.major = major;
        this.workExperience = workExperience;
        this.selfEvaluation = selfEvaluation;
    }

    public Resume(String name, String gender, int age, String imaurl, String address, String phone, String email, String hobby, String major, String workExperience, String selfEvaluation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.imaurl = imaurl;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.hobby = hobby;
        this.major = major;
        this.workExperience = workExperience;
        this.selfEvaluation = selfEvaluation;
    }

    public Resume() {
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", imaurl='" + imaurl + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", hobby='" + hobby + '\'' +
                ", major='" + major + '\'' +
                ", workExperience='" + workExperience + '\'' +
                ", selfEvaluation='" + selfEvaluation + '\'' +
                '}';
    }
}
