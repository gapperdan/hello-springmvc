package com.gap.hellospringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(@RequestParam(value = "name", required = false, defaultValue = "stranger") String name, ModelMap model) {
    /*
        Note: Alternately, you can also use this:
            public String printWelcome(String name, ModelMap model)
        This works only because the parameter name and the variable name happen to be the same; if they are not, then use the
        @RequestParam annotation.
    */
        model.addAttribute("message", "Spring 3 MVC Hello World");
        model.addAttribute("name", name);
        return "hello";
    }

    @RequestMapping(value="hello/goodbye", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Goodbye");
        return "goodbye";
    }

}