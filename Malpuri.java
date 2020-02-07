package com.epam.New_Year_Gift;

public class Malpuri extends Sweets {
	int weight=10;
	int price=15;
	public int display() {
		return total;
	}

	public int cal_w(int kc) {
		return total=kc*weight;// TODO Auto-generated method stub

	}
	public int cal_p(int n) {
		return total=n*price;
	}




}
