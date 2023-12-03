package org.feather.jpa.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.entity
 * @className: Article
 * @author: feather
 * @description:
 * @since: 03-Dec-23 9:56 PM
 * @version: 1.0
 */
@ToString(exclude = {"author"})
@Entity
@Data
@Table(name="jpa_article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private   Long id;



    @Column(name = "title",nullable = false,length = 50)
    private String title;

    @Lob
    @Basic(fetch = FetchType.LAZY)//懒加载
    @Column(nullable = false)
    private String content;


    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.REFRESH},optional = false)// 可选择属性optional =false ，表示author 不能为空，删除文章，不影响用户
    @JoinColumn(name = "author_id")//设置article 表中的关联字段(外键)
    private Author author;
}
