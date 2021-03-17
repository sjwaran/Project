package org.suite;

import org.junit.Ignore;
import org.junit.Test;

public class Sample3 {
	@Test
	public void tc10() {
		System.out.println("class111");

	}

	@Ignore
	@Test
	public void tc11() {
		System.out.println("class212");

	}

	@Test
	public void tc21() {
		System.out.println("class313");

	}

	@Test
	public void tc31() {
		System.out.println("class414");

	}

	@Test
	public void tc41() {
		System.out.println("class515");

	}
}
