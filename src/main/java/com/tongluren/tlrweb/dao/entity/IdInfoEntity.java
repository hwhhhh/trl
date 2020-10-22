package com.tongluren.tlrweb.dao.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @Description detail
 * Created by Hwhhhh on 2020/10/20 12:40
 */
@Entity
@Table(name = "sys_id_info")
@Data
public class IdInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int userId;
    private String name;
    private String idNumber;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createOn;
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date modifiedOn;
}
