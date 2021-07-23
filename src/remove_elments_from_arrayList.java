

import java.util.ArrayList;
public class remove_elments_from_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*** it is a dynamic array ***/
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("java ");
		list1.add("c++ ");
		System.out.println("listed array : "+list1);
		
		list1.remove(1); // remove the index : 1

		System.out.println("listed array after deletion of index 1 : "+list1);
		
		

	}

}
