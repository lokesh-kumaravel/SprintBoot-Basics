package com.Lokesh.springboot.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String SayHello()
    {
        return "Hello";
    }
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayhellohtml()
    {
        StringBuilder str = new StringBuilder();
        str.append("<html");
        str.append("<head>");
        str.append("<title>MyFirstApp</title>");
        str.append("</head");
        str.append("<Body><p>Hello World</p></Body>");
        str.append("</html");
        return str.toString();
    }

    @RequestMapping("say-hello-jsp")
    // @ResponseBody
    public String sayHellojsp()
    {
        return "SayHello";
    }
}