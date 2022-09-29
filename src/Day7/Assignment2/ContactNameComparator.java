package Day7.Assignment2;

import java.util.Comparator;

public class ContactNameComparator implements Comparator<AddContact>{

	@Override
	public int compare(AddContact o1, AddContact o2) {
		// TODO Auto-generated method stub
		return o1.getC_name().compareTo(o2.getC_name());
	}

	
}
