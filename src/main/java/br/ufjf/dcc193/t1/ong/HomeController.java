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
	@Autowired
    AtividadeRepository repAtividade;
    
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
    public String sedeCreate() {
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
    public ModelAndView membros(Long sedeid) {
        Sede sede = repSede.findById(sedeid).get();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("membros");
        mv.addObject("sede", sede);
        mv.addObject("membros", sede.getMembros());

        return mv;
    }

    @RequestMapping("membro-create")
    public ModelAndView membroCreate(Long sedeid) {
        Sede sede = repSede.findById(sedeid).get();

        ModelAndView mv = new ModelAndView();
        mv.addObject("sede", sede);
        mv.setViewName("membro-create");

        return mv;
    }

    @RequestMapping("membro-create-confirm")
    public String membroCreateConfirm(Long sedeid, Membro membro) {
        Sede sede = repSede.findById(sedeid).get();

		membro.setSede(sede);
        sede.getMembros().add(membro);
        
        repMembro.save(membro);

        return "redirect:membros?sedeid=" + sedeid;
    }

    @RequestMapping("membro-read")
    public ModelAndView membroRead(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro-read");
        mv.addObject("membro", repMembro.findById(id).get());

        return mv;
    }

    @RequestMapping("membro-update")
    public ModelAndView membroUpdate(Long id) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("membro-update");
        mv.addObject("membro", repMembro.findById(id).get());

        return mv;
    }

    @RequestMapping("membro-update-confirm")
    public String membroUpdateConfirm(Membro membro) {
        Membro oldMembro = repMembro.findById(membro.getId()).get();
        Long sedeid = oldMembro.getSede().getId();

        membro.setSede(oldMembro.getSede());
        repMembro.save(membro);

        return "redirect:membros?sedeid=" + sedeid;
    }

    @RequestMapping("membro-delete")
    public String membroDelete(Long id) {
        Membro membro = repMembro.findById(id).get();
        Long sedeid = membro.getSede().getId();
        repMembro.delete(membro);

        return "redirect:membros?sedeid=" + sedeid;
    }

    @RequestMapping("atividades")
    public ModelAndView atividades(Long sedeid) {
        Sede sede = repSede.findById(sedeid).get();

        ModelAndView mv = new ModelAndView();
        mv.setViewName("atividades");
        mv.addObject("sede", sede);
        mv.addObject("atividades", sede.getAtividades());
        // mv.addObject("atividades", repAtividade.findAll());

        return mv;
    }
}