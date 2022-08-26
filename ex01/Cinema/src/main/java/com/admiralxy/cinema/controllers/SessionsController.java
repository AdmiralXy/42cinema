package com.admiralxy.cinema.controllers;

import com.admiralxy.cinema.dto.SessionDTO;
import com.admiralxy.cinema.services.interfaces.ISessionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("sessions")
public class SessionsController {

    private final ISessionsService sessionsService;

    @Autowired
    public SessionsController(ISessionsService sessionsService) {
        this.sessionsService = sessionsService;
    }

    @GetMapping
    public ModelAndView index(@ModelAttribute("model") ModelMap model) {
        model.addAttribute("sessions", SessionDTO.fromEntities(this.sessionsService.findAll()));
        return new ModelAndView("pages/sessions", model);
    }

    @ResponseBody
    @GetMapping("search")
    public ResponseEntity<?> search(@RequestParam("filmName") String filmName) {
        List<SessionDTO> sessions = SessionDTO.fromEntities(this.sessionsService.findByFilmTitle(filmName));
        return new ResponseEntity<>(sessions, HttpStatus.OK);
    }

    @GetMapping("session/{id}")
    public ModelAndView show(@PathVariable("id") int id, @ModelAttribute("model") ModelMap model) {
        model.addAttribute("session", this.sessionsService.findById(id));
        return new ModelAndView("pages/session", model);
    }
}
