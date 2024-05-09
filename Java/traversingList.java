import java.util.*;
public class traversingList{
	public static void main(String args[]){
		ArrayList <String> names = new ArrayList<>();
		names.add("abc");
		names.add("def");
		names.add("xyz");
		System.out.println("iterator");
		Iterator itr = names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("List Iterator");
		ListIterator<String> litr = names.listIterator(names.size());
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}
		System.out.println("For each loop");
		for(String n: names){
			System.out.println(n);
		}
		System.out.println("For each method");
		names.forEach(a->{
			System.out.println(a);
		});
		System.out.println("For each reamining method");
		itr.forEachRemaining(a->{
			System.out.println(a);
		});
	}
}
	