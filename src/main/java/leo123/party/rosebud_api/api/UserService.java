package leo123.party.rosebud_api.api;

import java.util.List;
import leo123.party.rosebud_api.model.User;
public interface UserService{

    int insert(User user);

    int insertSelective(User user);

    int insertList(List<User> users);

    User updateByPrimaryKeySelective(User user);

    List<User> findByName(String name);

    User findById(Long id);
}
