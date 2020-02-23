package com.sunmengjie;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sunmengjie.pojo.Student;
import com.sunmengjie.service.StudentService;

public class ConsumerStart {
	
	private static ClassPathXmlApplicationContext context;

	private static StudentService studentService;
	
	public static void main(String[] args) {
		
		 context = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		
		 studentService = context.getBean(StudentService.class);
		
		Student stu = studentService.getById(20);
		System.out.println("student is" +stu);
		
		Student addAge = studentService.addAge(stu, 3);
		
		System.out.println("增加年龄后的数据" + addAge);
	}
}
