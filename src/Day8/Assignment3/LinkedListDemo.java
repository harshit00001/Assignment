package Day8.Assignment3;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		List<String> linked =new LinkedList<>();
		
		linked.add("java");
		linked.add("Net");
		linked.add("JS");
		linked.add(1,"Python");
		System.out.println(linked);
//		linked.remove(1);
//		System.out.println(linked);
//		linked.remove("Net");
		linked.set(2, "C#");
		System.out.println(linked);
		for(String val:linked)
		{
			System.out.println(val);
		}
		

	}

}
