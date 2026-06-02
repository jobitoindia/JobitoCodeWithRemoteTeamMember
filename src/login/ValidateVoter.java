package login;

import java.util.Scanner;

public class ValidateVoter {
	
	public void show() throws InvalidVoterException, StringIndexOutOfBoundsException, ArrayIndexOutOfBoundsException
	{
		int age;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Your eligible for voting");
		}
		else 
		{
			throw new InvalidVoterException("Not eligible");
		}	
	}
	

	public static void main(String[] args)  
	{
		ValidateVoter vv=new ValidateVoter();
		try {
			vv.show();
		} 
		catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException | InvalidVoterException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
