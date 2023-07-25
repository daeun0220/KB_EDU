package spring.service.dice.impl;

import spring.service.dice.Dice;

public class DiceAImpl implements Dice{
	
	private int value;
	
	public DiceAImpl() {
		System.out.println("::"+getClass().getName()+"생성자...");
	}
	
	public DiceAImpl(int value) {
		super();
		this.value = value;
		System.out.println("::"+getClass().getName()+"생성자...");
	}

	@Override
	public void selectedNumber() {
		System.out.println("::"+getClass().getName()+"생성자...");
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
