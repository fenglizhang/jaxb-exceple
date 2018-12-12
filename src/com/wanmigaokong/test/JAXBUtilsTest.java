package com.wanmigaokong.test;

import java.io.File;

import com.wanmigaokong.bo.Student;
import com.wanmigaokong.util.JAXBUtils;
import com.wanmigaokong.util.XMLs;

public class JAXBUtilsTest {
	public static void main(String[] args) {
		File file = new File("F:/testFile/student.xml");
		Student stu = (Student) JAXBUtils.documentToModel(new Student(),
				XMLs.getDocFromStringXml(file));
		System.out.println(stu.getAddress()+"  "+stu.getAge()+" "+stu.getName()) ;
	}
}
