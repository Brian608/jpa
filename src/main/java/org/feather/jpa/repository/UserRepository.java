package org.feather.jpa.repository;

import org.feather.jpa.entity.User;
import org.feather.jpa.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
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

    /**
     * 从实体类中查询，而不是表
     * @return
     */
    @Query(" select u from  User u")
    List<User>  findAllUser();


    @Query(" select u from  User u where u.name ='feather'")
    List<User>  findAllUserByName();


    @Query(" select u.id from  User u")
    List<Long>  findAllUser2();


    @Query(" select u.id ,u.name from  User u")
    List<Object> findAllUser3();


    /**
     * 修改数据一定加   @Modifying
     * @param name
     * @param id
     * @return
     */
    @Transactional
    @Modifying
    @Query("update  User  set name=?1 where id=?2")
    int  updateNameById(String name,Long id);



    @Transactional
    @Modifying
    @Query(value = "update  jpa_user u  set u.name=?1 where u.id=?2",nativeQuery = true)
    int  updateNameById2(String name,Long id);











}
