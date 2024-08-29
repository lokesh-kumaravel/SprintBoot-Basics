package com.Lokesh.springboot.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.ui.Model;

@Controller
public class LoginController {
    
     @RequestMapping(value="login",method = RequestMethod.GET)
    // @ResponseBody
    public String gotologin()
    {
        return "Login";
    }

    @PostMapping("login")
    public String gotowelcome(@RequestParam String name, @RequestParam String password, Model model) {
        System.out.println(name);
        System.out.println(password);
        return "Welcome";
    }
    //  @RequestMapping(value="login",method = RequestMethod.POST)
    // // @ResponseBody
    // public String gotowelcome(@RequestParam String name,@RequestParam String password,ModelMap model)
    // {
    //     model.put("name",name);
    //     model.put("password",password);
    //     return "Welcome";
    // }
}
