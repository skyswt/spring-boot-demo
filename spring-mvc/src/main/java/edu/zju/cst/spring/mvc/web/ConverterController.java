package edu.zju.cst.spring.mvc.web;

import edu.zju.cst.spring.mvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ConverterController {

    @RequestMapping(value = "/convert", produces = {"application/x-wisely"}) //1
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj demoObj) {
        return demoObj;
    }
}
