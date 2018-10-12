
public class Student {
	public int studentRollno;
	public String firstName;
	public String lastName;
	public int studentMarks;
	public String branchName;

	public Student(int studentRollno, String firstName, String lastName, int studentMarks, String branchName) {
		this.studentRollno = studentRollno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentMarks = studentMarks;
		this.branchName = branchName;
	}

	public int getStudentRollno() {
		return studentRollno;
	}

	public void setStudentRollno(int studentRollno) {
		this.studentRollno = studentRollno;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int studentMarks) {
		this.studentMarks = studentMarks;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
