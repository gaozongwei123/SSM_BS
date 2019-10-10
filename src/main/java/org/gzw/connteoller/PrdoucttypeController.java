package org.gzw.connteoller;

import org.gzw.entity.Classifybrand;
import org.gzw.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/Prdoucttype")
public class PrdoucttypeController {
    @Autowired
    private ClassifybranSerce classifybranSerce;

    @Autowired
    private ClassmemoryService classmemoryService;

    @Autowired
    private ClassprocessorService classprocessorService;

    @Autowired
    private ClassrunningmemoryService classrunningmemoryService;
    @Autowired
    private ClasssomatotypeService classsomatotypeService;
    @RequestMapping("/yemian")
    public String yemian(Model model){
        return "classtype-list";
    }

    @RequestMapping("/Classifybran")
    public String ClassifybranSerce(Model model){
        List<Classifybrand> classifybrandfinall = classifybranSerce.Classifybrandfinall();
        model.addAttribute("classify",classifybrandfinall);
        return "classifybran-list";
    }
    @RequestMapping("/Classifybranselect")
    public  String Classifybranselect(@RequestParam("brand_id") int brand_id,Model model){
        System.out.println("----------------------------------------");
        Classifybrand classifybrandfinbyid = classifybranSerce.Classifybrandfinbyid(brand_id);
        model.addAttribute("classifybrand",classifybrandfinbyid);
        return "classifybran-fall";
    }
    @RequestMapping("/Classifybranupdate")
    public  String Classifybranupdate(@RequestParam("brand_id") int brand_id,Model model){
        Classifybrand classifybrandfinbyid = classifybranSerce.Classifybrandfinbyid(brand_id);
        model.addAttribute("classifybrand",classifybrandfinbyid);
        return "classifybran-update";
    }
    @RequestMapping("/Classifybranupdates")
    public  String Classifybranupdates(@RequestParam("classifybrand") Classifybrand classifybrand,Model model){
        classifybranSerce.updateClassifybrand(classifybrand);

        return "classifybran-list";
    }
    @RequestMapping("/Classifybranadd")
public String Classifybranadd(@RequestParam("classifybrand") Classifybrand classifybrand,Model model){
        classifybranSerce.insertClassifybrand(classifybrand);
        return  "classifybran-list";
}
    @RequestMapping("/Classifybrandelete")
    public String Classifybrandelete(@RequestParam("brand_id") int brand_id,Model model){
        classifybranSerce.deleClassifybrand(brand_id);
        return  "classifybran-list";
    }

}
