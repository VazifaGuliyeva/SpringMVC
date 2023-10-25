package com.example.udemypro.controller;


import com.example.udemypro.model.data.Page;
import com.example.udemypro.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {

    @Autowired
    private  PageRepository pageRepository;


    @GetMapping()
    public String index(Model model){

        List<Page> pages=pageRepository.findAll();
        model.addAttribute("pages",pages);

        return "/admin/pages/index";
    }
    @GetMapping("/add")
    public String add(Model model){ //@ModelAtributes Page page parametr kimi verende xeta verdi

      model.addAttribute("page",new Page());

        return "/admin/pages/add";
    }
}
