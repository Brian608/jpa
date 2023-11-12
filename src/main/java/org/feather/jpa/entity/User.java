package org.feather.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


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
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

}
