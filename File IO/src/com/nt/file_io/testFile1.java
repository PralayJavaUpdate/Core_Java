package com.nt.file_io;
import java.io.*;
public class testFile1 {
	public static void main(String args[]) throws IOException{
		/*File f=new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println();
		
		File f1= new File("durga123");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
		System.out.println();
		
		File f2=new File("durga123","bcd.txt");
		System.out.println(f2.exists());
		f2.createNewFile();
		System.out.println(f2.exists());
		System.out.println();
		
		File f3=new File(f1,"bcd.txt");
		System.out.println(f3.exists());
		f3.createNewFile();
		System.out.println(f3.exists());
		System.out.println();
		
		File f4=new File("D://workspace/CoreJava/File IO/durga123","bbc.txt");
		System.out.println(f4.exists());
		f4.createNewFile();
		System.out.println(f4.exists());
		System.out.println();
		*/
		
		
		/*int count=0;
		File f5=new File("D://workspace/CoreJava/File IO/durga123");
		String[] s=f5.list();
		for(String s1:s) {
			count++;
			System.out.println(s1);
		}
		System.out.println(count);*/
		
		int count=0;
		File f5=new File("D://workspace/CoreJava/File IO");
		String[] s=f5.list();
		for(String s1:s) {
			File f6=new File(f5,s1);
			//if(s1.isFile()){ //isFile() is not there in java.lang.String class
			//if(f6.isFile()){
			if(f6.isDirectory()){
				count++;
				System.out.println(s1);
			}
			
		}
		System.out.println("The total number:"+count);
		
		
	}
}
