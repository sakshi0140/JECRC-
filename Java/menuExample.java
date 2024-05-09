import java.awt.*;
// menu --- menu bar , menu, menu item, submenu
class abcd extends Frame{
	abcd(){
		MenuBar mb = new MenuBar();
		Menu m = new Menu("File");
		Menu sm = new Menu("Arjun");
		Scrollbar s = new Scrollbar();
		MenuItem i1 = new MenuItem("Item1");
		MenuItem i2 = new MenuItem("Item2");
		MenuItem i3 = new MenuItem("Item3");
		MenuItem i4 = new MenuItem("Item4");
		MenuItem i5 = new MenuItem("Item5");
		setMenuBar(mb);
		mb.add(m);
		m.add(sm);
		m.add(i1);
		m.add(i2);
		m.add(i3);
		sm.add(i4);
		sm.add(i5);
		add(s);
		s.setBounds(50,50, 10, 150);
		setSize(600, 600);
		setLayout(null);
		setVisible(true);
	}
}
public class menuExample{
	public static void main(String args[]){
		new abcd();
	}
}