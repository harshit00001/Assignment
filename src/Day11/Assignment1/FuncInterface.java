package Day11.Assignment1;

import java.util.*;


public class FuncInterface {

	public static void main(String[] args) {
		
		List<Stud> list=new ArrayList<Stud>();
		list.add(new Stud("Harshit",60,"A"));
		list.add(new Stud("Abhay",40,"B"));
		list.add(new Stud("Chetan",80,"A"));
		list.stream().filter(n->n.getGrade().charAt(0)=='A').sorted((Stud o1, Stud o2) -> o1.getName().compareTo(o2.getName())).forEach(x->System.out.println(x.getName()));
		
		
//		Stud o1=new Stud(20);
//		Stud o2=new Stud(40);
//		Comparator<Stud> compareByAge = (Stud o1, Stud o2) -> o1.getAge()>o2.getAge() );
//		Comparator.comparing(Stud->Stud.getAge());
		 
		

	}

}
