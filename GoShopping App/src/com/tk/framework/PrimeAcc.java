package com.tk.framework;

public abstract class PrimeAcc  extends ShopAcc {
	
	public static boolean isPrime;
	
	
	//construtor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.setPrime(isPrime);
	}
	//getter


	public static boolean isPrime() {
		return isPrime;
	}


	public void setPrime(boolean isPrime) {
		PrimeAcc.isPrime = isPrime;
	}
	
	
	@Override
	public void bookProduct(float charges) {
	
		System.out.println("charges are"+charges);
	}


	@Override
	public String toString() {
		return "PrimeAcc [getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}


	
	
	
	
	
	
	
	
	

}
