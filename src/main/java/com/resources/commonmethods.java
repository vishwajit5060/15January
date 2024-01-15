package com.resources;

import org.testng.asserts.SoftAssert;

public class commonmethods {

	public static void hanldeassertion(String actualurl, String expectedurl) {

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualurl, expectedurl);
		sa.assertAll();

	}

}
