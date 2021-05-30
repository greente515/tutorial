/*
 * @(#)AuthorityRepository.java 2021/05/29
 *
 * Copyright 2021 Won. All rights Reserved.
 * Won PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.example.tutorial.repository;

import com.example.tutorial.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author won greente515@gmail.com
 * @since 2021/05/29
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
