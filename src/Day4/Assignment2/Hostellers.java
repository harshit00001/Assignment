package Day4.Assignment2;

public class Hostellers extends Student {

	@Override
	String getStudentDetails() {
		// TODO Auto-generated method stub
		return "Hostel_number : " + hostel_number + "\nStudent Name: "+ student_name +"\nRoom Number: "+ room_number+ "\nRegistration Number: " + registration_No + "\nDepartment: " + department;
	}

}
