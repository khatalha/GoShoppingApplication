package com.tk.framework;

public abstract class ShopAcc {
	
	protected static int accNo;
	protected static String accNm;
	private float charges;
	
	//getter
	public int getAccNo() {
		return accNo;
	}
	
	
	public String getAccNm() {
		return accNm;
	}


	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}


	public float getCharges() {
		return charges;
	}
	
	//construtor
	public ShopAcc(int accNo, String accNm, float charges) {
	
		this.accNo = accNo;
		this.setAccNm(accNm);
		this.charges = charges;
	}
	public void bookProduct( float charges){
		System.out.println("The Booked Product and Charges"+charges);
	}
	
	public void items( float charges){
		System.out.println("The item is deliverd charges are"+charges);
	}
	
	
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
