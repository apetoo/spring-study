package com.warape.dependency.injection.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wanmingyu
 * @create 2020/7/23 1:57 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserHolder {

    private User user;


    @Override
    public String toString() {
        return "UserHolder{" +
                "user=" + user.toString() +
                '}';
    }
}
