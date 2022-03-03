package com.tk.application;

import com.tk.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
						
	}
	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharges, deliveryCharges);
	}

	@Override
	public void bookProduct(float charges) {
		
		System.out.println("Dear Normal user,your product charges are : "+ charges+"With delivery charges: " +deliveryCharges);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [ accNo=" + accNo + ", accNm=" + accNm
				+ ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
