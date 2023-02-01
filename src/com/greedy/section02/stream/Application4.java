package com.greedy.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

	public static void main(String[] args) {

		/* FileWriter */
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("src/com/greedy/section02/stream/testWriter.txt");
			
			fw.write(97);
			fw.write('A');
			fw.write(new char[] {'a','p','p','l','e'});
			fw.write("우리나라 대한민국");
			
//			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
