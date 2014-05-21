package com.animesh.designpattern;

public class BillPughSingleton {
	
	
	private static  class  SingletonHelper{
		
		private static final BillPughSingleton  instance = new BillPughSingleton();
		String d= "a" ;
		}
	
	public static BillPughSingleton getInstance(){
		return SingletonHelper.instance;
	}
	

}
