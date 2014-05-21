package com.animesh.designpattern;

/*****************************
 * 
 *  This is singleton design pattern with double lock.
 *  
 * @author animishr
 *
 */

public class Singleton {
	
	private static volatile Singleton _instance;
	
	
	public static Singleton getInstance()
	{ 
		if(_instance == null)
		{ 
			synchronized(Singleton.class)
			{ if(_instance == null)
				_instance = new Singleton(); } } return _instance;
	}


}



