package com.greedy.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		
		
		File file = new File("src/com/greedy/section01/file/test.txt");
		
		try {
			boolean isCreated = file.createNewFile();
			
			System.out.println("isCreated : " + isCreated);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일의 크기 : " + file.length() + "byte");
		System.out.println("파일의 상대 경로 : " + file.getPath());
		System.out.println("파일의 상위 경로 : " + file.getParent());
		System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
		
		
		boolean isDeleted = file.delete();
		
		System.out.println("isDeleted : " + isDeleted);
		
	}

}
