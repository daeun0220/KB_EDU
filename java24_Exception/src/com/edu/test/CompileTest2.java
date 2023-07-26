package com.edu.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileReading{
	public void readFile(String filename) {
		FileReader reader = null;
		try {
			reader = new FileReader(filename);
			//이 부분에서 24/0 같은 코드가
			System.out.println("1.파일 O");
			
			//reader.close();  // 꼭 닫아야하는데 여기 있으면 그 전에 에러나면 문제가 생기므로 finally쪽에 담아야한다
		}catch(FileNotFoundException e) {
			System.out.println("1.파일 X");
		}catch(IOException e) {
			System.out.println("1.파일 X");
		}finally {
			try {
				reader.close();
			}catch (IOException e) {
				
			}
		}
		
		System.out.println("2. FileReader API");
	}
}
public class CompileTest2 {

	public static void main(String[] args) {
		FileReading fr = new FileReading();
		fr.readFile("C:\\KB_EDU\\doc\\1일차.txt");
		System.out.println("3. readFile() calling...");
	}

}
