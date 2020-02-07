package com.epam.New_Year_Gift;
import java.util.ArrayList;
import java.util.Scanner;

public class Analyze_Sweets {
	static public int Sweets_weight;
	static public int Sweets_price;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> Sweets=new ArrayList<String>();
		Sweets.add("Malpuri");
		

		int price[]=new int[Sweets.size()];
		Malpuri k=new Malpuri();
		

		System.out.println("Enter number of sweets\n");
		int kc=s.nextInt();
		
		
		
		price[0]=k.display();
		
		System.out.print("Total weight of sweets is: ");
		Sweets_weight=k.cal_w(k.weight);;
		System.out.println(Sweets_weight+" grams\n");

		System.out.print("Total price of sweets is: ");
		Sweets_price=price[0];
		System.out.println(Sweets_price+" Rs\n");



	}

}
