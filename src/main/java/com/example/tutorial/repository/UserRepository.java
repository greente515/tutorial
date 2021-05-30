/*
 * @(#)UserRepository.java 2021/05/29
 *
 * Copyright 2021 Won. All rights Reserved.
 * Won PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.example.tutorial.repository;

import com.example.tutorial.entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author won greente515@gmail.com
 * @since 2021/05/29
 */
public interface UserRepository  extends JpaRepository<User, Long> {
    @EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByUsername(String username);
}
