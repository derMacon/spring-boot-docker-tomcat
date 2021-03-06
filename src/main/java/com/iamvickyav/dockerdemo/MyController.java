package com.iamvickyav.dockerdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @RequestMapping(value = "/index")
    public String hello(Model model, @RequestParam(value="name") String name) {
        model.addAttribute("name", name);
        return "index";
    }
}


