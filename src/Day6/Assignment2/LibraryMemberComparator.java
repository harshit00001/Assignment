package Day6.Assignment2;


import java.util.Comparator;

public class LibraryMemberComparator implements Comparator<LibraryAddMember>{

	@Override
	public int compare(LibraryAddMember o1, LibraryAddMember o2) {
		return o1.getNm_address().compareTo(o2.getNm_address());
		// TODO Auto-generated method stub
	}
}
