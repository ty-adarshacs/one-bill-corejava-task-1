package com.onebilltask1.main;

import java.util.HashMap;
import java.util.Scanner;

import com.onbilltask1.data.Order;
import com.onbilltask1.data.Plane;
import com.onebill.exception.Handler;

public class MainPurchase {
	public static void main(String[] args) throws Handler  {
		// ArrayList<Plane> list=new ArrayList<Plane>();
		Scanner scan = new Scanner(System.in);

		// SHOP1 Items price and brand------------------------------
		HashMap<String, Plane> map = new HashMap<String, Plane>();

		
		  Plane plane1 = new Plane("sonymobile", 1200.00, "123sony"); Plane plane2 =
		  new Plane("case", 130.00, "100cas"); Plane plane3 = new Plane("watch",
		  2100.00, "121wat"); Plane plane4 = new Plane("niko", 40000.00, "121niko");
		 
		map.put("mobile", plane1);
		map.put("case", plane2);
		map.put("battery", plane3);
		map.put("camera", plane4);

		// SHOP2 Items price and brand------------------------------------

		HashMap<String, Plane> map2 = new HashMap<String, Plane>();

		Plane plane11 = new Plane("sonymobile", 1200.00, "123sony");
		Plane plane22 = new Plane("case", 130.00, "100cas");
		Plane plane33 = new Plane("watch", 2100.00, "121wat");
		Plane plane44 = new Plane("niko", 40000.00, "121niko");

		map.put("mobile", plane11);
		map.put("case", plane22);
		map.put("battery", plane33);
		map.put("camera", plane44);

		try {
			String item;
			System.out.println("Enter your order item");
			item = scan.next();
			int quantity;
			System.out.println("Enter your quantity");
			quantity = scan.nextInt();
			Plane plane = map.get(item);
			String brandname = plane.getName();
			double prices = plane.getUnitprice();
			String code = plane.getCode();

			System.out.println("----------------------------------------------------------------------");

			Order order1 = new Order();
			order1.setOrdername(item);
			order1.setOrderamount(prices);

			order1.quantity(quantity, brandname);
			order1.totalprice(prices, quantity);
			System.out.println("----------------------------------------------------------------------");

		} catch (Exception e) {
			throw new Handler("item is not present");

		}

	}

}
