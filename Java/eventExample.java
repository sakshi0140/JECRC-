import java.awt.*;
import java.awt.event.*;			//event 
class  test extends Frame implements ActionListener{
	TextField t;
	test(){
		t = new TextField();       
		Button b = new Button("Click me");
		t.setBounds(20, 70, 80, 30);
		b.setBounds(100, 100, 80, 30);
		b.addActionListener(this);     //instance
		add(t);
		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		t.setText("Welcome");
	}
	
}

public class eventExample{
	public static void main(String args[]){
		new test();
	}

}
