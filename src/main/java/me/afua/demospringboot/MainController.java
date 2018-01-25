package me.afua.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String showIndex()
    {
        String userName="";
        Scanner keyboard = new Scanner(System.in);
        userName = keyboard.nextLine();
        String greet = "Hello "+userName;
        System.out.println(greet);

        return greet;
    }


    @RequestMapping("/getname")
    public String showWithName(@RequestParam("county") String name,@RequestParam("age") int age)
    {

        return name+" "+age;
    }


    @RequestMapping("/getothername")
    public String showWithName(HttpServletRequest param)
    {

        String withName = param.getParameter("yourname");
        if(withName==null)
            return "Just Hello";
        else return "Hello "+withName;
    }



}
