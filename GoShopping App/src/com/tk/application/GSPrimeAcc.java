package com.tk.application;

import com.tk.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	private static final float Charges = 0;
	
	public GSPrimeAcc() {		
		super(accNo, accNm, Charges, isPrime);
	}
		
	//getter	
	public float getCharges() {
		return Charges;
	}
	@Override
	public void bookProduct(float charges) {
		
		System.out.println("Dear Prime user,your product charges are "+ charges);
	}
	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}
	
	
	
	

}
