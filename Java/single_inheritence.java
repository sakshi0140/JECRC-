class sub1{
	int x; 
	void getdata(int y){
		x=y;
	}
}
class sub2 extends sub1{
	void display(){
		System.out.println("Value: " + x);
	}
}
class single_inheritence{
	public static void main(String args[]){
		sub2 obj = new sub2();
		obj.getdata(10);
		obj.display();
	}
}