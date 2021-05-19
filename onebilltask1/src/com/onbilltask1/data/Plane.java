package com.onbilltask1.data;

public class Plane {
	String name;
	double unitprice;
	String code;

	public Plane(String name, double unitprice, String code) {
		super();
		this.name = name;
		this.unitprice = unitprice;
		this.code = code;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
