package com.wanmigaokong.util;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class XMLs {

	public static Document getDocFromStringXml(File file){
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		Document document = null;
		try {
			DocumentBuilder documentBuilder = factory.newDocumentBuilder();
			 document=documentBuilder.parse(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return document;
		
		
		
	}
}
