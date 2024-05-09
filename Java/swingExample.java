import javax.swing.*;
class test extends JFrame{
	test(){
		JButton b= new JButton();
		b.setBounds(300, 300, 80, 30); 		//setBounds(x-axis, y-axis, width, height)
		b.setLabel("Cick Here");
		add(b);							//adding button to frame
		setSize(600, 600);				//frame size
		setTitle("Hiiiii");
		setLayout(null);				//frame layout
		setVisible(true);
	}
}
public class swingExample{
	public static void main(String args[]){
		test obj=new test();
	}
}
