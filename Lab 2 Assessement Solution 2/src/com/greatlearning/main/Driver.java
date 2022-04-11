package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.denomination.Min_denomination;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		
		System.out.println("Enter the currency denominations value");
		int Currencydenomination[] =new int[size];
				
		for(int i=0 ;i<size;i++) {
		    Currencydenomination[i]=sc.nextInt(); 
		}

        System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		
		Min_denomination obj=new Min_denomination();
		obj.compute(Currencydenomination, amount);
		sc.close();
	}

}
