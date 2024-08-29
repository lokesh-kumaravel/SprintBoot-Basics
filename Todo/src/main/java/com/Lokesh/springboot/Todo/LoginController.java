package com.Lokesh.springboot.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
     @RequestMapping("login")
    // @ResponseBody
    public String gotologin(@RequestParam String name,ModelMap model)
    {
        model.addAttribute(name, model);
        System.out.println(name);
        return "Login";
    }
}
