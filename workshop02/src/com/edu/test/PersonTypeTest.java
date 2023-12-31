package com.edu.test;
import java.util.Scanner;

/*
 <<입력 Data Sample >>
 6
 1 4 4 4 5 3
 
 */
public class PersonTypeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("Sample Data Input >>> ");
		  int person = sc.nextInt();

		  int[] type = new int[person];
		  
		  for(int i = 0; i < person; i++) {
			  type[i] = sc.nextInt();
		  }
		  
		  int one = 0; int two = 0; int three = 0; int four = 0; int five = 0;
		  for(int i : type) {
			  if (i == 1) {
				  one += 1;
			  }
			  else if (i == 2) {
				  two += 1;
			  }
			  else if (i == 3) {
				  three += 1;
			  }
			  else if (i == 4) {
				  four += 1;
			  }
			  else if (i == 5) {
				  five += 1;
			  }
		  }
		  
		  int[] ans = { one, two, three, four, five};
		  int max = ans[0];
		  int answer = 0;
		  
		  for(int i : ans) {
			  if (ans[i] > max) {
				  max = ans[i];
				  answer = i + 1;
			  }
		  }
	
		  
		  System.out.println("가장 많은 타입의 유형은 "+answer+" 타입입니다.!!");
		  
		 }
		}