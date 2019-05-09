package com.bit.javassist;

/**
 * Created by tommy on 17/8/2.
 */
public class UserServiceImpl {

	public void getName(String userId) {
		System.out.println("浠ｇ悊鏂规硶涓� ");
	}

	public String createUser(String name, int id) {
		System.out.println("name ");
		return name + id;
	}
	public String createUser1(String name1, int id1) {
		System.out.println("name1 ");
		return name1 + id1;
	}
	

}
