package day28;
import java.util.*;
import java.io.*;

public class UI {
	public static void main(String[] args) {
		String path = "C:\\Users\\Admin\\Desktop\\shan.txt.txt";
		ArrayList<Employee> al = new ArrayList<>();
		Employee emp = new Employee("shankar", 21, 9563838436l);
		al.add(emp);
		emp = new Employee("sriram", 20, 9563838436l);
		al.add(emp);


		
		
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			//System.out.println(al);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(ois.readObject());
			//System.out.println(al1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}

}
