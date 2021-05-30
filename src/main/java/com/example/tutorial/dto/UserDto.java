/*
 * @(#)UserDto.java 2021/05/30
 *
 * Copyright 2021 Won. All rights Reserved.
 * Won PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.example.tutorial.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author won greente515@gmail.com
 * @since 2021/05/30
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotNull
    @Size(min = 3, max = 50)
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotNull
    @Size(min = 3, max = 100)
    private String password;

    @NotNull
    @Size(min = 3, max = 50)
    private String nickname;
}
