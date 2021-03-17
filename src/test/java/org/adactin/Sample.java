package org.adactin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Sample {
@BeforeClass
public static void tc0() {
	System.out.println("Before Class");

}

@AfterClass
public static void tc1() {
	System.out.println("After Class");

}
@Before
public void tc2() {
	System.out.println("before");

}
@Ignore
@After
public void tc4() {
	System.out.println("After");
}
@Test
public void tc3() {
System.out.println("Test");
String s="jegatheesh";
String s1="jegatheesh";
boolean equals = s.equals(s1);
Assert.assertTrue(equals);
System.out.println("assert done");

}

@Test
public void tc6() {
	System.out.println("Test1");

}@Test
public void tc7() {
	System.out.println("Test3");

}

}
