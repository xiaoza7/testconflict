package com.bit.javassist;

/**
 * Created by tommy on 17/8/2.
 */
public class UserServiceImpl {

	public void getName(String userId) {
		System.out.println("代理方法中 ");
	}

	public String createUser(String name, int id) {
		System.out.println("name ");
		return name + id;
	}
	public String createUser2(String name2, int id2) {
		System.out.println("name2 ");
		return name2 + id2;
	}

}
