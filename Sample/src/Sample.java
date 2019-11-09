import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import javax.jws.WebService;

@WebService
public class Sample {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
		set.add(null);
		/*set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		
		//set.add(null);
		set.add("");*/
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
			}  
			}  


