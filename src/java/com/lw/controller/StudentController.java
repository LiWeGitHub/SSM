package com.lw.controller;

import com.lw.Biz.StudentBiz;
import com.lw.service.StudentRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentBiz studentBiz;
    @Autowired
    private StudentRedisService studentRedisService;

    @RequestMapping("/getStudentName")
    public ModelAndView getStudentName(ModelAndView mv, @RequestParam String id) {
        String name = this.studentBiz.getStudentById(Integer.parseInt(id));
        studentRedisService.put("hg", name);
        mv.addObject("studentName", name+"redis:"+ studentRedisService.get("hg"));
//        mv.addObject("studentName", name);
        mv.setViewName("index");
        return mv;
    }
}
