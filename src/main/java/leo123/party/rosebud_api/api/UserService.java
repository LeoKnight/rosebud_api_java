package leo123.party.rosebud_api.api;

import java.util.List;
import leo123.party.rosebud_api.model.User;
public interface UserService{

    int insert(User user);

    int insertSelective(User user);

    int insertList(List<User> users);

    int updateByPrimaryKeySelective(User user);
}
