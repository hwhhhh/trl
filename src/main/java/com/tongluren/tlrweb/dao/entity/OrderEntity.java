package com.tongluren.tlrweb.dao.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/20 12:39
 */
@Entity
@Table(name = "tbl_order")
@Data
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private int houseId;
    private Date checkinDate;
    private Date checkoutDate;
    private int pplNum;
    private BigDecimal price;
    private String tel;
    private int isEffective;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createOn;
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date modifiedOn;
}
