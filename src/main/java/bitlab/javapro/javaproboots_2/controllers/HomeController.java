package bitlab.javapro.javaproboots_2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/indexpage")
    public String index(){
        return "indexpage";
    }

    @GetMapping(value = "/sport")
    public String sport(){
        return "sport";
    }

    @GetMapping(value = "/cinema")
    public String cinema(){
        return "cinema";
    }

    @GetMapping(value = "/home")
    public String home(){
        return "home";
    }

}
