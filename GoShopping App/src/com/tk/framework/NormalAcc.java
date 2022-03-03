package com.tk.framework;

public abstract class NormalAcc extends ShopAcc {
	
	protected static float deliveryCharges=50;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		NormalAcc.deliveryCharges = 50;
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	@Override
	public void bookProduct(float deliveryCharges) {
		
		System.out.println("Dilevery chrges"+deliveryCharges);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", accNo=" + accNo + ", accNm=" + accNm
				+ ", getDeliveryCharges()=" + getDeliveryCharges() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getCharges()=" + getCharges() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	

}
