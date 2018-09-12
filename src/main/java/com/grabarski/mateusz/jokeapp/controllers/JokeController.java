package com.grabarski.mateusz.jokeapp.controllers;

import com.grabarski.mateusz.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mateusz Grabarski on 12.09.2018.
 */
@Controller
public class JokeController {

    private final JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String call(Model model) {
        model.addAttribute("jokeAtr", jokeService.getJoke());
        return "joke";
    }
}