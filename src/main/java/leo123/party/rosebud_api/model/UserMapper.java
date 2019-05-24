package leo123.party.rosebud_api.model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import leo123.party.rosebud_api.model.User;

@Mapper
public interface UserMapper {
    int insert(@Param("user") User user);

    int insertSelective(@Param("user") User user);

    int insertList(@Param("users") List<User> users);

    int updateByPrimaryKeySelective(@Param("user") User user);
}
