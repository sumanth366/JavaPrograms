package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {
	
	public static void main(String[] args)
	{
		//it is non synchronized and gives concurrent modification exception i.e fail fast exception
		//non generic hash map
		HashMap h1 = new HashMap();
		h1.put(10, "Ten");
		h1.put(5, 125);
		System.out.println(h1);
		
		//generic hash map
		HashMap<String, String> h2 = new HashMap<String, String>();
		h2.put("name", "muff");
		h2.put("people", "11");
		
		//printing usinf for each loop
				for(Entry<String, String> e: h2.entrySet())
				{
					System.out.println(e.getKey()+ " " +e.getValue());
				}
		
		HashMap h3 = (HashMap)h2.clone();
		System.out.println(h3);
		
		if(h3.containsKey("name"))
			System.out.println("it contains key name");
		
		if(h3.containsValue("11"))
			System.out.println("it contains value 11");
		
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("sonu", 26, "m");
		Employee e2 = new Employee("barat", 26, "m");
		emp.put(1, e1);
		emp.put(2, e2);
		
		for(Entry e: emp.entrySet())
		{
			Employee ee = (Employee) e.getValue();
			System.out.println(e.getKey()+" "+ee.name+" "+ee.age+" "+ee.gender);
		}
		
		
		
	}

}
