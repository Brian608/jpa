package org.feather.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.entity
 * @className: Account
 * @author: feather
 * @description:
 * @since: 03-Dec-23 9:25 PM
 * @version: 1.0
 */
@Entity
@Data
@Table(name="jpa_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
     Long id;


    @Column(name = "name")
     String name;


    @Column(name = "password")
     String password;

    /**
     * 一对一，对象类型，也可以理解为这里写那个实体类，外键就指向那个实体类的主键
     */
    @JoinColumn(name = "detail_id")
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL) //设置关联操作为All
      AccountDetail detail;

}
