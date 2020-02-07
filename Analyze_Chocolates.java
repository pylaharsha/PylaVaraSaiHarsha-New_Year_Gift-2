package com.epam.New_Year_Gift;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Analyze_Chocolates {
	public static int tw_choco = 0;
	public static int tc_choco = 0;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Size of Snickers = Large\nSize of Munch = Small");
    	Snickers b = new Snickers();
    	Munch sn = new Munch();

    	System.out.println("Enter size of Snickers(1 to 10): ");
    	b.get_size(scan.nextInt());

    	System.out.println("Enter size of Munch (1 to 10): ");
    	sn.get_size(scan.nextInt());

    	System.out.println("Enter quantity of Snickers: ");
    	int dq = scan.nextInt();

    	System.out.println("Enter quantity of Munch: ");
    	int sq = scan.nextInt();

    	System.out.println("Enter price of Snickers: ");
    	b.price = scan.nextInt();

    	System.out.println("Enter price of Munch: ");
    	sn.price = scan.nextInt();


    	System.out.println("Sort By Option:");
    	System.out.println("1.Size\n2.Name\nEnter your choice: ");
    	int op = scan.nextInt();
    	int dm = b.display();
    	int ss = sn.display();
    	ArrayList<String> ch = new ArrayList<String>();
    	if(op==1) {
    		if(dm>ss){
        		ch.add("Snickers");
        		ch.add("Munch");
        	}
        	else{
        		ch.add("Munch");
        		ch.add("Snikers");
        	}
        	System.out.println(ch+"\n\n");
    	}
    	else if(op==2) {
    		ch.add("Munch");
    		ch.add("Snikers");
    		Collections.sort(ch);
    		System.out.println(ch);
    	}
    	else {
    		System.out.println("Invalid Input");
    		return;
    	}

    	tw_choco = b.total_w(dq) + sn.total_w(sq);
    	System.out.println(tw_choco +" Grms");

    	tc_choco = b.total_p(dq) + sn.total_p(sq);
    	System.out.println(tc_choco +" Rc.");
	}

}


