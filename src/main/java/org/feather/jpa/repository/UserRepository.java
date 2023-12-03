package org.feather.jpa.repository;

import org.feather.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.repository
 * @className: UserRepository
 * @author: feather
 * @description:
 * @since: 12-Nov-23 4:21 PM
 * @version: 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findAllByName(String name);

    List<User> findAllByNameLikeAndPasswordLike(String name,String password);

}
