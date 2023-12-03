package org.feather.jpa.repository;

import org.feather.jpa.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.repository
 * @className: AccountRepository
 * @author: feather
 * @description:
 * @since: 03-Dec-23 9:32 PM
 * @version: 1.0
 */
@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

}
