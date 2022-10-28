package addressbook.dao;

import addressbook.pojo.userPojo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select id,name,phone,address from p_user")
    List<userPojo>findAllUser();

    @Delete("delete from p_user where id = #{id}")
    int deleteById(Integer id);

    @Update("update p_user set name=#{name} , phone=#{phone} , address=#{address} where id=#{id}")
    int updateUser(userPojo user);

    @Select("select id,name,phone,address from p_user where id=#{id}")
    userPojo findUser(Integer id);

    @Insert("insert into p_user(name,phone,address ) value (#{name},#{phone},#{address})")
    int addUser(userPojo user);

    @Select("select id,name,phone,address from p_user where name=#{name}")
    userPojo searchUser(String name);

}
