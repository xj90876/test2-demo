package com.qf.service.impl;

import com.qf.dao.IStudentDao;
import com.qf.pojo.PageVo;
import com.qf.pojo.Student;
import com.qf.service.StudentService;
import com.qf.utils.PageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceimpl implements StudentService{
    @Autowired
    private IStudentDao dao;
    @Override
    public List<Student> findAll()  {
        try {
            return  dao.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int save(Student student) {
        try {
            return dao.saveStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int remove(Student student) {
        try {
            return dao.remove(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;


    }

    @Override
    public Student selectById(Student student) {
        try {
            return dao.selectById(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateStudent(Student student) {
        try {
            return dao.updateStudent(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }





    @Override
    public PageModel findStudentsByPage(int curNum) {
        int totalCount = 0;
        try {
            totalCount = dao.selectTatol();
            PageModel pm=new PageModel(curNum,totalCount,3);
            List<Student> list=dao.findStudentsByPage(pm.getStartIndex(),pm.getPageSize());
            pm.setList(list);
            pm.setUrl("students");
            return pm;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public PageModel findStudentByVo(String vo, int curNum) {

             int totalCount=0;
        try {

            totalCount = dao.selectByNameTatol(vo);
            PageModel pm=new PageModel(curNum,totalCount,3);
            List<Student> list=dao.selectByName(vo,pm.getStartIndex(),pm.getPageSize());
            pm.setList(list);
            pm.setUrl("search");
            return pm;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
