package Unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P17_SwingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingInJava obj = new SwingInJava();
		

	}

}

class SwingInJava extends JFrame
{
	
	JTable jt1;
	JList list;
	JComboBox jb1;
	
	JTextField t1;
	JTextField t2;
	
	JTextArea ta1;
	
	JRadioButton r1;
	JRadioButton r2;
	
	JCheckBox c1;
	JCheckBox c2;
	
	
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton b10;
	
	
	JLabel l1;
	
	
	SwingInJava()
	{
		
		String data[][]= {{"20012105","Riya","200000"},{"20011008","Maneesh","300000"},{"200121","Khushi","259000"}};
		
		String column[]= {"ID","Name","Salary"};
		
		jt1=new JTable(data,column);
		
		String week[]= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"
		};
		
		list =new JList<>(week);
		jb1 =new JComboBox<>(week);
		
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		
		c1=new JCheckBox("Dancer");
		c2=new JCheckBox("Singer");
		
		//for large content
		ta1=new JTextArea(10,30);
		
		//small content
		t1=new JTextField("20");
		t2=new JTextField("20");
		
		l1=new JLabel();
		
		b1=new JButton("Addition");
		b2=new JButton("Subtraction");
		b3=new JButton("Multiply");
		b4=new JButton("Division");
		b5=new JButton("Modulous");
		b6=new JButton("Average");
		b7=new JButton("Increment A");
		b8=new JButton("Increment B");
		b9=new JButton("Decrement A");
		b10=new JButton("Decrement B");
		
		add(list);
		add(jb1);
		
		add(r1);
		add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r1);
		
		add(c1);
		add(c2);
		
		
		add(ta1);
		add(t1);
		add(t2);
		add(b1);
		add(l1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		
		
		ActionListener  al=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=ta1.getText();
				
				int a1=Integer.parseInt(s1);
				int a2=Integer.parseInt(s2);
				
				if(e.getSource()==b1) {
				Integer sum=a1+a2;
				l1.setText(sum.toString());
				}
				if(e.getSource()==b2) {
					Integer sub=a1-a2;
					l1.setText(sub.toString());
					}
				
				if(e.getSource()==b3) {
					Integer mul=a1*a2;
					l1.setText(mul.toString());
					}
				if(e.getSource()==b4) {
					Integer div=a1/a2;
					l1.setText(div.toString());
					}
				if(e.getSource()==b5) {
					Integer mod=a1%a2;
					l1.setText(mod.toString());
					}
					if(e.getSource()==b6) {
						Integer avg=(a1+a2)/2;
						l1.setText(avg.toString());
						}
					
					if(e.getSource()==b7) {
						Integer inc1=++a1;
						l1.setText(inc1.toString());
						}
					if(e.getSource()==b8) {
						Integer inc2=++a2;
						l1.setText(inc2.toString());
						}
					if(e.getSource()==b9) {
						Integer dec1=--a1;
						l1.setText(dec1.toString());
						}
					if(e.getSource()==b10) {
						Integer dec2=--a2;
						l1.setText(dec2.toString());
						}
					
					if(r1.isSelected()) {
						l1.setText("is a Male");
					}
					
					if(r2.isSelected()) {
						l1.setText("is a Female");
					}
					
					if(c1.isSelected()) {
						l1.setText("is a Dancer");
					}
					
					if(c2.isSelected()) {
						l1.setText("is a Singer");
					}
					
					if(c2.isSelected() && c1.isSelected()) {
						l1.setText("is a Singer and Dancer");
					}
					
					if(list.getSelectedIndex()!=-1)
					{
						String data="Day Selected"+list.getSelectedValue();
						l1.setText(data);
					}
					if(jb1.getSelectedIndex()!=-1)
					{
						String data="Day Selected"+jb1.getSelectedItem();
						l1.setText(data);
					}
				
			}
		};

		
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		b4.addActionListener(al);
		b5.addActionListener(al);
		b6.addActionListener(al);
		b7.addActionListener(al);
		b8.addActionListener(al);
		b9.addActionListener(al);
		b10.addActionListener(al);
		
		r1.addActionListener(al);
		r2.addActionListener(al);
		c1.addActionListener(al);
		c2.addActionListener(al);
		
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(250,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}


}
