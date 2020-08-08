package org.o7planning.sbjsp.controller;

import org.o7planning.sbjsp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/*
 * author: DatLT
 */
@Controller
public class MainController {
    private static List<Person> persons = new ArrayList<Person>();
//develop
    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    ///develop
    @RequestMapping(value = { "/", "/index" }, method = Reque
            stMethod.GET)
    public String index(Model model) {

        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message", message);

        return "index";
    }

    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {
        model.addAttribute("develop", persons);//for Develop branch
        model.addAttribute("persons", persons);

        return "personList";
    }

    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPerson(Model model) {
        model.addAttribute("persons2", persons);// new code
        model.addAttribute("persons", persons);

        return "personList";
    }
    // Develop
    // new comment
    public String viewDevelop(Model model) {// new code

        model.addAttribute("persons", persons);

        return "personList";
    }
}
