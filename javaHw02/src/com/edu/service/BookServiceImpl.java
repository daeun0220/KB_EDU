package com.edu.service;

import java.util.ArrayList;
import java.util.List;

import com.edu.exception.ISBNNotFoundException;
import com.edu.exception.QuantityException;
import com.edu.parent.Book;

public class BookServiceImpl implements BookService {
	private ArrayList<Book> list;
	
	private static BookServiceImpl mgr = new BookServiceImpl();

	private BookServiceImpl() {
		System.out.println("생성자 호출");
		list = new ArrayList<Book>();
	
	}
	public static BookServiceImpl getInstance() {
		return mgr;
	}

	@Override
	public void add(Book b) {  
		//리스트에 book을 추가
		list.add(b);
	}

	@Override
	public List<Book> search() {
		List<Book> books = new ArrayList<>();
		for(Book b : list) {
			books.add(b);
		}
		return books;
	}

	@Override
	public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException {
			/*
			   1.팔려는 책이 있지만 재고가 부족하다면 QuantityException 예외를 발생
			   2.팔려는 책이 있고 재고도 넉넉하다면 기존의 수량을 업데이트함
			   3.팔려는 책의 isbn을 발견하지 못하면 ISBNNotFoundException 예외를 발생
			*/
		boolean find = false;
		for(Book b : list) {
			if(b.getIsbn()==isbn & b.getQuantity()>=quantity) {
				b.setQuantity(b.getQuantity()-quantity);
				find = true;
				break;
			}
			else if(b.getIsbn()==isbn & b.getQuantity()<quantity) {
				find = true;
				throw new QuantityException();
			}
		}
		if(find == false) {
			throw new ISBNNotFoundException();
		}
			
	}

	@Override
	public void buy(String isbn, int quantity) throws ISBNNotFoundException{
		/*
		  1. 구매하려는 isbn을 찾을수 없으면 ISBNNotFoundException 예외를 발생
		  2. 구매하려는 isbn이 있다면 총 책의 수량을 업데이트 시킴
		 */	
		boolean find = false;
		for(Book b : list) {
			if(b.getIsbn()==isbn) {
				b.setQuantity(b.getQuantity()+quantity);
				find = true;
				break;
			}
		}
		if(find == false) {
			throw new ISBNNotFoundException();
		}
	}

	@Override
	public int getTotalAmount() {
		// 도서관의 모든 책의 총 가격금액을 반환
		int price = 0;
		for(Book b : list) {
			price += b.getPrice();
		}
		return price;
	}

}
