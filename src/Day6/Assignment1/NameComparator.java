package Day6.Assignment1;
import java.util.Comparator;

public class NameComparator implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}