package com.epam.rd.denis.springshop.interceptors;

import com.epam.rd.denis.springshop.entity.User;
import com.epam.rd.denis.springshop.managers.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

@Component
public class UserInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    UserManager userManager;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        User user = userManager.getCurrentUser();

        if (Objects.isNull(user)) {
            response.sendRedirect("/autorization");
            return false;
        }

        return true;


    }
}
