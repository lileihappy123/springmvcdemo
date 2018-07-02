package springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mvc")
public class IndexController {

    @RequestMapping("/hello")
    @ResponseBody
    public String printHello() {
        return "hello wtf mvc";
    }
}
