package day26;
import java.io.*;

public class FileEx {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Admin\\Desktop\\file\\handling\\gokul\\output.txt");
		
		//file.mkdir(); //for making a dir
		//file.mkdirs(); //for making a multiple dirs
		
	try {
		file.createNewFile(); //for create a newfile
		System.out.println("success");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("wrong path");
	}
	
	try {
		FileWriter FW = new FileWriter("C:\\Users\\Admin\\Desktop\\file\\handling\\gokul\\output.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
		
	}

}
