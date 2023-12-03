package org.feather.jpa.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.entity
 * @className: AccountDetail
 * @author: feather
 * @description:
 * @since: 03-Dec-23 9:26 PM
 * @version: 1.0
 */
@Entity
@Data
@Table(name="jpa_account_detail")
public class AccountDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
     Long id;

    @Column(name = "address")
     String address;

    @Column(name = "email")
     String email;

    @Column(name = "phone")
     String phone;

    @Column(name = "real_name")
     String realName;
}
