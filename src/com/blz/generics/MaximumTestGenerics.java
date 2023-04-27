package com.blz.generics;

public class MaximumTestGenerics {
	
	public static Integer maximumInteger(Integer num1, Integer num2, Integer num3) {

		Integer maximumNumber = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			maximumNumber = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			maximumNumber = num2;
		else
			maximumNumber = num3;
		return maximumNumber;
	}

	public static void main(String[] args) {
		System.out.println("Maximum Number among 3 will be: " + maximumInteger(70, 40, 50));
	}

}
