package org.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Junit.class,Junit2.class})
public class SuitClass {
public static void main(String[] args) {
	Result r=JUnitCore.runClasses(SuitClass.class);
	
	int rc = r.getRunCount();
	System.out.println(rc);
	
	long rt = r.getRunTime();
	System.out.println(rt);
}
}
