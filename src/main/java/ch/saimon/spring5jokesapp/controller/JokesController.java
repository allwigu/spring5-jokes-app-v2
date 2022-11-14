package ch.saimon.spring5jokesapp.controller;

import ch.saimon.spring5jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    String getJoke(Model model) {
        model.addAttribute("joke", jokeService.tellJoke());
        return "jokes/index";
    }
}
