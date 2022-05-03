import java.util.ArrayList;
import java.util.Collections;

public class question7extension {
public static void main(String args[])
{
	ArrayList<String> list = new ArrayList<String>();   
	list.add("Dell");  
	list.add("Lenovo");   
	list.add("HP");  
	list.add("LG");  
	System.out.println("Before Sorting: "+ list);   
	Collections.sort(list);   
	System.out.println("After Sorting: "+ list);  
	for (String str : list)
	{ 
		System.out.print(str + " ");
	}
	System.out.println();
	list.forEach((n) -> System.out.print(n+" "));
}
}
