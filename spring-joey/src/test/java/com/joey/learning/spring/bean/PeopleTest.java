package com.joey.learning.spring.bean;

import com.joey.learning.spring.config.Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author LiangxiongLyu
 * @version 1.0
 * @date 9/14/2020
 */
class PeopleTest {
	@Test
	void ioc() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		People peo = ac.getBean(People.class);
		System.out.println(peo);
	}
}