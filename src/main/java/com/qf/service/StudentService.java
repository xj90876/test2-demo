package com.qf.service;

import com.qf.pojo.PageVo;
import com.qf.pojo.Student;
import com.qf.utils.PageModel;

import java.util.List;

public interface StudentService {
    List<Student> findAll() ;

    int save(Student student);

    int remove(Student student);

    Student selectById(Student student);

    int updateStudent(Student student);

    PageModel findStudentsByPage(int curNum);

    PageModel findStudentByVo(String vo, int curNum);
}
