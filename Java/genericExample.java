class abcd <T extends String>{
	T data;
	void getdata (T data){
		this.data=data;
	}
	void display(){
		System.out.println(data);
	}
}
class genericExample{
	public static void main(String args[]){
		abcd <String> obj = new abcd<>();
		obj.getdata("abc");
		obj.display();
	}
}