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
@Table(name = "tbl_comment")
@Data
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int houseId;
    private int criticId;
    private int rate;
    private String content;
    private int isEffective;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createOn;
    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    private Date modifiedOn;
}
