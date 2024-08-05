package javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CSECollection {

	public static void main(String[] args) {
		// List Set and Map
		
		/*
		 * ArrayList<String> list = new ArrayList(); list.add("1"); list.add("Apple");
		 * list.add("4.5f"); list.add("true");
		 */
		
		ArrayList list = new ArrayList();
		
		Employee e1 = new Employee();
		e1.setEmpName("Jack");
		e1.setAge(23);
		e1.setSalary(23000);
		
		Employee e2 = new Employee();
		e2.setEmpName("Jane");
		e2.setAge(26);
		e2.setSalary(23700);
		
		Employee e3 = new Employee();
		e3.setEmpName("Peter");
		e3.setAge(29);
		e3.setSalary(22000
);
		
		list.add(e1);list.add(e2);list.add(e3);
		
		Collections.sort(list, new SalaryComparator());
		
		
		//System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Employee e = (Employee) itr.next();
			System.out.println(e.getEmpName());
					}
	}

}

