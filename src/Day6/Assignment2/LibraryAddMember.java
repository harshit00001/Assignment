package Day6.Assignment2;

public class LibraryAddMember {
	private String nm_name;
	private String nm_address;
	private int nm_id;
	private int nm_age;
	public LibraryAddMember(String nm_name, String nm_address, int nm_id, int nm_age) {
		super();
		this.nm_name = nm_name;
		this.nm_address = nm_address;
		this.nm_id = nm_id;
		this.nm_age = nm_age;
	}
	public String getNm_name() {
		return nm_name;
	}
	public void setNm_name(String nm_name) {
		this.nm_name = nm_name;
	}
	public String getNm_address() {
		return nm_address;
	}
	public void setNm_address(String nm_address) {
		this.nm_address = nm_address;
	}
	public int getNm_id() {
		return nm_id;
	}
	public void setNm_id(int nm_id) {
		this.nm_id = nm_id;
	}
	public int getNm_age() {
		return nm_age;
	}
	public void setNm_age(int nm_age) {
		this.nm_age = nm_age;
	}
	@Override
	public String toString() {
		return "LibraryAddMember [Name =" + nm_name + ", Address=" + nm_address + ", Member Id=" + nm_id + ", Age="
				+ nm_age + "]";
	}
	
	

}
