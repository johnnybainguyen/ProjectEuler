import java.util.ArrayList;

import Algorithm.IsomorphicWords;
import Algorithm.RotateArray;
import LanguageConcept.PassByObject;

public class main {
	public static void main(String []args) {
		/*
		IsomorphicWords iw = new IsomorphicWords("aac", "bbc");
		System.out.println(iw.isIsomorphic());
		*/
		/*
		final int NUM_ROTATE = 3;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		
		RotateArray<Integer> ra = new RotateArray<Integer>(al, NUM_ROTATE);
		//al = ra.rotateByIndexCalculation();
		//al = ra.rotateByBubble();
		//al= ra.rotateByReverse();
		//al = ra.rotateByJava();
		ra.printArrayList(al);
		*/
		int something = 1;
		PassByObject obj  = new PassByObject(1, "one", 1.0);
		PassByObject obj2 = obj.passObject(obj, something);
		PassByObject obj3  = new PassByObject(7, "Seven", 7.0);
		obj.printContents();
		obj.printContents(obj);
		if(obj == obj3) {
			System.out.println("They are the same object");
		} else {
			System.out.println("They are not the same object");
		}
		
		System.out.println(something);
		
	}
}
