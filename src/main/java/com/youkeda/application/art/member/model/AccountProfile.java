package com.youkeda.application.art.member.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.youkeda.model.Base;
import java.time.LocalDate;

public class AccountProfile extends Base<AccountProfile>{

    private static final long serialVersionUID = -38325728543283268L;

    private String schoolName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate schoolBeginDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate schoolEndDate;

    private String major;

    private String qq;

    private String faculty;

    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public LocalDate getSchoolBeginDate() {
        return schoolBeginDate;
    }
    public void setSchoolBeginDate(LocalDate schoolBeginDate) {
        this.schoolBeginDate = schoolBeginDate;
    }

    public LocalDate getSchoolEndDate() {
        return schoolEndDate;
    }
    public void setSchoolEndDate(LocalDate schoolEndDate) {
        this.schoolEndDate = schoolEndDate;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getQq() {
        return qq;
    }
    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}