package addressbook.service.impl;

import addressbook.dao.UserDao;
import addressbook.pojo.userPojo;
import addressbook.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<userPojo> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public int deleteById(Integer id) {
        return userDao.deleteById(id);
    }

    @Override
    public userPojo findUser(Integer id) {
        return userDao.findUser(id);
    }

    @Override
    public int updateUser(userPojo user) {
        return userDao.updateUser(user);
    }

    @Override
    public int addUser(userPojo user) {
        return userDao.addUser(user);
    }

    @Override
    public userPojo searchUser(String name) { return userDao.searchUser(name); }
}
