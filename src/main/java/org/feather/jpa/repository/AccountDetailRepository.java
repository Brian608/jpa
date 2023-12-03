package org.feather.jpa.repository;

import org.feather.jpa.entity.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @projectName: jpa
 * @package: org.feather.jpa.repository
 * @className: AccountDetailRepository
 * @author: feather
 * @description:
 * @since: 03-Dec-23 9:33 PM
 * @version: 1.0
 */
@Repository
public interface AccountDetailRepository  extends JpaRepository<AccountDetail,Long> {
}
