package com.qf.dao;

import com.qf.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudentDao {

    List<Student> selectAll()throws Exception;

    int saveStudent(Student student)throws Exception;

    int remove(Student student)throws Exception;

    Student selectById(Student student)throws Exception;

    int updateStudent(Student student)throws Exception;


    List<Student> selectByName(@Param("vo") String vo,@Param("startIndex") int startIndex, @Param("pageSize") int pageSize)throws Exception;

    int selectTatol()throws Exception;

    List<Student> findStudentsByPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize) throws Exception;

    int selectByNameTatol(@Param("vo") String vo);
}
