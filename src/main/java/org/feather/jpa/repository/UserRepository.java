package org.feather.jpa.repository;

import org.feather.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.repository
 * @className: UserRepository
 * @author: feather
 * @description:
 * @since: 12-Nov-23 4:21 PM
 * @version: 1.0
 */
public interface UserRepository extends JpaRepository<User,Long> {

}
