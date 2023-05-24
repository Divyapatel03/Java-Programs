package com.mobileapp.service;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;

public class MobileServiceImpl implements MobileService {

	@Override
	public Mobile getById(int id) throws MobileNotFoundException {
		Mobile[] mobiles = allMobies();
		Mobile mobileid = new Mobile();
		int count = 0;
		for (Mobile mobile : mobiles) {
			if (mobile.getMobileId() == id) {
				mobileid = mobile;
				count++;
			}
		}
		if (count == 0) {
			throw new MobileNotFoundException("Mobile not found");
		}
		return mobileid;
	}

	@Override
	public Mobile[] getAll() {
		Mobile[] mobiles = allMobies();
		return mobiles;
	}

	@Override
	public Mobile[] getByBrand(String brand) throws MobileNotFoundException {
		Mobile[] mobiles = allMobies();
		int count = 0;
		for (Mobile mobile : mobiles) {
			if (mobile.getBrand().equals(brand)) {
				count++;
			}
		}
		if (count == 0) {
			throw new MobileNotFoundException("Mobile not found");
		}
		Mobile[] mobilebybrand = new Mobile[count];
		int i = 0;
		for (Mobile mobile : mobiles) {
			if (mobile.getBrand().equals(brand))
				mobilebybrand[i++] = mobile;
		}
		return mobilebybrand;
	}

	private Mobile[] allMobies() {
		Mobile[] mobiles = new Mobile[7];
		mobiles[0] = new Mobile(1, "A113", "Samsung", 34856);
		mobiles[1] = new Mobile(2, "A113", "Redmi", 34456);
		mobiles[2] = new Mobile(3, "A12", "oppo", 35456);
		mobiles[3] = new Mobile(4, "A13", "lenovo", 38456);
		mobiles[4] = new Mobile(5, "S13", "mi", 34569);
		mobiles[5] = new Mobile(6, "F21", "vivo", 34856);
		mobiles[6] = new Mobile(7, "A11", "Samsung", 34656);
		return mobiles;
	}
}
