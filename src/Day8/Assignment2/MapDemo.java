package Day8.Assignment2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;


public class MapDemo {

	public static void main(String[] args) {

	Map<Integer,StudentClass> studmap=new TreeMap<Integer,StudentClass>();
	studmap.put(101, new StudentClass(101,"Harshit",22));
	studmap.put(102, new StudentClass(102,"Abhay",21));
	studmap.put(103, new StudentClass(103,"Chetan",22));
	studmap.put(104, new StudentClass(104,"Debayan",22));
	studmap.put(105, new StudentClass(105,"Aaddya",22));
	studmap.put(106, new StudentClass(106,"Harshad",22));
	for(int n1: studmap.keySet())
		{
		StudentClass val=studmap.get(n1);
		if(val.getName().charAt(0)=='H')
		{
		System.out.println("Key = "+n1+" => Value = "+ val.getName());
		}
		}
	// TODO Auto-generated method stub
//	Map<String,String> names =new HashMap<String,String>();
//	names.put("JS", "JavaScript");
//	names.put("HTML","Hyper Text MarkUp Language");
//	names.put("COBOL","Common Business");
//	names.put("CSS","Cascade style Sheet");
//	names.put("CS","Computer Science");
//	for(Map.Entry<String, String> entry: names.entrySet())
//	{
//		System.out.println("Key = "+entry.getKey()+" => Value = "+ entry.getValue());
//	}
//	for(String n1: names.keySet())
//	{
//		System.out.println(n1);
//	}
//	for(String n1: names.values())
//	{
//		System.out.println(n1);
//	}
//	Iterator<Map.Entry<String,String>> it= names.entrySet().iterator();
//	while(it.hasNext())
//	{
//		Map.Entry<String,String> entry=it.next();
//		System.out.println("Key = "+entry.getKey()+" => Value = "+ entry.getValue());
//	}
//	for(String n1: names.keySet())
//		{
//		String val=names.get(n1);
//		System.out.println("Key = "+n1+" => Value = "+ val);
//		}
//	for(String n1: names.keySet())
//	{
//		names.get("JS");
//	}
//	names.forEach((k,v)->System.out.println("Key = "+k+" => Value = "+ v));;
	}
}
