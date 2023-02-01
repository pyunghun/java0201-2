package com.greedy.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {

		/* FileOutputStream */
		
		FileOutputStream fout = null;
		
		try {
			/* 대상 파일이 존재하지 않으면 파일을 자동으로 생성한다. */
			fout = new FileOutputStream("src/com/greedy/section02/stream/testOutputStream.txt");
		
			fout.write(97);
			
			byte[] bar = new byte[] {98,99,100,101,102,10};
			fout.write(bar);
			
			fout.write(bar, 1, 3);
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		}
	}

}
