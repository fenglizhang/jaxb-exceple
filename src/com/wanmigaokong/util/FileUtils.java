package com.wanmigaokong.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileUtils {
	public static FileInputStream openInputStream(File file) throws IOException{
		if(file.exists()){
			if(file.isDirectory()){
				throw new IOException("File '"+file+"' exists but is a directory");
			}
			if(file.canRead() ==false){
				throw new IOException("File '"+file+"'cannot be read");
			}
			
		}else{
			throw new FileNotFoundException("File'"+file+"'does not exists");
		}
		return new FileInputStream(file);
	}
	
	
	
	public static String readFileToString(File file){
		InputStream in=null;
		try {
			in=openInputStream(file);
			return IOUtils.toString(in);
		} catch (IOException e) {
			return null;
		}
	}
	
	
	
	
}
