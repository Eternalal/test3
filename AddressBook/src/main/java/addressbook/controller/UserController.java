package addressbook.controller;

import addressbook.pojo.userPojo;
import addressbook.service.UserService;
import addressbook.service.impl.UserServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("findAllUser")
    public String findAllUser(Model model){
        List<userPojo> list = userService.findAllUser();
        model.addAttribute("user",list);
        return "user";
    }

    @RequestMapping("deleteById")
    public String deleteById(Integer id){
        userService.deleteById(id);
        return "redirect:/user/findAllUser";
    }

    @RequestMapping("insertUser")
    public String insertUser(){
        return "insertUser";
    }

    @RequestMapping("addUser")
    public String addUser(userPojo user){
        userService.addUser(user);
        return "redirect:/user/findAllUser";
    }

    @RequestMapping("findUser")
    public String findUser(Integer id,Model model){
        userPojo user = userService.findUser(id);
        model.addAttribute("findUser",user);
        return "update";
    }

    @RequestMapping("updateUser")
    public String updateUser(userPojo user){
        userService.updateUser(user);
        return "redirect:/user/findAllUser";
    }

    @RequestMapping("searchUser")
    public String searchUser(String name, Model model){
        if(name.equals("*")){return "redirect:/user/findAllUser";}else {
            userPojo user = userService.searchUser(name);
            model.addAttribute("searchUser", user);
            return "searchUser";
        }
    }
}
