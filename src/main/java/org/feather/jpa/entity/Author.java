package org.feather.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.entity
 * @className: Author
 * @author: feather
 * @description:
 * @since: 03-Dec-23 9:54 PM
 * @version: 1.0
 */
@Entity
@Data
@Table(name="jpa_author")
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private   Long id;


    @Column(name = "name",nullable = false,length = 20)
    private String name;

    @OneToMany(mappedBy = "author",fetch = FetchType.EAGER)
    //级联保存，更新，删除，刷新，延迟加载，当删除用户，会级联删除用户所有的文章
    //拥有mappedBy 注解的实体类为关系被维护
    //mappedBy ="author", 中的  author 是Article 中的 author属性
    private List<Article> articleList;






}
