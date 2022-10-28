package addressbook.service;

import addressbook.pojo.userPojo;

import java.util.List;

public interface UserService {
    List<userPojo> findAllUser();
    int deleteById(Integer id);
    userPojo findUser(Integer id);
    int updateUser(userPojo user);
    int addUser(userPojo user);

    userPojo searchUser(String name);
}
