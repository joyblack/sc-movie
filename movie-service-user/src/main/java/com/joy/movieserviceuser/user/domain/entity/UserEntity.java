package com.joy.movieserviceuser.user.domain.entity;

import com.joy.movieserviceuser.common.domain.entity.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sc_user")
@Data
@ToString
public class UserEntity extends BaseEntity {
    /**
     * 登陆名
     */
    private String loginName;

    /**
     * 真实姓名
     */
    private String username;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 账户余额
     */
    private BigDecimal balance;

}
