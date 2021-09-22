//All Liberary or Class Liberary are added

import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import java.awt.*;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JFrame implements ActionListener{
	 
	// Create Container Class of object
	 private Container cont;
	
	 // create a textfield class of object
	 private JTextField textDisplay;
	
	/* -----------------------------------------------
	  		Store the operator and operands value
	 -------------------------------------------------*/
	 String startValue, operatorSign, lastValue;
	 
	
	/* ------------------------------------------------
	  		Call a Calculator class of Constructor 
	 --------------------------------------------------*/
	Calculator(){
		startValue = operatorSign = lastValue = "";
		intializeComponents();
	}
	
	
	public void intializeComponents() {
		/* -------------------------------------------
		 		Container setup
		---------------------------------------------- */
		cont = this.getContentPane();
		cont.setLayout(null);
     	cont.setBackground(Color.CYAN);
		
		//Font size for textField
	     Font textFont = new Font("Arial",Font.BOLD,28);
		
	     textDisplay = new JTextField(16);
	     textDisplay.setFont(textFont);
	     textDisplay.setBackground(Color.WHITE);
		
		 
		 // textfield to non-editable
	     textDisplay.setEditable(false);
	     
	     
	     /* ----------------------------------------------------
	       		Create number buttons and some operators
	      -----------------------------------------------------*/
	     
	     JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd, btnSub, btnDiv, btnMul, btnPoint, btnClr, btnEqual,btnMod,btnEx1,btnEx2;
	     
	     /* ------------------------------------------
				Create number buttons
	 	 --------------------------------------------- */
	     btn0 = new JButton("0");
	     btn1 = new JButton("1");
	     btn2 = new JButton("2");
	     btn3 = new JButton("3");
	     btn4 = new JButton("4");
	     btn5 = new JButton("5");
	     btn6 = new JButton("6");
	     btn7 = new JButton("7");
	     btn8 = new JButton("8");
	     btn9 = new JButton("9");

	     // equals button
	     btnEqual = new JButton("=");

	     // create operator buttons
	     btnAdd = new JButton("+");
	     btnSub = new JButton("-");
	     btnDiv = new JButton("/");
	     btnMul = new JButton("×");
	     btnClr = new JButton("C");
	     btnMod = new JButton("Mod");
	     
	     // create fraction point button
	     btnPoint = new JButton(".");
	     
	     
	     //extra button for features updates
	     btnEx1 = new JButton("Ex1");
	     btnEx2 = new JButton("Ex2");
	     
	     /* ------------------------------------------
			Create Front class of object
	 	 --------------------------------------------- */
	     Font btnFont = new Font("Arial",Font.BOLD,18);
	     
	     btn0.setFont(btnFont);
	     btn1.setFont(btnFont);
	     btn2.setFont(btnFont);
	     btn3.setFont(btnFont);
	     btn4.setFont(btnFont);
	     btn5.setFont(btnFont);
	     btn6.setFont(btnFont);
	     btn7.setFont(btnFont);
	     btn8.setFont(btnFont);
	     btn9.setFont(btnFont);
	     btnEqual.setFont(btnFont);
	     btnAdd.setFont(btnFont);
	     btnSub.setFont(btnFont);
	     btnMul.setFont(btnFont);
	     btnDiv.setFont(btnFont);
	     btnPoint.setFont(btnFont);
	     btnMod.setFont(btnFont);
	     btnClr.setFont(btnFont);
	     
	     btnEx1.setFont(btnFont);
	     btnEx2.setFont(btnFont);
	     
	     /* ------------------------------------------
	   			Create GridLayout class of object
	 	 --------------------------------------------- */
	     GridLayout grid = new GridLayout(5,4);
	     grid.setHgap(5);
	     grid.setVgap(5);

		
		
		/* --------------------------------------------
		 		Create Jpanel Class object panel1
		----------------------------------------------- */
		JPanel panel1 = new JPanel();
		panel1.setBounds(30,20,430,50);
		panel1.setBackground(Color.LIGHT_GRAY);
		
		
		panel1.add(textDisplay);
		cont.add(panel1);
		
		/* --------------------------------------------
 				Create Jpanel Class object panel1
		----------------------------------------------- */
		 JPanel panel2 = new JPanel();
		 
		 /* ------------------------------------------
		   		Add action listeners in button
		 --------------------------------------------- */
		btnMod.addActionListener(this);
		btnMul.addActionListener(this);
		btnDiv.addActionListener(this);
		btnSub.addActionListener(this);
		btnAdd.addActionListener(this);
		btn9.addActionListener(this);
		btn8.addActionListener(this);
		btn7.addActionListener(this);
		btn6.addActionListener(this);
		btn5.addActionListener(this);
		btn4.addActionListener(this);
		btn3.addActionListener(this);
		btn2.addActionListener(this);
		btn1.addActionListener(this);
		btn0.addActionListener(this);
		btnPoint.addActionListener(this);
		btnClr.addActionListener(this);
		btnEqual.addActionListener(this);
		 
		
		/* ------------------------------------------
   				Add all button in panel2
 		--------------------------------------------- */
		 panel2.setLayout(grid);
		 
		 panel2.add(btnEx1);
	     panel2.add(btnEx2);
	     panel2.add(btnClr);
	     panel2.add(btnMod);
	     
	     panel2.add(btn7);
	     panel2.add(btn8);
	     panel2.add(btn9);	    
	     panel2.add(btnAdd);
	     
	     panel2.add(btn4);
	     panel2.add(btn5);
	     panel2.add(btn6);
	     panel2.add(btnSub);
	     
	     
	     panel2.add(btn1);
	     panel2.add(btn2);
	     panel2.add(btn3);	     
	     panel2.add(btnMul);
	     
	     
	     panel2.add(btnPoint);	     
	     panel2.add(btn0);
	     panel2.add(btnEqual);
	     panel2.add(btnDiv);
	     
	     
		 panel2.setBounds(50,75,390,380);
//		 panel2.setBackground(Color.gray);
		 cont.add(panel2);
		 
		 
	     
	     /* --------------------------------------------------------
	      				Mouse hover in All Button
	     -----------------------------------------------------------*/
	 	btn0.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn0.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn0.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btn1.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn1.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn1.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btn2.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn2.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn2.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btn3.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn3.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn3.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btn4.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn4.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn4.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btn5.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn5.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn5.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btn6.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn6.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn6.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btn7.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn7.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn7.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btn8.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn8.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn8.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btn9.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btn9.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btn9.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	
	 	
	 	
	 	btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnAdd.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnAdd.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btnSub.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnSub.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnSub.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btnMul.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnMul.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnMul.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btnDiv.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnDiv.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnDiv.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btnClr.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnClr.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnClr.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btnMod.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnMod.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnMod.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btnEqual.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnEqual.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnEqual.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btnPoint.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnPoint.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnPoint.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btnEx1.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnEx1.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnEx1.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	 	btnEx2.addMouseListener(new java.awt.event.MouseAdapter() {
	 	    public void mouseEntered(java.awt.event.MouseEvent evt) {
	 	        btnEx2.setBackground(Color.pink);
	 	    }

	 	    public void mouseExited(java.awt.event.MouseEvent evt) {
	 	        btnEx2.setBackground(UIManager.getColor("control"));
	 	    }
	 	});
	    
	 	// End Mouse hover part.
	     
	     
	    
		
	}
	
	public void actionPerformed(ActionEvent e)
	 {
	     try {
	    	 
	    	 String current = e.getActionCommand();
		     
		     

		     // When the value is a number
		     if ((current.charAt(0) >= '0' && current.charAt(0) <= '9') || current.charAt(0) == '.') {
		         // if operand is present, add to second no
		         if (!operatorSign.equals(""))
		        	 lastValue = lastValue + current ;
		         else
		        	 startValue = startValue + current ;

		         // set the value of text
		         textDisplay.setText(startValue + operatorSign + lastValue);
		     }
		     
		     
		     else if (current.charAt(0) == 'C') {
		    	
		         // Clear the Previous value
		    	 startValue = operatorSign = lastValue = "";

		         // set the value of text
		    	 textDisplay.setText(startValue + operatorSign + lastValue);
		     }
		     
		     
		     else if (current.charAt(0) == '=') {

		         double total;

		         // store the value in 1st
		         if (operatorSign.equals("+"))
		             total = (Double.parseDouble(startValue) + Double.parseDouble(lastValue));
		         else if (operatorSign.equals("-"))
		             total = (Double.parseDouble(startValue) - Double.parseDouble(lastValue));
		         else if (operatorSign.equals("/"))
		             total = (Double.parseDouble(startValue) / Double.parseDouble(lastValue));
		         else if (operatorSign.equals("×"))
		             total = (Double.parseDouble(startValue) * Double.parseDouble(lastValue));
		         else
		        	 total = (Double.parseDouble(startValue) % Double.parseDouble(lastValue));
		        	 

		         // set the value of text
		         if(total-(int)total > 0)
		        	 textDisplay.setText(startValue + operatorSign + lastValue + "=" + total);
		         else
		        	 textDisplay.setText(startValue + operatorSign + lastValue + "=" + (int)total);

		         
		         if(total-(int)total > 0) {
		        	 total = total;
		        	 // convert it to string
			         startValue = Double.toString(total);
		         }
			        	
			     else {
			            
			            // convert it to string
			            startValue = Integer.toString((int)total);
			     }

		         operatorSign = lastValue = "";
		     }
		     else {
		         // if there was no operand
		         if (operatorSign.equals("") || lastValue.equals(""))
		        	 operatorSign = current ;
		         
		         // else evaluate
		         else {
		             double total;

		             // store the value in 1st
		             if (operatorSign.equals("+"))
		                 total = (Double.parseDouble(startValue) + Double.parseDouble(lastValue));
		             else if (operatorSign.equals("-"))
		                 total = (Double.parseDouble(startValue) - Double.parseDouble(lastValue));
		             else if (operatorSign.equals("/"))
		                 total = (Double.parseDouble(startValue) / Double.parseDouble(lastValue));
		             else if (operatorSign.equals("×"))
			             total = (Double.parseDouble(startValue) * Double.parseDouble(lastValue));
			         else
			        	 total = (Double.parseDouble(startValue) % Double.parseDouble(lastValue));
		             
		             if(total-(int)total > 0)
			        	total = total;
			         else
			        	 total = (int)total;

		             // convert it to string
		             startValue = Double.toString(total);

		             // place the operator
		             operatorSign = current;
		             

		             // operand blank
		             lastValue = "";
		         }

		         
		         
		         
		         textDisplay.setText(startValue + operatorSign + lastValue);
		     }
	     }
	     catch (NumberFormatException es) {
	    	 textDisplay.setText("Error!!!");
	    	 
	      }
	 
	 }
	
	
	
	
	public static void main(String args[]) {
		
		Calculator frame = new Calculator();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50,50,500,520);
		frame.setResizable(false);
		frame.setTitle("Simple Calculator");
		
		
	
	}

}
