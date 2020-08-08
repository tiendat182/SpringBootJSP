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

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
        persons.add(new Person("Dat", "Luu"));
        persons.add(new Person("Phuong", "Luu"));
    }
    public void develop1(){

    }
    public void develop2(){

    }
}
