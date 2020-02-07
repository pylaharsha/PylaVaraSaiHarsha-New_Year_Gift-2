package com.epam.New_Year_Gift;

public class ChocolatesPack {
	int size;
	int price;
}

class Snickers extends ChocolatesPack{
	int dweight = 50;
	public int display() {
		return size;
	}
	public void get_size(int n) {
		size=n;
	}
	public int total_w(int n) {
		return dweight*n;
	}
	public int total_p(int n) {
		return price*n;
	}
}

class Munch extends ChocolatesPack{
	int sweight = 30;
	public int display() {
		return size;
	}
	public void get_size(int n) {
		size=n;
	}
	public int total_w(int n) {
		return sweight*n;
	}
	public int total_p(int n) {
		return price*n;
	}
}
