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
			System.out.println("***��ӭ��½ѧ������ϵͳ***");
			System.out.println("**������������**");
			System.out.println("*1������ѧ��*");
			System.out.println("*2����ӡѧ����Ϣ*");
			System.out.println("*3����ѯ��Ϣ��Ϣ*");
			System.out.println("*4���˳�ϵͳ*");
			int action = CommonUtils.getScanner().nextInt();
			action(action);
			
		} while (flag);
	}

	private static void action(int action) {
		switch (action) {
		case 1:
			do {
				System.out.println("***��ʼ¼��***");
				System.out.println("**������ѧ���ı��**");
				String number = CommonUtils.getScanner().next();
				System.out.println("*������ѧ������*");
				String name = CommonUtils.getScanner().next();
				System.out.println("*������ѧ������*");
				int age = CommonUtils.getScanner().nextInt();
				System.out.println("*������ѧ���Ա�*");
				String gender = CommonUtils.getScanner().next();
				Student stu = new Student(name, age, gender.equals("��")?true:false, number);
				Store.getInstamce().add(stu);
				System.out.println("¼��ɹ�");
				System.out.println("***�Ƿ����¼�룿1���� 2����***");
				if(CommonUtils.getScanner().nextInt()==2){
					return;
				}
			} while (true);
		case 2:
			Store.getInstamce().printAll();
			break;
		case 3:
			System.out.println("������Ҫ����ѧ���ı��");
			String num = CommonUtils.getScanner().next();
			Student xs = Store.getInstamce().get(num);
			if (xs!=null) {
				System.out.println("��������ѧ����ѧ����Ϣ���£�");
				System.out.println(xs);
			}else {
				System.out.println("��ѧ��������");
			}
			break;
		case 4:
			flag = false;
			break;

		}
	}


	

}
