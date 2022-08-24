package com.admiralxy.cinema.controllers;

import com.admiralxy.cinema.dto.FilmCreateDTO;
import com.admiralxy.cinema.services.interfaces.IFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin/panel/films")
public class FilmsController {

    private final IFilmsService filmsService;

    @Autowired
    public FilmsController(IFilmsService filmsService) {
        this.filmsService = filmsService;
    }

    @GetMapping
    public ModelAndView index(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("films", this.filmsService.findAll());
        return new ModelAndView("films", model);
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String create(@ModelAttribute("film") FilmCreateDTO film) {
        this.filmsService.save(film);
        return "redirect:/admin/panel/films";
    }
}
