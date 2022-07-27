package com.youkeda.application.art.member.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.youkeda.model.Base;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

public class Account extends Base{

    @Transient
    public static final Account DEFAULT = new Account("5e72e0bfad8bcb7392fbcb79", "ykd", AccountStatus.enabled);

    private static final long serialVersionUID = 383257711285432860L;

    @Transient
    private User user;

    @Field(targetType = FieldType.OBJECT_ID)
    private String userId;

    private AccountProfile profile = new AccountProfile();

    private AccountStatus status = AccountStatus.enabled;

    private String accountName;

    private String accountMobile;

    private String oldId;

    private String email;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime joinTime;

    private String jobNumber;

    private boolean ban;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AccountProfile getProfile() {
        return profile;
    }
    public void setProfile(AccountProfile profile) {
        this.profile = profile;
    }

    public AccountStatus getStatus() {
        return status;
    }
    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountMobile() {
        return accountMobile;
    }
    public void setAccountMobile(String accountMobile) {
        this.accountMobile = accountMobile;
    }

    public String getOldId() {
        return oldId;
    }
    public void setOldId(String oldId) {
        this.oldId = oldId;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getJoinTime() {
        return joinTime;
    }
    public void setJoinTime(LocalDateTime joinTime) {
        this.joinTime = joinTime;
    }

    public String getJobNumber() {
        return jobNumber;
    }
    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public boolean isBan() {
        return ban;
    }
    public void setBan(boolean ban) {
        this.ban = ban;
    }

    public Account() {

    }

    public Account(String id, String accountName, AccountStatus status) {

        setId(id);
        setAccountName(accountName);
        setStatus(status);
    }

    public static Account create() {
        return new Account();
    }


}