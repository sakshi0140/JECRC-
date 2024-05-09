import java.awt.*;
class abcd extends Frame{
	abcd(){
		Button b = new Button("Click me");
		Label l = new Label("hello");
		b.setBounds(50, 50, 80, 20);
		l.setBounds(50, 100, 100, 30);
		add(b); 
		add(l);
		setSize(600, 600);
		setLayout(null);
		setVisible(true);
	}
}
public class awtExample1
{
	public static void main(String args[]){
		new abcd();
	}
}
		
		
		