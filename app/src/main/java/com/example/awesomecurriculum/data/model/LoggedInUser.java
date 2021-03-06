package com.example.awesomecurriculum.data.model;

/**
 * 为从LoginRepository检索的登录用户捕获用户信息的数据类
 */
public class LoggedInUser {

    private String userId;
    private String displayName;
    private String avatar;
    private String email;
    private String token;
    private String school;

    public LoggedInUser(String userId, String displayName, String avatar, String email, String token, String school) {
        this.userId = userId;
        this.displayName = displayName;
        this.avatar = avatar;
        this.email = email;
        this.token = token;
        this.school = school;
    }
    public String getDisplayName() {
        return displayName;
    }

    public String getUserId() {
        return userId;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getEmail() {
        return email;
    }

    public String getToken() {
        return token;
    }

    public String getSchool() {
        return school;
    }

}
