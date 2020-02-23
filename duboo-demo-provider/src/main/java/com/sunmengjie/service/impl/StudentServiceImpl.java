package com.sunmengjie.service.impl;

import com.sunmengjie.pojo.Student;
import com.sunmengjie.service.StudentService;

public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		
		Student stu = new Student();
		stu.setAge(20);
		stu.setId(id);
		stu.setName("张三"+id);
		
		return stu;
	}

	@Override
	public Student addAge(Student stu, int a) {
		
		//年龄增加
		stu.setAge(stu.getAge()+a);
		return stu;
	}

}
