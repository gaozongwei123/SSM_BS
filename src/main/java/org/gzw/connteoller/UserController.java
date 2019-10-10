package org.gzw.connteoller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.gzw.entity.Admin;
import org.gzw.entity.User;
import org.gzw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userlist")
    public String userlist(@RequestParam(value = "pn",defaultValue = "1") Integer pn,Model model){

        //引入pagehelper分页插件
        //传入的页码，和每页的个数
        // startPage紧跟的查询就是分页查询
        PageHelper.startPage(pn,3);
        List<User> userList = userService.userfinall();
       //连续显示5页
        model.addAttribute("list",userList);
        PageInfo emps =new PageInfo(userList,5);
      model.addAttribute("lists",emps);

        return "userlist";
    }

    @RequestMapping("/admin")
    public String quall(Model model){
        return "index";
    }


    @RequestMapping(value = "/users/{uid}",method = RequestMethod.GET)
    public String memberfall(@PathVariable("uid") int uid, Model model){

        User user=this.userService.Userbyid(uid);

        model.addAttribute("user",user);

        return "member-fall";
    }
    @RequestMapping("/update/{uid}")
    public String updatea(@PathVariable("uid") int uid,Model model){
        User user=this.userService.Userbyid(uid);

        model.addAttribute("user",user);
        return "member-edit";
    }

    @RequestMapping(value = "/updates",method =RequestMethod.POST)
    public String updates(User user){

        System.out.println(user);
        userService.updateUser(user);
        return "redirect:/user/userlist";
    }
    @RequestMapping("/adds")
    public String adds(){

        return "member-add";
    }

    @RequestMapping(value = "/add",method =RequestMethod.POST)
    public String add(User user){

        System.out.println(user);
        userService.inserUser(user);
        return "redirect:/user/userlist";
    }
    @RequestMapping(value = "/delete/{uid}")
    public String delete(@PathVariable("uid") int uid){
        userService.deleUser(uid);
        return "redirect:/user/userlist";
    }





}
