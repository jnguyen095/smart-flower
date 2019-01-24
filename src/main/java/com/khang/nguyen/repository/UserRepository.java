package com.khang.nguyen.repository;

import com.khang.nguyen.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Khang Nguyen.
 * Email: khang.nguyen@banvien.com
 * Date: 08/01/2019
 * Time: 3:49 PM
 */
public interface UserRepository extends JpaRepository<Users, Long>, JpaSpecificationExecutor<Users> {
}
