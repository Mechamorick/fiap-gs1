package com.github.gsc.globalsolution.controller;

import com.github.gsc.globalsolution.model.Peixe;
import com.github.gsc.globalsolution.repository.PeixeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.data.domain.Sort;

@Controller
@RequestMapping("/peixes")
public class PeixeController {

    @Autowired
    private PeixeRepository peixeRepository;

    @PostMapping
    public String save(@ModelAttribute Peixe peixe) {
        peixeRepository.save(peixe);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Peixe peixe = peixeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid peixe Id:" + id));
        model.addAttribute("peixe", peixe);
        return "index"; // Redirecionar para a página principal
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, @ModelAttribute Peixe peixe) {
        peixeRepository.save(peixe);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        Peixe peixe = peixeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid peixe Id:" + id));
        peixeRepository.delete(peixe);
        return "redirect:/";
    }
}

