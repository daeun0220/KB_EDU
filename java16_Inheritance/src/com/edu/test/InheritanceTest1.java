package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.util.MyDate;

public class InheritanceTest1 {

	public static void main(String[] args) {
		Manager m = new Manager("James", new MyDate(1990, 1, 1), 40000.0, "IT");
		
		System.out.println(m.getDetails());
		
		Engineer e = new Engineer("EEE", new MyDate(1992, 9, 1), 50000.0, "Back-End", 500);
		
		Secretary s = new Secretary("James", new MyDate(1990, 1, 1), 40000.0, "BB");
	}

}
