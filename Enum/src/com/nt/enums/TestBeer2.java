package com.nt.enums;

enum Beer1
{
	KF,KO,RC,FO;
}
class TestBeer2{
	public static void main(String args[]){
		Beer1[] b=Beer1.values();
			for(Beer1 b1:b)//this is forEach loop.
			{
			//System.out.println(b1);
			System.out.println(b1+"......."+b1.ordinal());
			}
	}
}

