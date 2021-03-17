package org.suite;

import org.junit.Ignore;
import org.junit.Test;

public class Sample2 {
	@Test
	public void tc11() {
		System.out.println("class11");

	}

	@Test
	public void tc12() {
		System.out.println("class22");

	}

	@Test
	public void tc13() {
		System.out.println("class33");

	}

	@Ignore
	@Test
	public void tc14() {
		System.out.println("class44");

	}

	@Test
	public void tc15() {
		System.out.println("class55");

	}
}
