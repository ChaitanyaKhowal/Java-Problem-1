//1) Given a list of integers, separate odd and even numbers?

package com.khowal.demo;

import java.util.ArrayList;
import java.util.List;

public class Task1_SeperateOddEven {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(7);
		l.add(8);
		l.add(15);
		l.add(210);
		l.add(115);
		l.add(146);
		l.add(189);
		
		List<Integer> even = new ArrayList<>();
		List<Integer> odd = new ArrayList<>();
		
		for(int i : l) {
			if(i % 2 == 0)
				even.add(i);
		else
			odd.add(i);
		}

		System.out.println("Given List : " + l);
		System.out.println("Even List : " + even);
		System.out.println("Odd List : " + odd);
		
	}
	
}
