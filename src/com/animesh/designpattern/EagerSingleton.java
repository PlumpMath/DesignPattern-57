package com.animesh.designpattern;

public class EagerSingleton {
	
	private  static  final EagerSingleton  instance = new EagerSingleton();
	
	private EagerSingleton(){
		
	}
		
	public static EagerSingleton getinstance(){
		
		return instance;
		
	}
	}


