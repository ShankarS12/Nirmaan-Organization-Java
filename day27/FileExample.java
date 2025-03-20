package day27;
import java.io.*;

public class FileExample {
	public static void main(String[] args) {
		String path = "C:\\Users\\Admin\\Desktop\\fileEx\\FileHandling\\output\\result.txt";
		File F = new File(path);
		//F.mkdirs();
		try {
			F.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileWriter FW = new FileWriter(F,true);
			
			BufferedWriter BW = new BufferedWriter(FW);
			FW.write("Hello");
			BW.newLine();
			BW.write("World");
			BW.close();
			FW.close();
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader FR = new FileReader(F);
			BufferedReader BR = new BufferedReader(FR);
			try {
				System.out.println(FR.read());
				int i = FR.read();
				while(i != -1) {
					System.out.println(FR.read());
					i = FR.read();
				}
				String str = BR.readLine();
				while(str != null) {
					System.out.println(BR.readLine());
					str = BR.readLine();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
