package com.bysj.model;

/**
 * Created by cxj on 2016/11/25.
 */
public class User {
    private Integer id;
    private String user;
    private String password;
    private String state;
    private Byte manager;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Byte getManager() {
        return manager;
    }

    public void setManager(Byte manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", manager=" + manager +
                '}';
    }
}
