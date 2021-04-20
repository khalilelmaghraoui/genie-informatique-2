package com.ensah;


import com.ensah.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


//@RequestMapping("/Student")
@Controller
public class StudentController {
    // injection de dependance

    @Autowired
    private IStudentService service;



    @RequestMapping("/test")
    public String showMsg(){

        service.creat();

        // accede a la base de donne par example

        // on return un view
        return "hello";
    }

    @RequestMapping("showForm")
    public String ShowForm(Model model){
        Student student = new Student();
        student.setFirstName("khalil");
        student.setCne("m1313131");
        student.setEmail("khalil@gmail.com");
        student.setLastName("el maghraoui");
        student.setEmail("KHALIL@GMAIL.COM");

        model.addAttribute("student_Model",student);

        return "Form";
    }
    

    @RequestMapping("/addStudent")
    public String proces(@ModelAttribute("student_Model") Student student){

        System.out.println("add Student method ");
        return "test";
    }

}
