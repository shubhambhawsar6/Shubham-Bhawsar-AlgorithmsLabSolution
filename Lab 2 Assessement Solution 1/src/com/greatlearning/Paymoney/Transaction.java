package com.greatlearning.Paymoney;

import java.util.Scanner;

public class Transaction {
	
	public Transaction( int Array[],int size) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int Target=sc.nextInt();
		
		for(int j=1;j<=Target;j++) {
			System.out.println("Enter the value of target "+j );
			int TargetValue=sc.nextInt();
		
			int sum=0;
		
			for(int i=0;i<size;i++) {
			sum = sum+Array[i];
		    if(sum>=TargetValue) {
		    System.out.println("  Target achieved after "+(i+1)+" Transaction\n");
		    break;
		    }
		}
		    if(sum<TargetValue){
			 System.out.println("Given target is not achieved");
		 
		}
	}
		sc.close();
	}

}
