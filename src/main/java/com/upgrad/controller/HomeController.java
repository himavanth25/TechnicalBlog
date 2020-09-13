package com.upgrad.controller;

import com.upgrad.model.Post;
import com.upgrad.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class HomeController {
    public HomeController(){
        System.out.println("***Home Controller is called. ***");
    }

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String getAllPosts(Model model) {

        ArrayList<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "index";
    }

    @RequestMapping(value = "/sayHello")
    @ResponseBody
    public String getString() {
        return "Hello";
    }

}