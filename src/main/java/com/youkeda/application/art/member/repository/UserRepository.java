package com.youkeda.application.art.member.repository;

import com.youkeda.application.art.member.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, String> {

    User findByMobile(String mobile);

    User findByUserName(String userName);

    User findByEmail(String email);

}
