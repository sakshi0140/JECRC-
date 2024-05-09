class calculate{
	float a, b;
	void getdata(float x, float y){
		a=x; 
		b=y;
	}
}
class Sum extends calculate{
	float sum;
	void add(){
		sum=a+b;
		System.out.println("Sum is: " + sum);
	}
}
class Avg extends Sum{
	float avg;
	void find_avg(){
		avg=sum/2;
		System.out.println("Average is: " + avg);
	}
}
class multilevel_inheritence{
	public static void main(String args[]){
		Avg obj=new Avg();
		obj.getdata(10, 20);
		obj.add();
		obj.find_avg();
	}
}
	