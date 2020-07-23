package com.warape.dependency.injection.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author wanmingyu
 * @create 2020/7/23 1:53 下午
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class SuperUser extends User {

    private String address;

}
