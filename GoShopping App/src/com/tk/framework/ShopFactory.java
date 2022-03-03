package com.tk.framework;

public abstract interface ShopFactory {
	
	public  PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges,  boolean isPrime);
	
	public NormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges);
		
}
