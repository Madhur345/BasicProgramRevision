
import java.util.*;
import java.util.Map.Entry;  
class MapExample3{  
	public static void main(String args[]){  
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		map.put(100,"Amit");  
		map.put(101,"Vijay");  
		map.put(102,"Rahul");  
		//Elements can traverse in any order  
		for(Entry<Integer, String> entry :map.entrySet()){  
			System.out.println(entry.getKey()+" "+entry.getValue());  
		}  
	}  
}  

