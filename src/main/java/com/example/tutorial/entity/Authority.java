/*
 * @(#)Authority.java 2021/05/30
 *
 * Copyright 2021 Won. All rights Reserved.
 * Won PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.example.tutorial.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author won greente515@gmail.com
 * @since 2021/05/30
 */

@Entity
@Table(name = "authority")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Authority {

    @Id
    @Column(name = "authority_name", length = 50)
    private String authorityName;
}
