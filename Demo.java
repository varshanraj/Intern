import java.awt.*;
import java.awt.event.*;

class Test extends Frame implements ItemListener{
	Label l1,l2,l3,l4,l5,l6,l7;
	TextField t1,t2,t3,t4,t5;
	Checkbox c1,c2,c3,c4,c5;
	Button b1;
	Test(){
		CheckboxGroup grp = new CheckboxGroup();
		setTitle("Registration Form");
		l1 = new Label("Name");
		l1.setBounds(40,40,35,30);
		l2 = new Label("Date Of Birth");
		l2.setBounds(40,80,80,30);
		l3 = new Label("Age");
		l3.setBounds(40,120,30,30);
		l4 = new Label("Gender");
		l4.setBounds(40,160,50,30);
		l5 = new Label("Address");
		l5.setBounds(40,200,55,25);
		l6 = new Label("Preferred Language(s)");
		l6.setBounds(40,290,130,30);
		l7 = new Label("");
		
		t1 = new TextField(30);
		t1.setBounds(180,40,120,20);
		t2 = new TextField(5);
		t2.setBounds(180,80,120,20);
		t3 = new TextField(5);
		t3.setBounds(180,120,120,20);
		c3 = new Checkbox("Male",grp,false);
		c3.setBounds(180,160,50,20);
		c3.addItemListener(null);
		c4 = new Checkbox("Female",grp,false);
		c4.setBounds(235,160,50,20);
		c4.addItemListener(null);
		c5 = new Checkbox("Others",grp,false);
		c5.setBounds(305,160,50,20);
		c5.addItemListener(null);
		t5 = new TextField(100);
		t5.setBounds(180,200,120,80);
		
		b1 = new Button("Submit");
		b1.setBounds(160,390,80,50);
		
		c1 = new Checkbox("Tamil");
		c1.setBounds(180,280,50,50);
		c2 = new Checkbox("English");
		c2.setBounds(180,320,50,50);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(t1);
		add(t2);
		add(t3);
		add(c3);
		add(c4);
		add(c5);
		add(t5);
		add(b1);
		add(c1);
		add(c2);
		add(l7);
		setSize(400,500);
		setVisible(true);
		c3.addItemListener(new ItemListener() {  
            public void itemStateChanged(ItemEvent e) {               
            	if (c3.getState()) {
                    c3.setEnabled(true);
                    c4.setEnabled(true);
                    c5.setEnabled(true);
                }  
                else {
                	c3.setEnabled(false);
                    c4.setEnabled(false);
                    c5.setEnabled(true);
                }
            }  
         });  
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class Demo{
	public static void main(String[] args) {
		Test obj = new Test();
	}
}