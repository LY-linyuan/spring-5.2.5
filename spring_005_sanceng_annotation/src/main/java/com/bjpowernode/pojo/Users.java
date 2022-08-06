package com.bjpowernode.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author 临渊
 * @Date 2022-08-06 10:49
 */

@Component
public class Users {
    @Value("1")
    private int u_id;
    @Value("张三那")
    private String uname;
    @Value("200")
    private int uage;

    public Users() {
    }

    public Users(int u_id, String uname, int uage) {
        this.u_id = u_id;
        this.uname = uname;
        this.uage = uage;
    }

    @Override
    public String toString() {
        return "Users{" +
                "u_id=" + u_id +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }
}
