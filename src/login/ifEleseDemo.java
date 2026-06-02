package login;

import java.util.Scanner;

public class ifEleseDemo {

	public static void main(String[] args) 
	{
		
		String stateName;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("please enter your countryName");
		
		stateName=sc.next();
		
		switch(stateName)
		{
		case "MH":
			System.out.println("the capital city is MUMBAI");
			break;
		case "AP":
			System.out.println("the capital city is HYDEBRABD");	
			break;
		case "kt":
			System.out.println("the capital city is BANGLORE");	
			break;
		case "tn":
			System.out.println("the capital city is CHENNAI");
			System.out.println("tamilnadu");
			break;
		case "kerala":
			System.out.println("the capital city is TIRUANANTPURAM");	
		default:
			System.out.println("Please enter correct statename");
		
	}
	}
}
