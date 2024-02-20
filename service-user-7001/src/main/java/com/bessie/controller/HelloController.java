package com.bessie.controller;

import com.bessie.grace.result.JsonResult;
import com.bessie.pojo.test.Stu;
import com.bessie.service.StuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("u")
@Slf4j
public class HelloController {

    @Autowired
    private StuService stuService;

    @GetMapping("stu")
    public Object stu()
    {
        com.bessie.pojo.Stu stu = new com.bessie.pojo.Stu();
        stu.setAge(19);
        stu.setId("1009");
        stu.setName("bessie");

        stuService.save(stu);

        return "Hello Bessie Stu~~~";
    }
    @GetMapping("hello")
    public Object Hello()
    {
        Stu stu = new Stu(1001, "bessie", 18);
        System.out.println(stu.toString());
        log.info("info" + stu.toString());
        log.debug("debug" + stu.toString());
        log.warn("warn" + stu.toString());
        log.error("error : {}" , stu.toString());

        return "Hello Bessie UserService~~~";
    }

    @GetMapping("hello2")
    public JsonResult Hello2()
    {
        Stu stu = new Stu(1001, "imooc", 18);
        return JsonResult.ok(stu);
//        return JsonResult.ok("successfully added.");
//        return JsonResult.errorMsg("Error, please contact the administrator.");
    }
}
