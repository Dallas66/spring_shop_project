package com.epam.rd.denis.springshop.managers;

import com.epam.rd.denis.springshop.entity.User;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "session", proxyMode = ScopedProxyMode.INTERFACES)
@Scope(value = "session",  proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserManager {


    private User currentUser;

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
