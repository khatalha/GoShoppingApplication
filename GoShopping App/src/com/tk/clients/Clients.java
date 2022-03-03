package com.tk.clients;

import com.tk.application.GSNormalAcc;
import com.tk.application.GSPrimeAcc;
import com.tk.application.GSShopFactory;
import com.tk.framework.NormalAcc;
import com.tk.framework.PrimeAcc;
import com.tk.framework.ShopFactory;

public class Clients {
	
	static ShopFactory shop;
	static GSPrimeAcc gsprime;
	static GSNormalAcc gsnormal;
	
	public static void main(String[] args) {
		ShopFactory shop = new GSShopFactory();
		NormalAcc gsnormal = shop.getNewNormalAcc(101, "Talha", 700, 50);
		gsnormal.bookProduct(1000);
		gsnormal.toString();
		
		PrimeAcc gsprime = shop.getNewPrimeAcc(102, "Arbaz", 700, true);
		gsprime.bookProduct(1000);
		gsprime.toString();
		
		
		
		

	}

}
