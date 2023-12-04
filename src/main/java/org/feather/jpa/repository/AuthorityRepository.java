package org.feather.jpa.repository;

import org.feather.jpa.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.repository
 * @className: AuthorityRepository
 * @author: feather
 * @description:
 * @since: 04-Dec-23 9:07 PM
 * @version: 1.0
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority,Long> {
}
