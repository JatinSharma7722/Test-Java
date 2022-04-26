package testJavaExample;

import java.util.ArrayList;
import java.util.*;

public class Collection_2 {

	public static void main(String[] args) {
		Collection_1 e1  = new Collection_1 (105L,"Raghav",1000,"manager");
		Collection_1 e2  = new Collection_1 (106L,"harshita",100000,"cmd");
		Collection_1 e3  = new Collection_1 (107L,"harshit",100,"c");
		Collection_1 e4  = new Collection_1 (108L,"arsh",10000,"ex-ceo");
		List<Collection_1> emlpyeelist = new ArrayList<Collection_1>();
		emlpyeelist.add(e1);
		emlpyeelist.add(e2);
		emlpyeelist.add(e3);
		emlpyeelist.add(e4);
		EmployeeImp1 e= new EmployeeImp1(emlpyeelist);
		e.printUniqueEmployee(emlpyeelist);
		e.averageSalary();
		e.salaryStatus();
	}
}