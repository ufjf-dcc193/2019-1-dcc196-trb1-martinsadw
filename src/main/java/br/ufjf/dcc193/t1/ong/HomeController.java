package br.ufjf.dcc193.t1.ong;

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
    public ModelAndView sedes() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sedes");
        mv.addObject("sedes", repSede.findAll());

        return mv;
    }

    @RequestMapping("sede-create")
    public String sedeCreate(Long id) {
        return "sede-create";
    }

    @RequestMapping("sede-create-confirm")
    public String sedeCreateConfirm(Sede sede) {
        repSede.save(sede);

        return "redirect:sedes";
    }

    @RequestMapping("sede-read")
    public ModelAndView sedeRead(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede-read");
        mv.addObject("sede", repSede.findById(id).get());

        return mv;
    }

    @RequestMapping("sede-update")
    public ModelAndView sedeUpdate(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("sede-update");
        mv.addObject("sede", repSede.findById(id).get());

        return mv;
    }

    @RequestMapping("sede-update-confirm")
    public String sedeUpdateConfirm(Sede sede) {
        repSede.save(sede);

        return "redirect:sedes";
    }

    @RequestMapping("sede-delete")
    public String sedeDelete(Long id) {
		repSede.deleteById(id);

        return "redirect:sedes";
    }

    @RequestMapping("membros")
    public ModelAndView membros() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros");
        mv.addObject("membros", repMembro.findAll());

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