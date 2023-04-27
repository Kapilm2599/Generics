package com.blz.generics;

public class MaximumTestGenerics<T>{
	T num1, num2, num3;
	
	//public static Integer maximumInteger(Integer num1, Integer num2, Integer num3)
	//public static Float maximumFloat(Float num1, Float num2, Float num3)
	//public static String maximumString(String num1, String num2, String num3) 
	public static <T extends Comparable<T>> T maximumAmongThree(T num1, T num2, T num3) {

		T maximumNumber = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			maximumNumber = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			maximumNumber = num2;
		else
			maximumNumber = num3;
		return maximumNumber;
	}

	public static void main(String[] args) {
		System.out.println(
				"The max Number Among Three String numbers is:-\n " + maximumAmongThree("Papaya", "Apple", "Mango"));
		System.out.println("The max Number Among Three Integer numbers is:-\n " + maximumAmongThree(70, 40, 50));
		System.out.println("The max Number Among Three Float numbers is:-\n " + maximumAmongThree(70.6f, 40.7f, 50.8f));
	}

}
