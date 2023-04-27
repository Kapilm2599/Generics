package com.blz.generics;

public class MaximumTestGenerics {
	
	//public static Integer maximumInteger(Integer num1, Integer num2, Integer num3)
	//public static Float maximumFloat(Float num1, Float num2, Float num3)
	public static String maximumString(String num1, String num2, String num3) {

		String maximumString = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			maximumString = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			maximumString = num2;
		else
			maximumString = num3;
		return maximumString;

	}

	public static void main(String[] args) {
		System.out.println("Maximum String Among 3 will be :- " + maximumString("Papaya", "Apple", "Mango"));
	}


}
