package com.joy.movieserviceticketribbonhystrix.ticket.domain.po;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class User {
    private Long id;

    private String loginName;

    private String username;

    private BigDecimal balance;

}
