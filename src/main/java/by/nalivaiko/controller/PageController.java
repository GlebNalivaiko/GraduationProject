package by.nalivaiko.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main")
@Slf4j
public class PageController {

    @GetMapping()
    public String getMainPage() {
        log.error("Error");
        return "page";
    }
}
