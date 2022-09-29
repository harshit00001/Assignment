package Day6.Assignment1;

import java.util.*;

public class CollegeAssign2Main {
	public static void main(String[] args)
	{
		List<StudentAssign2> students =new ArrayList<>();
		students.add(new StudentAssign2("David","101","BIT MESRA",25));
		students.add(new StudentAssign2("Adam","102","BIT MESRA",24));
		students.add(new StudentAssign2("Sara","103","Ranchi University",23));
		students.add(new StudentAssign2("Angel","104","Rai University",22));
		Collections.sort(students,new CollegeComparator());
		System.out.println("-----Students Details------");
		for(StudentAssign2 stud:students)
		{
			if(stud.getCollege()=="Rai University")
			System.out.println(stud.toString());
		}
	}

}
