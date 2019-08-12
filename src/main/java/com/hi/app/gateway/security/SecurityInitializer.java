package hi.app.gateway.security;

import hi.app.gateway.conf.RedisConfig;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {

    public SecurityInitializer() {
        super(SecurityConfig.class, RedisConfig.class);
    }
}

