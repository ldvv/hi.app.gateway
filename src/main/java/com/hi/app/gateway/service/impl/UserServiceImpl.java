package hi.app.gateway.service.impl;

import hi.app.gateway.dao.IUserDao;
import hi.app.gateway.service.IUserService;
import hi.app.gateway.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao iUserDao;

    @Override
    public Map<String, String> login(User user) {
        Map<String, String> result = new HashMap<>();
        result.put("code", "200");
        result.put("message", "success");
        return result;
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return iUserDao.selectByPrimaryKey(id);
    }
}
