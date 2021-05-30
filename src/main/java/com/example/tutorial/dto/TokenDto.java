/*
 * @(#)TokenDto.java 2021/05/30
 *
 * Copyright 2021 Won. All rights Reserved.
 * Won PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.example.tutorial.dto;

import lombok.*;

/**
 * @author won greente515@gmail.com
 * @since 2021/05/30
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenDto {

    private String token;
}
