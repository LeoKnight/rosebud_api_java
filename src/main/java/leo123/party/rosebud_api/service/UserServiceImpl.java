package leo123.party.rosebud_api.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import leo123.party.rosebud_api.model.User;
import leo123.party.rosebud_api.model.UserMapper;
import leo123.party.rosebud_api.api.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User user){
        return userMapper.insert(user);
    }

    @Override
    public int insertSelective(User user){
        return userMapper.insertSelective(user);
    }

    @Override
    public int insertList(List<User> users){
        return userMapper.insertList(users);
    }

    @Override
    public int updateByPrimaryKeySelective(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
