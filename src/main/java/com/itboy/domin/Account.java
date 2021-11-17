package com.itboy.domin;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author wh
 * @date 2021年11月13日9:31
 */
public class Account implements Serializable {
    private String name;
    private String password;
    private String money;
    private List<User>users;
    private Map<String,User>userMap;
//    private User user;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", money='" + money + '\'' +
                ", users=" + users +
                ", userMap=" + userMap +
                '}';
    }
}
