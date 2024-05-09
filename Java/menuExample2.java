import java.awt.*;
import java.awt.event.*;
class test extends Frame{
	Label l;
	test(){
		l = new Label();
		Scrollbar s = new Scrollbar();
		Menu m = new Menu("Menu");
		MenuBar mb= new MenuBar();
		Menu sm = new Menu();
		MenuItem i1 = new MenuItem("Item1");
		MenuItem i2 = new MenuItem("Item2");
		MenuItem i3 = new MenuItem("Item3");
		MenuItem i4 = new MenuItem("Item4");
		MenuItem i5 = new MenuItem("Item5");
		m.add(i1);
		m.add(i2);
		sm.add(i4);
		m.add(i3);
		sm.add(i5);
		m.add(sm);
		mb.add(m);
		s.setBounds(100, 100, 100, 100);
		l.setBounds(30, 30, 200, 100);
		add(s);add(l);
		 s.addAdjustmentListener(new AdjustmentListener() {  
    public void adjustmentValueChanged(AdjustmentEvent e) {  
       l.setText("Vertical Scrollbar value is:"+ s.getValue());  
    }  
	
 });
		setMenuBar(mb);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
}
public class menuExample2{
	public static void main(String args[]){
		new test();
	}
}
