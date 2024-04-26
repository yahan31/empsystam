package com.example.demo.Controller;

import java.math.BigDecimal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Dept2;
import com.example.demo.domain.Emp2;
import com.example.demo.domain.Emp2DTO;
import com.example.demo.repository.Dept2Repository;
import com.example.demo.repository.Emp2Repository;

@Controller
@RequestMapping("/query")
public class QueryController {

    private static final Logger log = LoggerFactory.getLogger(QueryController.class);

    @Autowired
    private Emp2Repository emp2Repository;

    @Autowired
    private Dept2Repository dept2Repository;

    @GetMapping("/form")
    public String form(Model model) {
        List<Dept2> allEpt = dept2Repository.findAll();
        Model attribute = model.addAttribute("list", allEpt);
        // System.out.println(allEpt);
        return "form";
    }

    @GetMapping("/fideallemp")
    public String findAllEmp(Model model,
            @RequestParam(value = "ename", defaultValue = "", required = false) String ename,
            @RequestParam(value = "sal", defaultValue = "", required = false) BigDecimal sal) {

        System.out.println("name:" + ename);
        log.info(ename);
        System.out.println("sal:" + sal);

        List<Emp2DTO> result = findStation(ename, sal);

        // List<Emp2DTO> resule=null;

        // if(!ename.isEmpty() && sal!=null){
        // resule = emp2Repository.findAllEmpByNameAndSalGreaterThan(ename, sal);

        // }else if(ename.isEmpty() || sal != null){
        // if( ename != null){
        // resule = emp2Repository.findAllEmpBySalGreaterThan(sal);
        // }
        // resule = emp2Repository.findAllEmpByName(ename);
        // }else{
        // resule = emp2Repository.findAllEmp();

        // // System.err.println(attribute);
        // };
        Model attribute = model.addAttribute("list", result);
        System.out.println("dd"+attribute);
        return "emp2";

    }

    private List<Emp2DTO> findStation(String ename, BigDecimal sal) {
        boolean isNameExist = !ename.isEmpty();
        boolean isSalExist = sal != null;
        List<Emp2DTO> result = null;

        if (isNameExist) {
            if (isSalExist) {
                result = emp2Repository.findAllEmpByNameAndSalGreaterThan(ename, sal);
            } else {
                result = emp2Repository.findAllEmpByName(ename);
            }
        } else {
            if (isSalExist) {
                result = emp2Repository.findAllEmpBySalGreaterThan(sal);

            } else {
                result = emp2Repository.findAllEmp();

            }
        }
        return result;

    }

    @GetMapping("/finddept")
    public String findDept(@RequestParam(value = "dname", defaultValue = "") String dname, Model model) {
        System.out.println("name" + dname);
        Dept2 byDname = dept2Repository.findByDname(dname);
        List<Emp2> geteList = byDname.geteList();
        Model attribute = model.addAttribute("dept", geteList);
        System.out.println(byDname);
        return "dept2";
    }

}
