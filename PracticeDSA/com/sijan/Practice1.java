package com.sijan;

public class Practice1 {
	public static void main(String[] args){
			int[] arr = {1,0,4,0,5,8,4};
			int j= 0;
			for(int i = 0; i<arr.length; i++) {
				if(arr[i]!= 0 && arr[j]==0) {
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i]=temp;
					}
				if(arr[j]!=0) {
					j++;
				}
			}
			for(int num: arr) {
			System.out.println(num +"" );}
			}

	}

