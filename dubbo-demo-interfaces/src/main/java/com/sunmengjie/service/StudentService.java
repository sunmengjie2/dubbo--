package com.sunmengjie.service;

import com.sunmengjie.pojo.Student;

/**
 * 
 * @author Administrator
 *
 */
public interface StudentService {

	//根据id获取学生
	Student getById(int id);
	
	//增加年龄
	Student addAge(Student stu,int a);
}
