package com.example.songr.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FormController {
    @GetMapping("/form")
    public String getIndexPage(){
        return "form.html";
    }
}
