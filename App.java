package com.epam.New_Year_Gift;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter maximum price");
        int mp=s.nextInt();
        ArrayList<String> CandiesPack=new ArrayList<String>();
        ArrayList<String> ChocolatesPack=new ArrayList<String>();
        CandiesPack.add("Chopsticks");
        CandiesPack.add("CandieBalls");
        ChocolatesPack.add("Snickers");
        ChocolatesPack.add("Munch");


        System.out.println("calling of SweetPackage class\n");
        Analyze_Sweets.main(args);

        System.out.println("calling of CandiesPackage class\n");
        Analyze_Candies.main(args);

        System.out.println("calling of ChoclatesPackage class\n");
        Analyze_Chocolates.main(args);

        int total_weight=0;
        total_weight=Analyze_Sweets.Sweets_weight+Analyze_Candies.candies_weight+Analyze_Chocolates.tw_choco;
        System.out.println("Total weight of the New Year Gift is"+total_weight+"Gms");

        int total_price=0;
        total_price=Analyze_Sweets.Sweets_price+Analyze_Candies.candies_price+Analyze_Chocolates.tc_choco;
        if(mp<total_price) {
        	System.out.println("Gift price more than expected. Please get within range");
    }
        else {
        	System.out.println("Total price of the gift is"+total_price+"Rs.");
        }
}
}