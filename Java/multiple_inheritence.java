interface A{
	static final int a=10;
	void display();
}
interface B{
	static final int b=20;
	void show();
}
class C implements A, B{
	public void display(){
		System.out.println("Display of A");
		System.out.println("Value of A = " + a);
	}
	public void show(){
		System.out.println("Display of B");
		System.out.println("Value of B = " + b);
	}
	public void showMessage(){
		System.out.println("Display of C");
	}
	class multilevel_inheritence{
		public static void main(String args[]){
			C obj = new C();
			obj.display();
			obj.show();
			obj.showMessage();
		}
	}
}