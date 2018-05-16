package com.lw.task;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/task")
public class PrintInfoTask {

    @RequestMapping("/printInfo")
    @ResponseBody
    public void printInfo() {
        System.out.print("print info 2 s");
    }
}
