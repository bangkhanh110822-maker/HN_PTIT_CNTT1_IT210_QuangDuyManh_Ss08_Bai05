package com.example.bai05_ss08.controller;

import com.example.bai05_ss08.model.TourDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tours")
public class TourController {

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("tourDto", new TourDto());
        return "create-tour";
    }

    @PostMapping("/create")
    public String createTour(@Valid @ModelAttribute("tourDto") TourDto tourDto,
                             BindingResult bindingResult,
                             Model model) {
        if (bindingResult.hasErrors()) {
            return "create-tour";
        }

        model.addAttribute("successMessage", "Tao moi tour thanh cong!");
        model.addAttribute("tourDto", new TourDto());
        return "create-tour";
    }
}
