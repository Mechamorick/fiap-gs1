package com.github.gsc.globalsolution.controller;


import com.github.gsc.globalsolution.model.Peixe;
import com.github.gsc.globalsolution.repository.PeixeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import org.springframework.data.domain.Sort;

@Controller
public class IndexController {

    @Autowired
    private PeixeRepository peixeRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<Peixe> peixes = peixeRepository.findAll(Sort.by(Sort.Direction.ASC, "nome"));
        model.addAttribute("peixes", peixes);
        model.addAttribute("peixe", new Peixe());
        return "index";
    }
}

