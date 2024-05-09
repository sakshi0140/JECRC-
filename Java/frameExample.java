import java.awt.*;
class test extends Frame{
	test(){
		Button b= new Button("Click me");
		b.setBounds(100, 100, 80, 30); 		//setBounds(x-axis, y-axis, width, height)
		add(b);							//adding button to frame
		setSize(300, 300);				//frame size
		setTitle("Hello");
		setLayout(null);				//frame layout
		setVisible(true);
	}
}
public class frameExample{
	public static void main(String args[]){
		test obj=new test();
	}
}
