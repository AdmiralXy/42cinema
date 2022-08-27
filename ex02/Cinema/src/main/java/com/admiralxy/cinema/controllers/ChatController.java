package com.admiralxy.cinema.controllers;

import com.admiralxy.cinema.services.interfaces.IFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("films/{id}/chat")
public class ChatController {

    private final IFilmsService filmsService;

    @Autowired
    public ChatController(IFilmsService filmsService) {
        this.filmsService = filmsService;
    }

    @GetMapping
    public ModelAndView index(@PathVariable("id") Long id, @ModelAttribute("model") ModelMap model) {
        model.addAttribute("film", this.filmsService.findById(id));
        return new ModelAndView("pages/chat", model);
    }
}
