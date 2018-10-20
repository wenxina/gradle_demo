package com.example.demo;

import com.example.hl.mybatis.dao.UsersMapper;
import com.example.hl.mybatis.entity.Users;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication//启动注解
@EnableTransactionManagement//开启事务管理
@RestController//控制层注解
@MapperScan("com.example.hl.mybatis.dao")//扫描dao层
@ComponentScan("com.example.hl")//扫描组件
public class DemoApplication {

	@Autowired
	private UsersMapper usersMapper;

	@RequestMapping(value = "test1.do")
	public ModelAndView test1(){
		ModelAndView modelAndView = new ModelAndView("index.jsp");
		System.out.println("test1 is do......");
		return modelAndView;
	}

	@RequestMapping(value = "user.do")
	public Users user(){
		System.out.println("user is do......");
		return usersMapper.selectByPrimaryKey(24);
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
