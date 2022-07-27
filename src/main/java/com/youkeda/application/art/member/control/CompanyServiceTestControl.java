package com.youkeda.application.art.member.control;


public class UserServiceTestControl{

    private static final Logger log = LoggerFactory.getLogger(UserServiceTestControl.class);

    @Autowired
    private UserService userService;

    public User testRegUser(){
        User user = new User();

        user.setUserName("huahua");
        user.setMobile("11411411411");
        user.setPwd("0123456");
        user.setAgreementVersion("1.0");
        user.setName("hua");
        user.setNickName("xiaohua");
        user.setEmail("huahua@qq.com");
        user.setGender(Gender.female);
        user.setStatus(UserStatus.enabled);

        try {
            user = userService.reg(user);
        }catch (UserNameInUseException e){
            log.error("reg error" , e);
        }

        return user;
    }
}