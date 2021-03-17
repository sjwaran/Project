package org.suite;

import org.junit.Ignore;
import org.junit.Test;

public class Sample {
	@Test
	public void tc0() {
		System.out.println("class1");

	}

	@Test
	public void tc1() {
		System.out.println("class2");

	}

	@Test
	public void tc2() {
		System.out.println("class3");

	}

	@Test
	public void tc3() {
		System.out.println("class4");

	}

	@Ignore
	@Test
	public void tc4() {
		System.out.println("class5");

	}
}
