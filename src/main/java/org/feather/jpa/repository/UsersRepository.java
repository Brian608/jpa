package org.feather.jpa.repository;

import org.feather.jpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.repository
 * @className: UsersRepository
 * @author: feather
 * @description:
 * @since: 04-Dec-23 9:06 PM
 * @version: 1.0
 */
@Repository
public interface UsersRepository  extends JpaRepository<Users,Long> {

}
