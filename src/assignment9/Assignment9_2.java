package assignment9;
import java.util.*;
public class Assignment9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<Integer>();		//declaring a set of integer values
		Set<Integer> set2 = new HashSet<Integer>();		//declaring another set of integer values
		for(int i = 0; i < 5; i++) 
		{
			set1.add(i);		//adding element to set1
		}
		System.out.println("Set 1 ");
		System.out.println(set1);	//print set 1
		for(int i = 10; i < 15; i++) 
		{
			set2.add(i);		//adding element to set2
		}
		System.out.println("Set 2 ");
        System.out.println(set2);	//print set2
		set1.addAll(set2);		//adding element of set2 to set1
		System.out.println("Set 1 as union of Set 1 and Set 2");
		System.out.println(set1);	//print the union of set1 and set2
	}
}