package hi.app.gateway.dao;

import hi.app.gateway.vo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends SqlMapper<User>{

    User findByUsername(String username);
}
