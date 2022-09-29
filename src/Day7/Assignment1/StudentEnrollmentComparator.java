package Day7.Assignment1;
import java.util.*;
public class StudentEnrollmentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.getEnrol_id()>o2.getEnrol_id())
			return 1;
			else if(o1.getEnrol_id()<o2.getEnrol_id())
			return -1;
			else 
				return 0;
	}

}
