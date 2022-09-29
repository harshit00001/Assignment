package Day6.Assignment1;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;

public class Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> numbers=new HashSet<>();
		List<Students> students=new ArrayList<>();
		numbers.add("Adam");
		numbers.add("Harshit");
		numbers.add("Harshit1");
		numbers.add("Harshit2");
		numbers.add("Harshit3");
		students.add(new Students("David","101",25));
		students.add(new Students("Adam","102",24));
		students.add(new Students("Sara","103",23));
		students.add(new Students("Angel","104",22));
		Collections.sort(students,new NameComparator());
		Iterator<String> it =numbers.iterator();
		System.out.println("-----Numbers------");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-----Students------");
		for(Students stud:students)
		{
			System.out.println(stud.getName()+ ":"+stud.getAge());
		}
	}
}
