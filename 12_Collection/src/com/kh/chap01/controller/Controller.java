package com.kh.chap01.controller;

import java.util.Arrays;

public class Controller {
	
	private int[] integers;
	private int size;
	
	public Controller() {
		integers = new int[1];
		
	}
	
	public void add(int element) {
		if(integers.length == size + 1) {
		integers = Arrays.copyOf(integers, (integers.length)*2 );}
		
		integers[size++] = element;

	}
	
	public int get(int index) {
		return integers[index];
		
	}
	
	@Override
	public String toString() {
		return Arrays.toString(integers);
	}

}
