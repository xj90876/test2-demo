package com.qf.web;

import com.qf.pojo.Student;
import com.qf.service.StudentService;


import com.qf.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class StudentAction {
    @Autowired
    private StudentService ser;
  /*  @GetMapping("/students")
    public String selectAll(Model model){

        List<Student> list = ser.findAll();
       model.addAttribute("students",list);


        return "index";
    }*/
    @RequestMapping("/saveStudent")
    public String saveStudent(Student student){
        System.out.println("我被访问了");
        int i= ser.save(student);
        return "redirect:students";
    }
    @GetMapping("/delete")
    public String delete(Student student){
        int i=ser.remove(student);
        return "redirect:students";
    }
    @GetMapping("/toUpdate")
    @ResponseBody
    public Student toUpdate(Student student){
        System.out.println(student.getId());
        Student stu=ser.selectById(student);

        return stu;
    }

    @PostMapping("/updateStudent")
    public String updateStudent(Student student){

        int i=ser.updateStudent(student);
        return "redirect:students";
    }
    @GetMapping("/search")
    public String search(@RequestParam("Vo") String Vo,Model model,@RequestParam(defaultValue = "1")Integer num){
        System.out.println(Vo);
        int currentPage=3;
        int curNum=num;
        PageModel pm=ser.findStudentByVo(Vo,curNum);

        model.addAttribute("students",pm);
        return "index";
    }
    @RequestMapping("/students")
    public String Page(@RequestParam(defaultValue = "1") Integer num,Model model){

        int currentPage=3;
        int curNum=num;
        PageModel pm=ser.findStudentsByPage(curNum);
        model.addAttribute("students",pm);
        return "index";
    }
}
