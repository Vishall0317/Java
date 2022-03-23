
//program to demonstrate storing same types of elements into a ArrayList collection

package com.hcl.ArrayList;

import java.util.ArrayList;

public class AppTwo {

	public static void main(String[] args) {

		ArrayList<String> cityList = new ArrayList<String>();

		cityList.add("Calcutta");
		cityList.add("Chennai");
		cityList.add("Mumbai");
		cityList.add("Hyderabad");
		cityList.add("Secunderabad");
		cityList.add("Bangalore");
		cityList.add("Lucknow");
		cityList.add("Kanpur");

		System.out.println(cityList);

		for (String city : cityList) {

			if (city.endsWith("bad")) {
				System.out.println(city);
			}

		}

	}

}
