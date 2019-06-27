package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author <a href="mailto:davidm@yambay.com">David MacDonald</a>
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String userName);
}
