package tomas.webappkeycloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    
    @RequestMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("message", "Hello World");
        return "home";
    }

    @RequestMapping(value = "/secured")
    public String secured(Model model) {
        model.addAttribute("message", "Secure page");
        return "secured";
    }
}
