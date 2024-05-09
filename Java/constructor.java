class student{
	int id;
	String name;
	student(int a, String b){
		id=a;
		name=b;
	}
	void display(){
		System.out.println(id + " " + name);
	}
}
class constructor{
	public static void main(String args[]){
		student obj = new student(11, "abc");
		obj.display();
	}
}