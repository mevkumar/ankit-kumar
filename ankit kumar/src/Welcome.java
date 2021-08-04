import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Welcome {
	 
	 public static void main(String[]args) {
	 ArrayList<Integer> list=new ArrayList<>();
	 list.add(2);
	 list.add(4);
	 list.add(6);
	 list.add(8);
	 list.add(10); 
	 for(Integer i:list) {
		 System.out.println(i);
	 }
	 Iterator<Integer>itr=list.iterator();
	 while(itr.hasNext()) {
		Integer i=itr.next();
		System.out.println(i);
	 }
	 ListIterator<Integer> i=list.listIterator(list.size());
	 while(i.hasPrevious()) {
		 Integer i1=i.previous();
		 System.out.println(i1);
	 }
			
		}
 }