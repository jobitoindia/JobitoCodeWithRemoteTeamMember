package homePagePck;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class ArrayDemo {
	
	int a=10 ;
	static int b=20;
	
	
	public static  void show() 
	{
		System.out.println(b);
	}
	
	static 
	{
		System.out.println("compiler calls me first");
	}
	
	public void get() 
	{
		System.out.println(b);
		System.out.println(a);
	}

	public static void main(String[] args) 
	{
		ArrayDemo ar=new ArrayDemo();
		ArrayDemo.show();
		
		System.out.println(ar.a);
		
		System.out.println(ArrayDemo.b);
		
		
		
	}	
}
