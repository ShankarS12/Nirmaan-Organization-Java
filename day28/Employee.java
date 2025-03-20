package day28;

import java.io.Serializable;

public class Employee implements Serializable {
	String name;
	int age;
	long phoneNo;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, long phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", phoneNo=" + phoneNo + "]";
	}
	
	
	

}
