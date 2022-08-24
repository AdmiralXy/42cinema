package com.admiralxy.cinema.controllers;

import com.admiralxy.cinema.services.interfaces.IFilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/panel/")
public class TestController {

    @GetMapping("sessions")
    public String sessions(@ModelAttribute("model") ModelMap model) {
        return "sessions";
    }

    @GetMapping("halls")
    public String halls(@ModelAttribute("model") ModelMap model) {
        return "halls";
    }

    @GetMapping("chat")
    public String chat(@ModelAttribute("model") ModelMap model) {
        return "chat";
    }

    @GetMapping("session")
    public String session(@ModelAttribute("model") ModelMap model) {
        return "session";
    }
}
