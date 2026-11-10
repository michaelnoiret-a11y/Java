// package com.example.demo2.controller;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;

// @Controller
// public class ViewController {

//     @GetMapping("/view")
//     public String view() {
//         return "view";
//     }
// }

package com.example.demo2.controller;

import com.example.demo2.model.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ViewController {

    @GetMapping("/view")
    public String view(Model model) {

        List<Game> games = List.of(
            new Game("Minecraft", 29.99),
            new Game("The Witcher 3", 39.99),
            new Game("Cyberpunk 2077", 49.99)
        );

        model.addAttribute("games", games);

        return "view";
    }
        @PostMapping("/welcome")
        public String welcome(@RequestParam("username") String username, Model model) {

        model.addAttribute("message", "Bienvenue " + username + " !");

        return "view";
        
        }
    }