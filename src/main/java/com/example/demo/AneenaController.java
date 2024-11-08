package com.example.demo;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/home")
public class AneenaController extends HttpServlet {
    @GetMapping("/aneena")
    @ResponseBody
    public String tell() {

        return "this is my home page !!!Hoorayy!!";
    }
    @GetMapping("/thasneem")
            public String colors(HttpServletRequest request ,Model model)
    {
        HttpSession session = request.getSession();
        session.setAttribute("username", "Aneena");
        List<String> list= Arrays.asList("Sabitha","Asna","ibrahim");
        model.addAttribute("fam",list);
        return "familylist";
    }

}

