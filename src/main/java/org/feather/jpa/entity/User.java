package org.feather.jpa.entity;

import lombok.Data;

import javax.persistence.*;


/**
 * @projectName: jpa
 * @package: org.feather.jpa.entity
 * @className: User
 * @author: feather
 * @description:
 * @since: 12-Nov-23 4:01 PM
 * @version: 1.0
 */
@Entity
@Data
@Table(name="jpa_user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "name")
    private String name;


    @Column(name = "password")
    private String password;

}
