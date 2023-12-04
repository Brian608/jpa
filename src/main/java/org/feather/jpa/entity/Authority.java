package org.feather.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.entity
 * @className: Authority
 * @author: feather
 * @description:
 * @since: 04-Dec-23 9:04 PM
 * @version: 1.0
 */
@Entity
@Data
@Table(name="jpa_authority")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "authorityList")
    private List<Users> usersList;
}
