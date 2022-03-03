package com.tk.application;

import com.tk.framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public GSPrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc();
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
		return gsnormal;
	}

}
