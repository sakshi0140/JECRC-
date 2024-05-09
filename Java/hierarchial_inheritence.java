class rectangle{
	float l, b;
	void getdata(float x, float y){
		l=x; 
		b=y;
	}
}
class peri extends rectangle{
	float p;
	void perimeter(){
		p=2*(l+b);
		System.out.println("Perimeter = " + p);
	}
}
class Area extends rectangle{
	float a;
	void area(){
		a=l*b;
		System.out.println("Area = " + a);
	}
}
class hierarchial_inheritence{
	public static void main(String args[]){
		peri obj1 = new peri();
		Area obj2 = new Area();
		obj1.getdata(10, 20);
		obj2.getdata(10, 20);
		obj1.perimeter();
		obj2.area();
	}
}
