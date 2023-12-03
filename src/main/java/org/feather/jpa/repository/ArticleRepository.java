package org.feather.jpa.repository;

import org.feather.jpa.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.repository
 * @className: ArticleRepository
 * @author: feather
 * @description:
 * @since: 03-Dec-23 10:08 PM
 * @version: 1.0
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {

}
