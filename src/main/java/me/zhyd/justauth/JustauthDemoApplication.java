package me.zhyd.justauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ControllerAdvice
@SpringBootApplication
public class JustauthDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JustauthDemoApplication.class, args);
    }

    @RequestMapping("")
    public ModelAndView index() {
        return new ModelAndView("index");
    }


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object handle(Throwable e) {
        e.printStackTrace();
        return e.getMessage();
    }

}
