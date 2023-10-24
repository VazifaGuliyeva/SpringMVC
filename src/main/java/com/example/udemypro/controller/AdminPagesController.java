package com.example.udemypro.controller;


import com.example.udemypro.model.data.Page;
import com.example.udemypro.repository.PageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/pages")
public class AdminPagesController {

    private final PageRepository pageRepository;

    public AdminPagesController(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }

    @GetMapping()
    public String index(Model model){

        List<Page> pages=pageRepository.findAll();
        model.addAttribute("pages",pages);

        return "/admin/pages/index";
    }
    @GetMapping("/add")
    public String add(){
        return "/admin/pages/add";
    }
}
