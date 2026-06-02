package homePagePck;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		Hashtable<Integer, String> studRecords=new Hashtable<>();
		
		studRecords.put(2, "ashish");
		studRecords.put(3, "akshay");
		studRecords.put(4, "shankar");
		studRecords.put(4, "balaji");
		studRecords.put(1, "amol");  //Entry
		
		
		for(Map.Entry<Integer, String> hm:studRecords.entrySet()) 
		{
			System.out.println(hm.getKey() + " "+  hm.getValue());
			
		}
		
		
		

	}

}
