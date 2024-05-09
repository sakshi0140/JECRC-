class area{
	int length;
	int breadth;
	int result;
	void getdata(int l, int b){
		length=l;
		breadth=b;
	}
	void cal(){
		result = length * breadth;
	}
}
class class_obj{
	public static void main(String args[]){
		area obj = new area();
		obj.getdata(10, 20);
		obj.cal();
		System.out.println("Area = " + obj.result);
	}
}