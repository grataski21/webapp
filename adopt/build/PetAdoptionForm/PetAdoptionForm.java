package PetAdoptionForm;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

/**
 * 
 * @author Grant
 * Creates an interactive Pet Adoption form using a combination of jlabel, jcombobox to bring up an adoption form
 */
public class PetAdoptionForm 
extends JFrame 
implements ActionListener {

	 private Container c;
	 private JLabel title; 
	    private JLabel name; 
		private JTextField tname; 
		private JLabel id; 
		private JTextField tid; 
	    private JTextField tmno; 
	    private JLabel gender; 
	    private JRadioButton male; 
	    private JRadioButton female; 
	    private ButtonGroup gengp; 
	    private JLabel dob; 
	    private JComboBox date; 
	    private JComboBox month; 
	    private JComboBox year; 
	    private JLabel typ;
		private JComboBox type;
	    private JLabel add; 
	    private JTextArea tadd; 
	    private JCheckBox term; 
	    private JButton sub; 
	    private JButton reset; 
	    private JTextArea tout; 
	    private JLabel res; 
	    private JLabel res2;
	    private JTextArea resadd; 
	  
	    //Allowed dates in simple text array
	    private String dates[] 
	        = { "1", "2", "3", "4", "5", 
	            "6", "7", "8", "9", "10", 
	            "11", "12", "13", "14", "15", 
	            "16", "17", "18", "19", "20", 
	            "21", "22", "23", "24", "25", 
	            "26", "27", "28", "29", "30", 
	            "31" }; 
	  //Allowed months in simple text array
	    private String months[] 
	        = { "Jan", "feb", "Mar", "Apr", 
	            "May", "Jun", "July", "Aug", 
	            "Sup", "Oct", "Nov", "Dec" }; 
	  //Allowed years in simple text array
	    private String years[] 
	        = { "1995", "1996", "1997", "1998", 
	            "1999", "2000", "2001", "2002", 
	            "2003", "2004", "2005", "2006", 
	            "2007", "2008", "2009", "2010", 
	            "2011", "2012", "2013", "2014", 
	            "2015", "2016", "2017", "2018", 
	            "2019", "2020" }; 
	  
	 // allowed types in simple text array
	    private String types[]
				= { "Dog", "Cat", "Lizard", "Hamster", "GoldFish" };
	    
	    // constructor, to initialize the components 
	    public PetAdoptionForm() 
	    { 
	    	//Changed name on pop-up window
	        setTitle("Pet Adoption Form"); 
	        setBounds(300, 90, 900, 600); 
	        setDefaultCloseOperation(EXIT_ON_CLOSE); 
	        setResizable(false); 
	  
	        c = getContentPane(); 
	        c.setLayout(null); 
	  
	      /**
	       * JLabel for the title of the pop-up window
	       */
	        title = new JLabel("Pet Adoption Form"); 
	        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	        title.setSize(300, 30); 
	        title.setLocation(300, 30); 
	        c.add(title);
	  
	      //pet name label
	        name = new JLabel("Pet Name"); 
			name.setFont(new Font("Arial", Font.PLAIN, 20)); 
			name.setSize(100, 20); 
			name.setLocation(100, 100); 
			c.add(name); 

			// layout for box to type name in 
			tname = new JTextField(); 
			tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
			tname.setSize(190, 20); 
			tname.setLocation(200, 100); 
			c.add(tname); 

			// tag id label
			id = new JLabel("Tag ID #"); 
			id.setFont(new Font("Arial", Font.PLAIN, 20)); 
			id.setSize(100, 20); 
			id.setLocation(100, 150); 
			c.add(id); 

			//layout for box to type tag id in 
			tid = new JTextField(); 
			tid.setFont(new Font("Arial", Font.PLAIN, 15)); 
			tid.setSize(150, 20); 
			tid.setLocation(200, 150); 
			c.add(tid);   
	        
			// type label
			typ = new JLabel("Type"); 
			typ.setFont(new Font("Arial", Font.PLAIN, 20)); 
			typ.setSize(100, 20); 
			typ.setLocation(100, 200); 
			c.add(typ); 
			
			// comobo box for enum to pull down different types
			type = new JComboBox(types);
			type.setFont(new Font("Arial", Font.PLAIN, 15)); 
			type.setSize(100, 20); 
			type.setLocation(200, 200); 
			c.add(type);
			
			/**
			 * JLabel for the Gender field
			 */
			gender = new JLabel("Gender"); 
	        gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        gender.setSize(100, 20); 
	        gender.setLocation(100, 250); 
	        c.add(gender); 
	  
	      /**
	       * JButton for "male" option for Gender field
	       */
	        male = new JRadioButton("Male"); 
	        male.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        male.setSelected(true); 
	        male.setSize(75, 20); 
	        male.setLocation(200, 250); 
	        c.add(male); 
	  
	        /**
		       * JButton for "female" option for Gender field
		       */
	        female = new JRadioButton("Female"); 
	        female.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        female.setSelected(false); 
	        female.setSize(80, 20); 
	        female.setLocation(275, 250); 
	        c.add(female); 
	  
	        /**
	         * ButtonGroup for the "male" and "female" buttons
	         */
	        gengp = new ButtonGroup(); 
	        gengp.add(male); 
	        gengp.add(female); 
	  
	        /**
	         * JLabel for the Date of Birth field
	         */
	        dob = new JLabel("DOB"); 
	        dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        dob.setSize(100, 20); 
	        dob.setLocation(100, 300); 
	        c.add(dob); 
	  
	      /**
	       * enum for "day" slot in the Date of Birth field
	       */
	        date = new JComboBox(dates); 
	        date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(50, 20); 
	        date.setLocation(265, 300); 
	        c.add(date); 
	  
	        /**
		       * enum for "month" slot in the Date of Birth field
		       */
	        month = new JComboBox(months); 
	        month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(60, 20); 
	        month.setLocation(200, 300); 
	        c.add(month); 
	  
	        /**
		       * enum for "year" slot in the Date of Birth field
		       */
	        year = new JComboBox(years); 
	        year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(60, 20); 
	        year.setLocation(320, 300); 
	        c.add(year); 
	  
	      /**
	       * JLabel for "Fur Color" field
	       */
	        add = new JLabel("Fur Color:"); 
	        add.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        add.setSize(100, 20); 
	        add.setLocation(100, 350); 
	        c.add(add); 
	  
	      /**
	       * Text area for user input for "Fur Color" field
	       */
	        tadd = new JTextArea(); 
	        tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tadd.setSize(230, 30); 
	        tadd.setLocation(200, 350); 
	        tadd.setLineWrap(true); 
	        c.add(tadd); 
	  
	        /**
	         * Check box for accepting the terms and conditions
	         */
	        term = new JCheckBox("Accept Terms And Conditions."); 
	        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        term.setSize(250, 20); 
	        term.setLocation(150, 425); 
	        c.add(term); 
	  
	        /**
	         * JButton for submitting the finished adoption form
	         */
	        sub = new JButton("Submit"); 
	        sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        sub.setSize(100, 20); 
	        sub.setLocation(150, 475); 
	        sub.addActionListener(this); 
	        c.add(sub); 
	  
	        /**
	         * JButton for resetting the adoption form
	         */
	        reset = new JButton("Reset"); 
	        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        reset.setSize(100, 20); 
	        reset.setLocation(270, 475); 
	        reset.addActionListener(this); 
	        c.add(reset); 
	  
	        /**
	         * Output text area for finished adoption form information inputed by user
	         */
	        tout = new JTextArea(); 
	        tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        tout.setSize(300, 400); 
	        tout.setLocation(500, 100); 
	        tout.setLineWrap(true); 
	        tout.setEditable(false); 
	        c.add(tout); 
	  
	        /**
	         * JLabel placeholder for "Adoption Submitted"
	         */
	        res = new JLabel(""); 
	        res.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        res.setSize(500, 25); 
	        res.setLocation(170, 515); 
	        c.add(res); 
	        
	        /**
	         * JLabel placeholder for "Please Accept the Terms and Conditions"
	         */
	        res2 = new JLabel(""); 
	        res2.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        res2.setSize(500, 25); 
	        res2.setLocation(120, 515); 
	        c.add(res2);
	  
	        resadd = new JTextArea(); 
	        resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        resadd.setSize(200, 75); 
	        resadd.setLocation(580, 175); 
	        resadd.setLineWrap(true); 
	        c.add(resadd); 
	  
	        setVisible(true); 
	    } 
	  
	    // method actionPerformed() 
	    // to get the action performed by the user and act accordingly 
	    public void actionPerformed(ActionEvent e) 
	    { 
	        if (e.getSource() == sub) { 
	           
	        	if (term.isSelected()) { 
	                String data1; 
	                
	                /**
		        	 * Concatenating the user inputs for Pet Name, Tag ID#, and Gender into one string
		        	 */
	                String data 
					= "Pet Name : "
					+ tname.getText() + "\n"
					+ "Tag iD # : "
					+ tid.getText() + "\n"; 
	                
	                if (male.isSelected()) 
	                    data1 = "Gender : Male"
	                            + "\n"; 
	                else
	                    data1 = "Gender : Female"
	                            + "\n"; 
	               
	                /**
		        	 * Concatenating the user inputs for DOB into one string
		        	 */
	                String data2 
	                    = "DOB : "
	                      + (String)month.getSelectedItem() 
	                      + "/" + (String)date.getSelectedItem() 
	                      + "/" + (String)year.getSelectedItem() 
	                      + "\n"; 
	  
	                /**
		        	 * Concatenating the user inputs for Fur Color into one string
		        	 */
	                String data3 = "Fur Color : " + tadd.getText(); 
	                tout.setText(data + data1 + data2 + data3); 
	                tout.setEditable(false); 
	                res.setText("Adoption Submited."); 
	                
	                
	              
					String data4
						= "Type : "
						+ (String)type.getSelectedItem()
						+ "\n";
	            } 
	            else { 
	                tout.setText(""); 
	                resadd.setText(""); 
	                res2.setText("Please accept the"
	                            + " terms & conditions."); 
	            } 
	        } 
	  
	        else if (e.getSource() == reset) { 
	            String def = ""; 
	            
	            tname.setText(def); 
				tadd.setText(def); 
				tid.setText(def); 
	            res.setText(def);
	            res2.setText(def);
	            tout.setText(def); 
	            term.setSelected(false); 
	            date.setSelectedIndex(0); 
	            month.setSelectedIndex(0); 
	            year.setSelectedIndex(0);  
				type.setSelectedIndex(0);
	            resadd.setText(def); 
	        } 
	    } 
	} 
	
