package com.Lokesh.springboot.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    
     @RequestMapping(value="login",method = RequestMethod.GET)
    // @ResponseBody
    public String gotologin()
    {
        return "Login";
    }

     @RequestMapping(value="login",method = RequestMethod.POST)
    // @ResponseBody
    public String gotowelcome(@RequestParam String name,@RequestParam String password,ModelMap model)
    {
        System.out.println(name);
        System.out.println(password);
        return "Welcome";
    }
}
