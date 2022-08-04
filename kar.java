// railway ticket system user login
package Ticket;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class UserLogin extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton b1,b2;
	
	UserLogin(){
		this.setVisible(true);
		this.setTitle("ICRTC LOGIN");
		Container con=getContentPane();
		con.setLayout(new GridLayout(4,2));  
		l1=new JLabel("Enter Name",JLabel.CENTER);
		t1=new JTextField(30);		
		
		l4=new JLabel("Phone Number",JLabel.CENTER);
		t4=new JTextField(30);
		l5=new JLabel("Email",JLabel.CENTER);
		t5=new JTextField(40);
		
		b1=new JButton("Login");
		b2=new JButton("Clear");
		con.add(l1);
		con.add(t1);
		
		con.add(l4);
		con.add(t4);
		con.add(l5);
		con.add(t5);
		
		con.add(b1);
		con.add(b2);
		con.setBackground(Color.orange);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			this.setVisible(false);
			try
			{
				
				String name=t1.getText();
				
				String pnum=t4.getText();
				String ema=t5.getText();

				
				FileWriter fw=new FileWriter("Login.txt",true);
				System.out.println("Name :"+name+"\tMobile Number :"+pnum+"\tEmail:"+ema);
fw.write("Name :"+name+"\tMobile Number :"+pnum+"\tEmail:"+ema+"\t");
fw.close();
Login a=new Login(name);
a.setVisible(true);
a.setSize(700,600);
			}
			
			catch(IOException ie)
			{
				System.out.println(ie.getMessage());
			}
		}
		else if(ae.getSource()==b2)
		{
			t1.setText(null);
	
			t4.setText(null);
			t5.setText(null);
			t6.setText(null);
		}
	}

	
	
	public static void main(String[] args) {
UserLogin U=new UserLogin();
U.setSize(500, 500);
		
	}

}
/// booking page 
package Ticket;
import java.awt.*;

import java.awt.event.*;
import java.io.FileWriter;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
JTextField t1,t2,t3,t4,t5,t6,t7,t8;
String[] gender={"Select","Male","Female","Rather Not To Say"};

JButton b1,b2;
JComboBox a,b,c,d,e,f,g;
double bill=93;
Login(String name)
{
	l1=new JLabel("Name ",SwingConstants.CENTER);
	l2=new JLabel("Age",SwingConstants.CENTER);
	l3=new JLabel("Gender",SwingConstants.CENTER);
	l4=new JLabel("Source",SwingConstants.CENTER);
	l5=new JLabel("Destination",SwingConstants.CENTER);
	l6=new  JLabel("NameofTrain",SwingConstants.CENTER);
	l7=new JLabel(" BerthNumber",SwingConstants.CENTER);
	l8=new JLabel("Coach",SwingConstants.CENTER);
	l9=new JLabel("BerthType",SwingConstants.CENTER);
	l10=new JLabel("TrainType",SwingConstants.CENTER);
	l11=new JLabel("TotalAmount:",SwingConstants.CENTER);
	t1=new JTextField(30);
	t1.setText(name);
	t2=new JTextField(20);
	//t3=new JTextField(10);
	g=new JComboBox(gender);
	String [] Source= {"Select","Trupathi","Vizag","Dehil","Agra","Kashmir"};
	 b=new JComboBox(Source);
	//t4=new JTextField(30);
	//t5=new JTextField(30);
	
	String [] destiny= {"Select","VijayaWada","Hyderbad","Punjab","Chennai","Banglore"};
	 f=new JComboBox(destiny);
	 String [] train={"Select","vishakaExpress","Amaravathi Express","TirupathiExpress","Chennai Express","Banglore Express","DehliExpress","Punjab Express","Jammu & kashmir","Shimla",};
	 a=new JComboBox(train);
	//Integer [] Seat= { 1,2,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
	//JcomboBox1=new JComboBox(Seat);
	 t6=new JTextField(50);
	 t7=new JTextField(100);
	String [] Coach= {"Select","AC Coach","non Ac Coach"};
	c=new JComboBox(Coach);
	String [] Bed= {"Select","Upper bed","Lower Bed"," East Upper Bed","East Lower Bed"," West upper Bed","West Lower Bed"};
	d=new JComboBox(Bed);
	String [] type= {"Select","Express","Super fast"};
	e=new JComboBox(type);
	b1=new JButton("PROCEED");
	b2=new JButton("CANCEL");
	setSize(800,500);
	setVisible(true);
	setTitle("IRCTC TICKET BOOKING");
	Container con=getContentPane();
	con.setLayout(new GridLayout(12,2));
	con.setBackground(Color.cyan);
	con.add(l1);
	con.add(t1);
	con.add(l2);
	con.add(t2);
	con.add(l3);
	con.add(g);
	con.add(l4);
	con.add(b);
	con.add(l5);
	con.add(f);
	//con.add(JComboBox1);
	//con.add(JComboBox);
	con.add(l6);
	con.add(a);
	con.add(l7);
	con.add(t6);
	con.add(l8);
	con.add(c);
	con.add(l9);
	con.add(d);
	con.add(l10);
	con.add(e);
	con.add(l11);
	con.add(t7);
	con.add(b1);
	con.add(b2);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	this.pack();		
	
}

