package Day6.Assignment1;

import java.util.Comparator;

public class CollegeComparator implements Comparator<StudentAssign2> {

	@Override
	public int compare(StudentAssign2 o1, StudentAssign2 o2) {
		return o1.getCollege().compareTo(o2.getCollege());
		
	}

}
