package com.example.demo.repository;

import com.example.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TODO ArMotozov
 *
 * @since 11/26/2022
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
