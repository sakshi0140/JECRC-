import java.awt.*;
import java.awt.event.*;
class test{
	test(){
		Frame f = new Frame();
		Dialog d = new Dialog(f, "Hello", true);
		d.setBounds(30, 30, 300, 300);
		Button b = new Button("click me");
		Label l = new Label();
		l.setText("Enter: ");
		l.setBounds(50, 40, 100, 100);
		b.setBounds(100, 70, 80, 30);
		d.add(b);
		d.add(l);
		d.setLayout(null);
		d.setVisible(true);
	}
}
public class dialogExample{
	public static void main(String args[]){
		new test();
	}
}
		