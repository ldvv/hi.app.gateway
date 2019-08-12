package hi.app.gateway.service;

import hi.app.gateway.vo.User;

import java.util.Map;

public interface IUserService{

    Map<String, String> login(User user);

    User selectByPrimaryKey(String id);
}
