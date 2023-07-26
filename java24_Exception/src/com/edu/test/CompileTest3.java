package com.edu.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading2{
	public void readFile(String filename) throws FileNotFoundException, IOException {
		FileReader reader = null; 
		try {
			reader = new FileReader(filename);
			System.out.println("1. 파일 O");
		} finally {
			reader.close();
		}
		
		
		System.out.println("2. FileReader API");
	}
}
public class CompileTest3 {

	public static void main(String[] args) throws Exception {  //던지면 main이 실행시키는 곳으로 날라간다 (JVM한테)
		FileReading2 fr = new FileReading2();                              //JVM 이 알아서 처리 

		fr.readFile("C:\\KB_EDU\\doc\\1일차.txt");
	
		System.out.println("3. readFile() calling...");
	}

}
