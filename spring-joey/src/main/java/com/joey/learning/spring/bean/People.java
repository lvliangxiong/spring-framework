package com.joey.learning.spring.bean;

import org.springframework.stereotype.Repository;

/**
 * @author LiangxiongLyu
 * @version 1.0
 * @date 9/14/2020
 */
@Repository
public class People {
	private String name;
	private int age;

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public People() {
		this("Joey", 16);
		System.out.println("An instance of People created.");
	}

	@Override
	public String toString() {
		return "People{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
