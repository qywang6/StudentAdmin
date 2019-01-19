package com.wqy.studentAdmin.entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.wqy.studentAdmin.util.ViewUtils;

public class Store {
	private static Store instance = new Store();
	private Map<String,Student> map;
	
	private Store(){
		map = new HashMap<String,Student>();
	}
	public void add(Student stu){
		map.put(stu.getNumber(),stu);
	}
	public Student get(String number){
		return map.get(number);
	}
	
	public static Store getInstamce(){
		return instance;
	}
	
	public void printAll(){
		Collection<Student> stus = map.values();
		Iterator<Student> it = stus.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			ViewUtils.sop(stu);
		}
	}
}
