import java.util.*;
class test{
	String name, gender;
	int age;
	test(String n, String g, int a){
		name=n;
		gender=g;
		age=a;
	}
	public String toString(){
		return "Person {Name= "+ name + " ,Gender= " + gender + " ,Age= " + age + "}";
	}
}
public class arrayList{
	public static void main(String args[]){
		test arr[] = { new test("Ronak", "F", 21), new test("Bob", "M", 22)};
		ArrayList <test> person = new ArrayList<>(Arrays.asList(arr));
		for(test p: person){
			System.out.println(p);
		}
	}
}		