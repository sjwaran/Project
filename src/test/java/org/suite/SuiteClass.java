package org.suite;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Sample.class,Sample2.class,Sample3.class} )
public class SuiteClass {
	

	public static void main(String[] args) {
		
		Result r=JUnitCore.runClasses(SuiteClass.class);
		
		 int fc = r.getFailureCount();
		 System.out.println("failure count i  :"+fc);
		 
		 int ic = r.getIgnoreCount();
		 System.out.println("ignore count is :"+ic);
		 
		 int rc = r.getRunCount();
		 System.out.println("run count is :"+rc);
		 
		 long rt = r.getRunTime();
		 System.out.println("run time is :"+rt);
		 
		 List<Failure> failures = r.getFailures();
		 for (Failure ff : failures) {
			 System.out.println(ff.toString());
			
		}
	}

}