public void actionPerformed(ActionEvent ae)
{
	try
	{
		if(ae.getSource()==b1)
		{
			
			bill=93;
				String name=t1.getText();
				String age=t2.getText();
				String Gender=g.getSelectedItem().toString();
				//String Gender=t3.getText();
				String StartingPoint=b.getSelectedItem().toString();
				String Destination=f.getSelectedItem().toString();
				String NAMETrain=a.getSelectedItem().toString();
				String seat=t6.getText();
				String Coach=c.getSelectedItem().toString();
				String Trian=d.getSelectedItem().toString();
				String type=e.getSelectedItem().toString();
				String amount = Double.toString(bill());
				t7.setText(amount);
				JOptionPane.showMessageDialog(b1,"you want to book a ticket ");
				FileWriter f=new FileWriter("D://project.txt",true);
				f.write(" NAME: "+ name +"  AGE: "+ age +"  Gender:  "+  Gender  +" Starting point: "+  StartingPoint  +"    Destination:  "+  Destination  +"   Name of Train: "+  NAMETrain  +"  Seat number: "+  seat  +"  Type of Coach: "+  Coach  +" Type of Bed: "+  Trian  +" Train type:  "+ type+" "+t7.getText());
				System.out.println("\t name: "+ name +"Age: "+ age +"  Gender:  "+ Gender +"  Source:  "+ StartingPoint +"   Destiontion:   "+Destination +"   Name of train: "+NAMETrain +"  Seat Number: "+seat +"    Coach:   "+Coach +"   Bed:  "+Trian +"   Train Type:  "+type+" Total amount:"+t7.getText() );
				f.close();
				Booked a=new Booked(name, age, StartingPoint, Destination, NAMETrain, seat, Coach, type, Trian, bill);
				a.setVisible(true);
				a.setSize(500,400);
		}
	
		if(ae.getSource()==b2)
		{
			t1.setText(" ");
			t2.setText(" ");
			g.setSelectedIndex(0);
			//t3.setText(null);
			b.setSelectedIndex(0);
		////	t4.setText(null);
			f.setSelectedIndex(0);
			//t5.setText(null);
			t6.setText(" ");
			a.setSelectedIndex(0);
			c.setSelectedIndex(0);
			d.setSelectedIndex(0);
			e.setSelectedIndex(0);
			t7.setText(" ");
		
			
		}
	}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}

}
public double bill()
{
	 if(c.getSelectedItem().equals("AC Coach"))
		bill=bill+75;
	 
	 if(e.getSelectedItem().equals("Super fast"))
		bill=bill+55;
	
	return bill;
}
public static void main(String args[])
{
	Login s=new Login("");
	s.setVisible(true);
	s.setSize(400,500);
}



}
/// booked details
package Ticket;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Booked extends JFrame{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;

Booked(String Name,String Age,String Source,String Destination,String NameofTrain,String BerthNumber,String Coach,String BerthType,String TrainType,double TotalAmount )
{
 setVisible(true);{
	 l1=new JLabel( "Customer Name  : " + Name);
		l2=new JLabel("Customer age : "+Age);
		l4=new JLabel("Source       : "+Source);
		l5=new JLabel("Destination  : "+ Destination);
		l6=new JLabel("Name of Train: "+NameofTrain);
		l7=new JLabel("BerthNumber  : "+ BerthNumber);
		l8=new JLabel("Type of Coach: "+Coach);
		l9=new JLabel("BerthType    : "+BerthType);
		l10=new JLabel(" Train Type:  "+TrainType);
		l11=new JLabel("Total Amount : "+TotalAmount);
		Container con=getContentPane();
		con.setLayout(new GridLayout(11,6));
		con.setBackground(Color.ORANGE);
		con.add(l1);
		con.add(l2);
		con.add(l4);
		con.add(l5);
		con.add(l6);
		con.add(l7);
		con.add(l8);
		con.add(l9);
		con.add(l10);
		con.add(l11);
;		pack();
		
 }
	
	
	

	
	
	
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






//// login.txt to save the data