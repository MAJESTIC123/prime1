package logics;

import java.util.Scanner;

public class PrimeNumberRange {
public static void main(String[] args) {
	
	System.out.println("Enter the starting range");
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	System.out.println("Enter the ending range");
	int n2=s.nextInt();
	int count=0;
	System.out.println("Prime number range from "+n1+ " to"+" "+n2+" are :");
	for(int i=n1;i<=n2;i++) {
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				count=0;
				break;
			}
			else {
				count=1;
			}
		}
		if(count==1) {
			System.out.println(i);
		}
	}
}
}
