package br.ufjf.dcc193.t1.ong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;


/**
 * HomeController
 */
@Controller
public class HomeController {
    @RequestMapping("index")
    // public String home(@RequestParam String param) {
    public String home() {
        return "index";
    }
    
}