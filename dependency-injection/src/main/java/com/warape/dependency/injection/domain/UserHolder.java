package com.warape.dependency.injection.domain;

import lombok.Data;

/**
 * @author wanmingyu
 * @create 2020/7/23 1:57 下午
 */
@Data
public class UserHolder {

    private User user;


    @Override
    public String toString() {
        return "UserHolder{" +
                "user=" + user.toString() +
                '}';
    }
}
