package com.wanmigaokong.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;

public class IOUtils {

	public static long copyLarge(Reader input,Writer output,char [] buffer) throws IOException{
		long count=0;
		int n=0;
		while(-1 !=(n = input.read(buffer))){
			output.write(buffer, 0, n);
			count +=n;
		}
		return count;
	}
	
	public static long copyLarge(Reader input,Writer output) throws IOException{
		return copyLarge(input, output, new char[4096]);
	}
	
	public static int copy(Reader input,Writer output) throws IOException{
		long count=copyLarge(input,output);
		if(count > Integer.MAX_VALUE){
			return -1;
		}
		return (int)count;
	}
	
	public static void copy(InputStream input,Writer output) throws IOException{
		InputStreamReader in=new InputStreamReader(input,"UTF-8");
		copy(in,output);
	}
	
	public static String toString(InputStream input) throws IOException{
		Writer sw=new StringWriter();
		copy(input,sw);
		return sw.toString();
	}



}
