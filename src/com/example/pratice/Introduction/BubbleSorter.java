package com.example.pratice.Introduction;

import java.util.Arrays;

public class BubbleSorter {
	
	public void sort(int[] data){
		for(int i=0;i<=data.length-2;i++){
			for(int j=0;j<=data.length-2-i;j++){
				if(data[j]>data[j+1]){
					int temp=data[j+1];
					data[j+1]=data[j];
					data[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int [] data={8,7,6,4,2};
		new BubbleSorter().sort(data);
		System.out.println(Arrays.toString(data));
	}

}
