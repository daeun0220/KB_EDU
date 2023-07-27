package com.edu.test;

import java.util.ArrayList;

import com.edu.child.Magazine;
import com.edu.exception.ISBNNotFoundException;
import com.edu.exception.QuantityException;
import com.edu.parent.Book;
import com.edu.service.BookServiceImpl;

public class BookTest {
	public static void main(String[] args) {
		BookServiceImpl service = BookServiceImpl.getInstance();
		
		
		service.add(new Book("21424", "Java Pro",15000,5));
		service.add(new Book("35355","�м�����",30000,3));
		service.add(new Book("35895","����Ÿ�м�",42000,7));
		service.add(new Magazine("35535", "ChatGPT_AI", 23000,0,2));
		service.add(new Magazine("66541", "Python",25000,3,3));
		service.add(new Magazine("77833", "JavaScript",13000,5,4));
		service.add(new Magazine("92020", "HTML/CSS",17000,2,7));
		service.add(new Magazine("18840", "Spring",15000,1,7));
		
	
		
		System.out.println("===========��ü ���� ���� ��� ���===========");
		ArrayList<Book> books = (ArrayList<Book>)service.search();
		for(Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("===========������ �ǸŵǾ� ��� ������ ���� ���===========");
		try {
			service.sell("21424", 3);			
		}catch(QuantityException e) {
			System.out.println(e.getMessage());
		}catch(ISBNNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		books = (ArrayList<Book>)service.search();
		for(Book book:books) {
			System.out.println(book);
		}
		System.out.println("===========������ ���ŵǾ� ��� ������ ���ϴ� ���===========");
		try {
			service.buy("21424", 10);			
		}catch(ISBNNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		books = (ArrayList<Book>)service.search();
		for(Book book:books) {
			System.out.println(book);
		}
		
		System.out.println("===========��� �������� ����*�ݾ��� �Ͽ� �� ��� �ݾ��� ����===========");
		System.out.format("�� ��� �ݾ��� :: %d", service.getTotalAmount());
		
		
		
		System.out.println("**********************************************");
		BookServiceImpl service2 = BookServiceImpl.getInstance();
		System.out.println("===========��ü ���� ���� ��� ���===========");
		ArrayList<Book> books1 = (ArrayList<Book>)service2.search();
		for(Book book:books1) {
			System.out.println(book);
		}
		
	}
}
