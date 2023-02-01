package com.greedy.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

	public static void main(String[] args) {

		/* FileReader */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/com/greedy/section02/stream/testReader.txt");
			
//			int value;
//			while((value = fr.read()) != -1) {
//				System.out.print((char) value);
//			}
			
			char[] carr = new char[(int) new File("src/com/greedy/section02/stream/testReader.txt").length()];
			
			fr.read(carr);
			
			for(int i = 0; i < carr.length; i++) {
				System.out.print(carr[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
