package com.joy.movieserviceuser.common.domain.entity;

import com.joy.movieserviceuser.utils.DateUtil;
import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
@ToString
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    /**
     * 自增id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 创建时间
     */
    @Column(nullable = false, name = "create_time")
    private Date createTime = DateUtil.now();

    /**
     * 修改时间
     */
    @Column(nullable = false, name = "update_time")
    private Date updateTime = new Date();

    /**
     * 备注
     **/
    @Lob
    private String remarks;

}
