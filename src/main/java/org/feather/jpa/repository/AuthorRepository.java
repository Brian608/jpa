package org.feather.jpa.repository;

import org.feather.jpa.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.repository
 * @className: AuthorRepository
 * @author: feather
 * @description:
 * @since: 03-Dec-23 10:07 PM
 * @version: 1.0
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
}
