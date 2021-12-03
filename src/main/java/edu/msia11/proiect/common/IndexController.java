package edu.msia11.proiect.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"/", "/home"})
    public String navigateIndex() {
        return "index";
    }
}