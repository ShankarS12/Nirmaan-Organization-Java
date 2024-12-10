package day14;

public class Employee {
	private int id;
	private String name;
	private long phoneNo;
	private String department;
	
	public Employee(int id, String name, long phoneNo, String department) {
		
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.department = department;
	}

	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", department=" + department + "]";
	}
	
	
	

}
