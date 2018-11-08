package guru.springframework.jokesapp.controllers;

import guru.springframework.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokes;

    public JokeController(JokeService jokes) {
        this.jokes = jokes;
    }

    @RequestMapping({"/", ""})
    public String jokes(Model model) {
        model.addAttribute("joke", jokes.getRandomQuote());

        return "chucknorris";
    }
}
