package org.test1;

import org.base.BaseClass;

public class Drag extends BaseClass{
public static void main(String[] args) {
	BaseClass bc=new BaseClass();
	bc.getDriver();
	bc.launchUrl("http://demo.guru99.com/test/drag_drop.html");
	
	Drag d=new Drag();
	
}
}
