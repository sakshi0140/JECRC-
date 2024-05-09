import java.awt.*;
public class frameExample1{
	public static void main(String args[]){
	Label l = new Label("Enter something: ");    //read only 
	TextField t = new TextField();     			//write + read
	Frame f = new Frame();
	Button b1 = new Button("Click me");
	Button b2 = new Button("Click me");
	l.setBounds(20, 30, 100, 30); 
	t.setBounds(20, 70, 80, 30);
	b1.setBounds(100, 100, 80, 30);
	b2.setBounds(200, 200, 80, 30);
	f.add(l);
	f.add(t);
	f.add(b1);
	f.add(b2);
	f.setSize(600, 600);
	f.setLayout(null);
	f.setVisible(true);
	}
}
