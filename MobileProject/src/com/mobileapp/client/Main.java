package com.mobileapp.client;

import java.util.Scanner;

import com.mobileapp.exception.MobileNotFoundException;
import com.mobileapp.model.Mobile;
import com.mobileapp.service.MobileService;
import com.mobileapp.service.MobileServiceImpl;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MobileService mobileService = new MobileServiceImpl();
		Mobile[] mobile = mobileService.getAll();
		for (Mobile mobiles : mobile) {
			System.out.println(mobiles);
		}

		try {
			System.out.println("Enter id:");
			int id = sc.nextInt();
			Mobile mobileid = mobileService.getById(id);
			System.out.println("Mobile by id " + mobileid);

			System.out.println("Enter brand ");
			String brand = sc.next();
			Mobile[] mobilebrand = mobileService.getByBrand(brand);
			System.out.println("Mobile by brand ");
			for (Mobile mobilebybrand : mobilebrand) {
				System.out.println(mobilebybrand);
			}
		} catch (MobileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
