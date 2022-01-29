package com.medicare.app.global;

import java.util.ArrayList;
import java.util.List;

import com.medicare.app.model.Product;

public class GlobalData {

	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}
}
