package com.greatlearning.denomination;

import com.greatlearning.sorting.Mergesort;

public class Min_denomination {
	public void compute(int [] arr , int amount ) {
		
		Mergesort.sort_currency_denomination(arr, 0, arr.length-1);
		
		int[] currency_notes = new int[arr.length];
		boolean flag = true;
		for(int i = 0; i<arr.length;i++	) {
			currency_notes[i] = amount / arr[i];
			amount = amount % arr[i];
		}
		if (amount % arr[arr.length-1] != 0){
			flag = false;
		}
		
		if (flag == true) {
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i = 0; i<arr.length; i++) {
				if(currency_notes[i] != 0)
					System.out.println(arr[i] +":"+ currency_notes[i]);
			}
		}else {
			System.out.println("Exact amount cannot be tendered");
		}
	}

}
