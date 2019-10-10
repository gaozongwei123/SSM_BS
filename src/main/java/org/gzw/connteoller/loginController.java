package org.gzw.connteoller;

import org.gzw.entity.Admin;
import org.gzw.service.AdminSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/lo")
public class loginController {
    @Autowired
    private AdminSerice adminSerice;
    @RequestMapping("/logins")
    public String login(HttpSession httpSession,Admin admin){
        if (adminSerice.logionAdmin(admin)){
            httpSession.setAttribute("Admins",admin);
            return "index";

        }else {
            return "login";
        }
    }
    @RequestMapping("/Cancellation")
    public String loginCancellation(){
        return "login";
    }
}
