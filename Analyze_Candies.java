package com.epam.New_Year_Gift;

import java.util.Scanner;

public class Analyze_Candies {

	public static int candies_weight=2;
	public static int candies_price=2;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Maximum number of candies: " + CandiesPack.range);
    	Chopsticks jy = new Chopsticks();
    	CandieBalls lo = new CandieBalls();
    	System.out.println("Enter Quantities of Chopsticks and CandieBalls:");
    	jy.quantity(scan.nextInt());
    	lo.quantity(scan.nextInt());
    	if(jy.quantity+lo.quantity<=CandiesPack.range) {
    	System.out.println("Options:\n1.Quantity\n2.Total Candies");
    	int opc = scan.nextInt();
    	if(opc==1) {
    		System.out.println("Enter quantity of range within:");
    		int qun = scan.nextInt();
    		if(jy.display()<=qun) {
    			System.out.println("Chopsticks are in range of "+qun);
    			System.out.println("No of Chopsticks are : "+jy.display());
    		}
    		else {
    			System.out.println("CandieBalls are in range of "+qun);
    			System.out.println("No of CandieBalls are : "+lo.display());
    		}
    	}
    	else if(opc==2) {
        	int total_range = jy.display()+lo.display();
        	if(total_range<CandiesPack.range) {
        		System.out.println("Candies are with in range");
            	System.out.println("Total number of candies in the present are : " + total_range);
        	}
        	else {
        		System.out.println("Candies are not in range");
        	}
    	}
    	else {
    		System.out.println("Enter Valid input");
    		return;
    	}
    	candies_weight = lo.cal_w(lo.quantity)+jy.cal_w(jy.quantity);
    	System.out.println("Total weight of candies: "+candies_weight+" grms\n");

    	candies_price = lo.cal_p(lo.quantity) + jy.cal_p(jy.quantity);
    	System.out.println("Total price of candies: "+candies_price+" Rc.\n");
    	}
    	else {
    		System.out.println("Candies out of range");
    		return;
    	}
	}
}

