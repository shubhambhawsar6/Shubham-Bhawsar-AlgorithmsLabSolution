package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.Paymoney.Transaction;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Transaction array"); 
		int size=sc.nextInt();
		int Array[] =new int [size];
		
		System.out.println("Enter the values of array");
		
		for(int i=0;i<size;i++) {
			System.out.println("please enter " +i+" index value of array");
			Array[i]=sc.nextInt();
		}
		System.out.print("{");
		for(int i=0;i<size;i++) {
			System.out.print(" "+Array[i]);
		}
		System.out.print(" }\n");
		
		
		
		Transaction transaction=new Transaction(Array,  size);
		
	sc.close();
	
	}
	
    
}
