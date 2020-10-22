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
@Table(name = "tbl_house")
@Data
public class HouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int ownerId;
    private String title;
    private String city;
    private String description;
    private BigDecimal price;
    private int bedroomNum;
    private int bathroomNum;
    private int bedNum;
    private String location;
    private int pplMax;
    private int status;
    private int rate;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createOn;
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date modifiedOn;
}
