package ua.social.network.security;

import java.util.Collections;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.Getter;
import ua.social.network.entity.User;

/**
 * @author Mykola Yashchenko
 */
@Getter
public class SnUserDetails extends org.springframework.security.core.userdetails.User {

    private final String userId;

    public SnUserDetails(final User user) {
        super(user.getEmail(), user.getPassword(),
                Collections.singletonList(new SimpleGrantedAuthority(user.getRole().name())));

        this.userId = user.getId();
    }

}