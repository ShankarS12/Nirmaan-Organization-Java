package day22;

import java.util.*;

public class ArrayListEx2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1000);
		al2.add(2000);
		al2.add(3000);
		
		System.out.println(al2);
		
		int[] arr = {10, 20 ,30 ,40};
		System.out.println(arr);
		
		for(int i = 0; i<=3; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for(int num : arr) {
			System.out.println(num);
		}
		//add a element
		al.add(200);
		al.add(300);
		al.add(100);
		al.add(50);
		al.add(50);
		
		al.addFirst(500);
		al.addLast(10);
		System.out.println(al);
		
		//remove a element
		al.remove(4);
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);
		
		//add a another list into existing list
		al.addAll(al2);
		System.out.println(al);
		
		al.addAll(0, al2);
		System.out.println(al);
		
		//ascending order
		
		Collections.sort(al);
		System.out.println("sorted list " + al);
		
		//descending order
		
		Collections.sort(al, Comparator.reverseOrder());
		System.out.println("reverse list " + al);
		
		//change arraylist to array -- using Object and using array bracket
		
		Object[] obj = al.toArray();
		System.out.println(obj);
		
		for (Object obj1 : obj) {
			System.out.println(obj1);
		}
		
	}

}
