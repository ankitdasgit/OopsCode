package MethodInJava;

import java.util.Scanner;

public class MaxNumberFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("enter your two number "
//				+ "check greatest");
//		
//		int firstNumber = sc.nextInt();
//		int secondNumber=sc.nextInt();
		
		//call method
		
		//int firstNumber = 56;
		//int secondNumber=45;
		
	       sayHi();
		
		int result = MaxOf(90,57);
		int result2= MaxOf(34,67);
		
		//int result= MaxOf( firstNumber, secondNumber);
		
		// MaxOf(34,67);
		 System.out.println("BIG number is : "+result);
		

	}
	
	// create method
	
	static int MaxOf(int a, int b){
		if(a>b) {
			return a;
		}else
			return b;
    }
	
	static void sayHi() {
		System.out.println("Hii!! have a good day!! ");
	}
	
	

}
