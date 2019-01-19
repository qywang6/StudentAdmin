package com.wqy.studentAdmin.util;

import com.wqy.studentAdmin.entity.Store;
import com.wqy.studentAdmin.entity.Student;

public class ViewUtils {
	private static boolean flag = true;

	public static void sop(Object obj) {
		System.out.println(obj);
	}
	
	public static void start() {
		do {
			System.out.println("***欢迎登陆学生管理系统***");
			System.out.println("**请输入操作编号**");
			System.out.println("*1，增加学生*");
			System.out.println("*2，打印学生信息*");
			System.out.println("*3，查询信息信息*");
			System.out.println("*4，退出系统*");
			int action = CommonUtils.getScanner().nextInt();
			action(action);
			
		} while (flag);
	}

	private static void action(int action) {
		switch (action) {
		case 1:
			do {
				System.out.println("***开始录入***");
				System.out.println("**请输入学生的编号**");
				String number = CommonUtils.getScanner().next();
				System.out.println("*请输入学生姓名*");
				String name = CommonUtils.getScanner().next();
				System.out.println("*请输入学生年龄*");
				int age = CommonUtils.getScanner().nextInt();
				System.out.println("*请输入学生性别*");
				String gender = CommonUtils.getScanner().next();
				Student stu = new Student(name, age, gender.equals("男")?true:false, number);
				Store.getInstamce().add(stu);
				System.out.println("录入成功");
				System.out.println("***是否继续录入？1，是 2，否***");
				if(CommonUtils.getScanner().nextInt()==2){
					return;
				}
			} while (true);
		case 2:
			Store.getInstamce().printAll();
			break;
		case 3:
			System.out.println("请输入要搜索学生的编号");
			String num = CommonUtils.getScanner().next();
			Student xs = Store.getInstamce().get(num);
			if (xs!=null) {
				System.out.println("搜索到该学生，学生信息如下：");
				System.out.println(xs);
			}else {
				System.out.println("该学生不存在");
			}
			break;
		case 4:
			flag = false;
			break;

		}
	}


	

}
