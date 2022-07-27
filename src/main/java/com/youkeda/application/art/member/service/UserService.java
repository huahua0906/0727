package com.youkeda.application.art.member.service;

import com.youkeda.application.art.member.exception.UserNameInUseException;
import com.youkeda.application.art.member.exception.UserPwdErrorException;
import com.youkeda.application.art.member.model.User;
import com.youkeda.application.art.member.repository.UserRepository;
import com.youkeda.application.art.member.service.UserService;
import com.youkeda.application.art.member.util.IDUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.time.LocalDateTime;

public interface UserService{

    User getWithUserId(String userId);
    User getWithUserName(String userName);
    User getWithMobile(String mobile);

    String getMd5Pwd(String slot, String pwd);

    User update(User user);

    User reg(User user) throws UserNameInUseException;

    void changePwd(String userId, String newPwd) throws UserPwdErrorException;

    void restPwd(String usrId, String newPwd);

}