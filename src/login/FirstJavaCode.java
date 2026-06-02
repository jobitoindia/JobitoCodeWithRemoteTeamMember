package login;

import java.util.Scanner;

public class FirstJavaCode {
	
	public void additio()   //parametrerized
	{   
		int num1,num2,sum,sub;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first value");
		num1=sc.nextInt();
		
		System.out.println("please enter the second value");
		num2=sc.nextInt();
		
		sum=num1+num2;
		System.out.println("the addition odf twi number:" +sum);
		
		sub=num1-num2;
		System.out.println("the sub odf twi number:" +sub);

	}
	
	public static void main(String[] args) 
	{
		System.out.println("jobito");
		System.out.println("hi");
		FirstJavaCode fc=new FirstJavaCode();
		System.out.println("hello");
		fc.additio();
		
	}

}
