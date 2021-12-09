package apiBuilders;

import java.util.Arrays;

public class MinandMax {
public static void main(String[] args) {
	int arr[]= {12,34,56,78,1,99};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}

	}
	System.out.println(max);
	for(int j=0;j<arr.length;j++) {
		if(arr[j]<min) {
			min=arr[j];
		}
	}
	System.out.println(min);
	//Second way
	Arrays.sort(arr);
	for(int k : arr)
	System.out.println(k);
	System.out.println("min : "+arr[0]);
	System.out.println("mix : "+arr.length);
	/*for(int n=arr.length-1;n>=5;n--) {
		System.out.println(arr[n]);
	}*/
	
}
}
