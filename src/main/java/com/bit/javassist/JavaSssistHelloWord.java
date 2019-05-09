package com.bit.javassist;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.LoaderClassPath;
import javassist.NotFoundException;

// ssist
public class JavaSssistHelloWord {

	public static void main(String[] args) throws NotFoundException, CannotCompileException, InstantiationException, IllegalAccessException {
		ClassPool pool = new ClassPool(true);
		//pool.i
		// 类池插入类路径
		pool.insertClassPath(new LoaderClassPath(JavaSssistHelloWord.class
				.getClassLoader()));
		// 创建类
		CtClass targetClass = pool.makeClass("com.test.hello");
		// 添加接口
		targetClass.addInterface(pool.get(IHello.class.getName()));
		CtClass returnType=pool.get(void.class.getName());
		String mname="sayHello";
		CtClass[] parameters=new CtClass[]{pool.get(String.class.getName())};
		CtMethod method=new CtMethod(returnType, mname, parameters, targetClass);
		
		
		String src="{"
				+ "System.out.println($1);"
				+"int i=System.nanoTime();"
				+"System.out.println(i);"
				+ "System.out.println($args.toString());"
//				+ "System.out.println($r+\"\");"
//				+ "System.out.println($type.toString())"
//				+ "System.out.println($class.toString())"
				+ "System.out.println(\"hello \"+$1);"
				+ "}";
		method.setBody(src);
		targetClass.addMethod(method);
		
		Class cla = targetClass.toClass();
		IHello hello = (IHello) cla.newInstance();
		hello.sayHello("try javaassit");

	}

	public interface IHello {
		public void sayHello(String name);
	}
}
