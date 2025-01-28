import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class hsystem implements ActionListener

{

	private JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1,b2,b3,b4,b5,b6;
	
	hsystem()
	
	{
		
		JFrame f = new JFrame("Hospital Login page");
		


        JLabel pic = new JLabel();
		ImageIcon imageIcon = new ImageIcon("E:\\pic\\kk.jfif");
		pic.setIcon(imageIcon);
		f.getContentPane().add(pic);
		f.pack();
		
		
		
		l1 = new JLabel("USERNAME");
		l1.setBounds(460, 397, 100, 20);
		
		tf1 = new JTextField();
		tf1.setBounds(550, 400, 200, 20);
		

		l2 = new JLabel("PASSWORD");
		l2.setBounds(460, 447, 100, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(550, 450, 200, 20);
		
		b1 = new JButton("LOG IN");
		b1.setBounds(590, 500, 100, 30);
		
		b1.addActionListener(this);
		
		f.add(l1);
		f.add(l2);
		f.add(tf1);
		f.add(tf2);
		f.add(b1);
		
		f.setSize(1920,1080);
		f.setLayout(null);
		f.setVisible(true);
			
	}
	
	
	public void actionPerformed(ActionEvent e)
	
	{
		JFrame f = new JFrame();
		String s1 = tf1.getText();
        String s2 = tf2.getText();
        
        if (s1.equals("admin") && s2.equals("password")) 
        	
        {
            JOptionPane.showMessageDialog(f,"Login successful!");
           
            JFrame g = new JFrame("Main Frame");
            
            g.setSize(1920,1080);
            g.setLayout(null);
            g.setVisible(true);
            
          /*  l1  = new JLabel(" ");  // Replace "path/to/image.jpg" with the actual path to your image file
            Image img = new ImageIcon(this.getClass().getResource("/E:\\pic.png")).getImage();
            l1.setIcon(new ImageIcon(img));
            
            l1.setBounds(10,53,166,256);
            g.getContentPane().add(l1)/
            
           */
           
            
            b1 = new JButton("DOCTORS AVAILIABITY");
            b1.setBounds(350,230,500,30);
            
            b2 = new JButton("GO TO PATIENTS FOAM");
            b2.setBounds(350,270,500,30);
            
            b1.addActionListener(this);
            b2.addActionListener(this);
            
            g.add(b1);
            g.add(b2);
           // g.add(l1);
            b1.addActionListener(new ActionListener()
            
            {
            	
                public void actionPerformed(ActionEvent e)
                
                {
           
                    JFrame h = new JFrame("Doctor");
                    
                    h.setSize(1920,1080);
                    h.setLayout(null);
                    h.setVisible(true);
                    
                    l1 = new JLabel("SELECT YOUR DETAILS");
                    l1.setBounds(530,50,150,20);
                    
                    l2 = new JLabel("DOCTOR'S NAME");
                    l2.setBounds(100,100,200,20);
                     
                    String Doctor[]= {"Dr.FURQAN","Dr.ZUBIYAN","Dr.AROOJ"};
                    JComboBox<String> a = new JComboBox<>(Doctor);
                    a.setBounds(250,100,200,20);
                   
                    l3 = new JLabel("DOCTOR'S QUALIFICATIONS");
                    l3.setBounds(500,100,200,20);
                    
                    String Qua[]= {"MBBS","MD","FCPL"};
                    JComboBox<String> b = new JComboBox<>(Qua);
                    b.setBounds(700,100,200,20);
                    
                    l4 = new JLabel("DOCTOR'S STATUS");
                    l4.setBounds(100,140,200,20);
                    
                    String Spe[]= {"Available","Not Available"};
                    JComboBox<String> c = new JComboBox<>(Spe);
                    c.setBounds(250,140,200,20);
                    
                    l5 = new JLabel("DOCTOR'S SPECIALIZATION");
                    l5.setBounds(500,140,200,20);
                   
                    String Sta[]= {"Surgeon","Dermatologist","Orthopedist","Urologist","Neurologist"};
                    JComboBox<String> d = new JComboBox<>(Sta);
                    d.setBounds(700,140,200,20);
                    
                    l6 = new JLabel("TIME");
                    l6.setBounds(100,180,200,20);
                    
                    String time[]= {"8am to 9am","12pm to 1pm","5pm to 6pm","8pm to 9pm"};
                    JComboBox<String> f = new JComboBox<>(time);
                    f.setBounds(250,180,200,20);
                    
                    l7 = new JLabel("DATE");
                    l7.setBounds(500,180,200,20);
                    
                    tf1 = new JTextField();
            		tf1.setBounds(700,180,150,20);
            		
            		l8 = new JLabel("APPOINTMENTS");
                    l8.setBounds(100,220,200,20);
                    
                    SpinnerModel abc= new SpinnerNumberModel(5,0,10,1);
                    JSpinner spinner =new JSpinner(abc);
                    spinner.setBounds(250,220,50,20);
                    
                    
                    b3 = new JButton("SAVE CHANGES");
                    b3.setBounds(300,400,200,30);
                    
                    b4 = new JButton("GO BACK");
                    b4.setBounds(650,400,200,30);
                   
                    
                    b3.addActionListener(new ActionListener()
                    
                    {
                        public void actionPerformed(ActionEvent e)
                        
                        {
                        	
                        	if(e.getSource()==b3) 
                        		
                        	{
                        		JOptionPane.showMessageDialog(h,"Doctors Details Saved Successfully");
                        		
                        		String s1 = (String) a.getSelectedItem();
                        		String s2 = (String) b.getSelectedItem();
                        		String s3 = (String) c.getSelectedItem();
                        		String s4 = (String) d.getSelectedItem();
                        		String s5 = (String) f.getSelectedItem();
                        		String s6 = tf1.getText();
                        		int s7 = (int) spinner.getValue();
                        		
                        		showDoctorsDetails(s1,s2,s3,s4,s5,s6,s7);
                        		
                        	}
                        	
                        	else
                        		
                        	{
                        		JOptionPane.showMessageDialog(h, "Changes not saved");
                        	}
                    
                        }
                        
                        private void showDoctorsDetails(String s1, String s2, String s3, String s4, String s5,
								String s6, int s7)
                        
                        {
							
							JFrame k = new JFrame("DOCTOR'S DETAILS");
							
							k.setSize(1920,1080);
							k.setLayout(null);
							k.setVisible(true);
							
							l1 = new JLabel("Doctors Details");
							l1.setBounds(530,50,200,20);
							
							l2 = new JLabel("Doctor's Name:  " + s1);
							l2.setBounds(50,80,200,20);
							
							l3 = new JLabel("Doctor's Qualification:  " + s2);
							l3.setBounds(50,110,200,20);
							
							l4 = new JLabel("Doctor's Status:  " + s3);
							l4.setBounds(50,140,200,20);
							
							l5 = new JLabel("Doctor's Specialization:  " + s4);
							l5.setBounds(50,170,200,20);
							
							l6 = new JLabel("Time:  " + s5);
							l6.setBounds(50,200,200,20);
							
							l7 = new JLabel("Date:  " + s6);
							l7.setBounds(50,230,200,20);
							
							l8 = new JLabel("Appointments:  " + s7);
							l8.setBounds(50,260,200,20);
							
							b1 = new JButton("Go Back");
							b1.setBounds(530,400,200,30);
							
							b1.addActionListener(new ActionListener()
							
							{

								public void actionPerformed(ActionEvent e)
								
								{
									
									if(e.getSource()==b1) 
										
									{
										k.dispose();
										h.setVisible(true);
									}
									
								}
											
							});
							
							
							k.add(l1);
							k.add(l2);
							k.add(l3);
							k.add(l4);
							k.add(l5);
							k.add(l6);
							k.add(l7);
							k.add(l8);
							k.add(b1);
							
                        }
                        
                    });
                    
                    b4.addActionListener(new ActionListener()
                    
                    {
                        public void actionPerformed(ActionEvent e) 
                        
                        {
                        	
                        	if(e.getSource()==b4)
                        		
                        	{
                        		h.dispose();
                        		g.setVisible(true);
                        	}
                        	
                        }
                        
                    });
                    
                    
                    h.add(l1);
                    h.add(l2);
                    h.add(l3);
                    h.add(l4);
                    h.add(l5);
                    h.add(l6);
                    h.add(l7);
                    h.add(l8);
                    h.add(tf1);
                    h.add(spinner);
                    h.add(a);
                    h.add(b);
                    h.add(c);
                    h.add(d);
                    h.add(f);
                    h.add(b3);
                    h.add(b4);
                    
                }
                
            }); 
            
            b2.addActionListener(new ActionListener() 
            
            {
            	
                public void actionPerformed(ActionEvent e)
                
                {
               
                	 JFrame i = new JFrame("Patient");
                	 
                	 i.setSize(1920,1080);
                     i.setLayout(null);
                     i.setVisible(true);
                	
                     l1 = new JLabel("ENTER DETAILS OF PATIENTS");
                     l1.setBounds(530,50,200,20);
                     
                     l2 = new JLabel("PATIENT NAME");
                     l2.setBounds(100,100,200,20);
                     
                     tf1 = new JTextField();
                     tf1.setBounds(250,100,150,20);
                     
                     l3 = new JLabel("PATIENT F/NAME");
                     l3.setBounds(500,100,200,20);
                     
                     tf2 = new JTextField();
                     tf2.setBounds(650,100,150,20);
                     
                     l4 = new JLabel("PATIENT GENDER");
                     l4.setBounds(100,140,200,20);
                     
                     JRadioButton r1 = new JRadioButton("Male");
                     JRadioButton r2 = new JRadioButton("Female");
                     
                     r1.setBounds(250,140,70,20);
                     r2.setBounds(330,140,70,20);
                     
                     ButtonGroup bg = new ButtonGroup();
                     bg.add(r1);bg.add(r2);
                     
                     l5 = new JLabel("PATIENT AGE");
                     l5.setBounds(500,140,200,20);
                     
                     SpinnerModel abc= new SpinnerNumberModel(0,0,100,1);
                     JSpinner spinner =new JSpinner(abc);
                     spinner.setBounds(650,140,50,20);
                     
                     l6 = new JLabel("PATIENT CNIC");
                     l6.setBounds(100,180,200,20);
                     
                     tf3 = new JTextField();
                     tf3.setBounds(250,180,150,20);
        
                     l7 = new JLabel("PATIENT PHONE NO");
                     l7.setBounds(500,180,200,20);
                     
                     tf4 = new JTextField();
                     tf4.setBounds(650,180,150,20);
                     
                     l8 = new JLabel("PATIENT ILLENESS");
                     l8.setBounds(100,220,200,20);
                     
                     tf5 = new JTextField();
                     tf5.setBounds(250,220,150,20);
                     
                     l9 = new JLabel("PATIENT BLOOD GROUP");
                     l9.setBounds(500,220,200,20);
                     
                     tf6 = new JTextField();
                     tf6.setBounds(650,220,150,20);
                     
                     l10 = new JLabel("PATIENT ADDRESS");
                     l10.setBounds(100,260,200,20);
                     
                     tf7 = new JTextField();
                     tf7.setBounds(250,260,400,100);
                    
                     
                     b5 = new JButton("SAVE CHANGES");
                     b5.setBounds(300,400,200,30);
                     
                     b6 = new JButton("GO BACK");
                     b6.setBounds(650,400,200,30);
                     
                     
                     
                     b5.addActionListener(new ActionListener() 
                     
                     {
                    	 
                    	 public void actionPerformed(ActionEvent e)
                    	 
                    	 {
                    		 
                    		 if(e.getSource()==b5)
                    			 
                    		 { 
                    			 
                    			 JOptionPane.showMessageDialog(i,"Patient Details Saved Successfully");
                    		 
                    			 String s1 = tf1.getText();
                    			 String s2 = tf2.getText();
                    			 String s3 = r2.getText();r1.getText();
                    			 int s4 = (int) spinner.getValue();
                    			 String s5 = tf3.getText();
                    			 String s6 = tf4.getText();
                    			 String s7 = tf5.getText();
                    			 String s8 = tf6.getText();
                    			 String s9 = tf7.getText();
                    		 
                    			 showPatientDetails(s1,s2,s3,s4,s5,s6,s7,s8,s9);
                         		
                    		 }
                    		 
                    		 else
                         		
                         	{
                         		JOptionPane.showMessageDialog(i, "Changes not saved");
                         	}
                    		 
                    	 }

                    	 private void showPatientDetails(String s1, String s2, String s3,int s4,String s5,
								String s6, String s7, String s8, String s9) 
                    	 
						{
							JFrame j = new JFrame("Patients Details");
							
							j.setSize(1920,1080);
							j.setLayout(null);
							j.setVisible(true);
							
							l1 = new JLabel("PATIENTS DETAILS");
							l1.setBounds(530,50,200,20);
							
							l2 = new JLabel("Patients Name:  " + s1);
							l2.setBounds(50,80,200,20);
							
							l3 = new JLabel("Patients F/Name:  " + s2);
							l3.setBounds(50,110,200,20);
							
							l4 = new JLabel("Patients Gender:  " + s3 );
							l4.setBounds(50,140,200,20);
							
							l5 = new JLabel("Patients Age:  " + s4);
							l5.setBounds(50,170,200,20);
							
							l6 = new JLabel("Patients Cnic:  " + s5);
							l6.setBounds(50,200,200,20);
							
							l7 = new JLabel("Patients Phone No:  " + s6);
							l7.setBounds(50,230,200,20);
							
							l8 = new JLabel("Patients Illeness:  " + s7);
							l8.setBounds(50,260,200,20);
							
							l9 = new JLabel("Patients Blood Group:  " + s8);
							l9.setBounds(50,290,200,20);
							
							l10 = new JLabel("Patients Address:  " + s9);
							l10.setBounds(50,320,200,20);
							
							b1 = new JButton("Go Back");
							b1.setBounds(530,400,200,30);
							
							b1.addActionListener(new ActionListener()
							
							{

								public void actionPerformed(ActionEvent e)
								
								{
									if(e.getSource()==b1)
										
									{
										j.dispose();
										i.setVisible(true);
									}
									
								}
								
							});
							
							j.add(l1);
							j.add(l2);
							j.add(l3);
							j.add(l4);
							j.add(l5);
							j.add(l6);
							j.add(l7);
							j.add(l8);
							j.add(l9);
							j.add(l10);
							j.add(b1);
							
						}	 
                     });
                     
                     b6.addActionListener(new ActionListener()
                     
                     {
                    	 
                    	 public void actionPerformed(ActionEvent e)
                    	 
                    	 {
                    		 if(e.getSource()==b6)
                         		
                         	{
                         		
                    			 i.dispose();
                    			 g.setVisible(true);
                         	}
                         	 
                    	 }	 
                     });
                     
                     i.add(tf1);
                     i.add(tf2);
                     i.add(tf3);
                     i.add(tf4);
                     i.add(tf5);
                     i.add(tf6);
                     i.add(tf7);
                     i.add(l1);
                     i.add(l2);
                     i.add(l3);
                     i.add(l4);
                     i.add(l5);
                     i.add(l6);
                     i.add(l7);
                     i.add(l8);
                     i.add(l9);
                     i.add(l10);
                     i.add(r1);
                     i.add(r2);
                     i.add(spinner);
                     i.add(b5);
                     i.add(b6);
                	
                	
                }
                
            });
       
        }
         
	}

	public static void main(String[] args) 
	{
			new hsystem();
	}

}

