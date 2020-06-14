package com.nt.enums;

enum Beer3{
KF,KO,RC,FO;
Beer3(){
System.out.println("Constructor called.");
}
}
class TestBeer3{
public static void main(String args[]){
Beer3 b=Beer3.KF; // --->1
System.out.println("hello.");
}}