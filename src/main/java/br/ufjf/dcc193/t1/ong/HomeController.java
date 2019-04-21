package br.ufjf.dcc193.t1.ong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * HomeController
 */
@Controller
public class HomeController {
    @RequestMapping("index")
    public String home() {
        return "index";
    }
    
    @RequestMapping("sede")
    public ModelAndView sede(Sede sede) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede");
        mv.addObject("sede", sede);
        return mv;
    }
    
    @RequestMapping("membro")
    public ModelAndView membro(Membro membro) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro");
        mv.addObject("membro", membro);
        return mv;
    }
}