package br.ufjf.dcc193.t1.ong;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * HomeController
 */
@Controller
public class HomeController {
	@Autowired
    SedeRepository repSede;
	@Autowired
    MembroRepository repMembro;
    
    @RequestMapping("index")
    public String home() {
        return "index";
    }
    
    @RequestMapping("sedes")
    public ModelAndView sede() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes");

        List<Sede> sedes = repSede.findAll();
        mv.addObject("sedes", sedes);
        return mv;
    }
    
    @RequestMapping("membros")
    public ModelAndView membros() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros");

        List<Membro> membros = repMembro.findAll();
        mv.addObject("membros", membros);
        return mv;
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