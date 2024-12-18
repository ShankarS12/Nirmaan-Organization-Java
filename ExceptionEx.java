package day19;

public class ExceptionEx {
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		try {
			arr[5] = 60;
		}
		catch(Exception E) {
			System.out.println(E);
		}
		
		for(int i = 0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		
		for(int arr1 : arr) {
			System.out.println(arr1);
			
		}
	}

}
