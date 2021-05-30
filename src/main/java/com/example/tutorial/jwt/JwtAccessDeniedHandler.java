/*
 * @(#)JwtAccessDeniedHandler.java 2021/05/29
 *
 * Copyright 2021 Won. All rights Reserved.
 * Won PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.example.tutorial.jwt;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author won greente515@gmail.com
 * @since 2021/05/29
 */

@Component
public class JwtAccessDeniedHandler implements AccessDeniedHandler {
    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException accessDeniedException) throws IOException {
        //필요한 권한이 없이 접근하려 할때 403
        response.sendError(HttpServletResponse.SC_FORBIDDEN);
    }
}
