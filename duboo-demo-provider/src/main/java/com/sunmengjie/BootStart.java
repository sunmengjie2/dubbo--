package com.sunmengjie;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动服务提供者
 * @author Administrator
 *
 */
public class BootStart {

	public static void main(String[] args) throws Exception {
		
		//加载配置文件
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//加载服务到容器
		classPathXmlApplicationContext.start();
		
		//加一个阻塞
		System.in.read();
	}
}
