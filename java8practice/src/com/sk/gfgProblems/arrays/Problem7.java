package com.sk.gfgProblems.arrays;

import java.util.Arrays;

public class Problem7 {

	public static void main(String[] args) {
		/*int arr[]= {1,};
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(i+1<arr.length&&arr[i]==arr[i+1]) {
				arr[i+1]=0;
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		if(count==arr.length-1) {
			int item = arr[arr.length-1];
			arr=Arrays.copyOf(arr, arr.length-count);
			arr[0]=item;
			System.out.println(Arrays.toString(arr));
		}
		else {
			for(int i=0;i<arr.length;i++) {
				if(i+1<arr.length&&arr[i]==0) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			arr=Arrays.copyOf(arr, arr.length-count);
			System.out.println(Arrays.toString(arr)+"length = "+arr.length);
		}
		System.out.println(Arrays.toString(arr)+"length = "+arr.length);
		
*/
		 int count =0;
		 int A[]= {2,2,2,2,2};
		 int N = A.length;
	        for(int i=0;i<N;i++){
	            if(i+1<N && A[i]==A[i+1]){
	                A[i+1] =0;
	                int temp =A[i];
	                A[i]=A[i+1];
	                A[i+1]=temp;
	                count++;
	            }
	        }
	        System.out.println(Arrays.toString(A));
	            if(count==N-1){
	                int temp = A[N-1];
	                A=Arrays.copyOf(A,N-count);
	                A[0]=temp;
	                System.out.println(Arrays.toString(A));
	            }
	            else{
	                for(int i=0;i<N;i++){
	            if(i+1<N && A[i]==0){
	                int temp =A[i];
	                A[i]=A[i+1];
	                A[i+1]=temp;
	            }
	                
	            }
	            A=Arrays.copyOf(A,N-count);
	        }
	        System.out.println(Arrays.toString(A)+"length "+A.length);
	}
}
