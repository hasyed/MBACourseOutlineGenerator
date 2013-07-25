/*
 * Created by JFormDesigner on Mon Jan 21 16:13:18 PKT 2013
 */

package com.Iba.Mba;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.Iba.Mba.DB.MySQLAccess;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Hasan Asghar
 */
public class page1 extends JFrame {
	/**
	 * 
	 */
	public static int classNbr;
	private static final long serialVersionUID = 1L;
	public page1() {
		initComponents();
	}

	public static void main (String args[]){
		
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	page1 GUI = new page1();
	                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                GUI.setSize(1200, 700);
	                GUI.setVisible(true);
	              
	            }
	        });
	}

	private void submitMouseClicked(MouseEvent e) {
		// TODO add your code here
		  MySQLAccess dao = new MySQLAccess();
          try {
        	  classNbr=Integer.parseInt(textField1.getText());
        	  dao.readDataBase(classNbr,textField2.getText(),textField11.getText(),textField3.getText(),textField8.getText(),Integer.parseInt(textField5.getText()),textField6.getText(),Integer.parseInt(textField7.getText()),textField12.getText(),textField8.getText(),textField9.getText(),Integer.parseInt(textField10.getText()),textPane1.getText(),textPane2.getText(),textPane3.getText(),textPane4.getText(),textPane5.getText());
        	  
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private void nextPageMouseClicked(MouseEvent e) {
		// TODO add your code here
		System.out.println(classNbr);
		page3 GUI = new page3(classNbr);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setSize(1200, 700);
        GUI.setVisible(true);
        this.setVisible(false);
		
	}


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hasan Asghar
		frame1 = new JFrame();
		label1 = new JLabel();
		textField1 = new JTextField();
		label4 = new JLabel();
		textField6 = new JTextField();
		label11 = new JLabel();
		textField11 = new JTextField();
		label5 = new JLabel();
		textField7 = new JTextField();
		label2 = new JLabel();
		textField2 = new JTextField();
		label6 = new JLabel();
		textField12 = new JTextField();
		label8 = new JLabel();
		textField3 = new JTextField();
		label12 = new JLabel();
		textField8 = new JTextField();
		label7 = new JLabel();
		textField4 = new JTextField();
		label9 = new JLabel();
		textField9 = new JTextField();
		label3 = new JLabel();
		textField5 = new JTextField();
		label10 = new JLabel();
		textField10 = new JTextField();
		label13 = new JLabel();
		scrollPane1 = new JScrollPane();
		textPane1 = new JTextPane();
		label14 = new JLabel();
		scrollPane2 = new JScrollPane();
		textPane2 = new JTextPane();
		label15 = new JLabel();
		scrollPane3 = new JScrollPane();
		textPane3 = new JTextPane();
		label16 = new JLabel();
		scrollPane4 = new JScrollPane();
		textPane4 = new JTextPane();
		label17 = new JLabel();
		scrollPane5 = new JScrollPane();
		textPane5 = new JTextPane();
		button1 = new JButton();
		button2 = new JButton();

		//======== frame1 ========
		{
			frame1.setTitle("MBA Course");
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new FormLayout(
				"default, $lcgap, default",
				"default"));

			//======== this ========
			{

				// JFormDesigner evaluation mark
		/*		this.setBorder(new javax.swing.border.CompoundBorder(
					new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
						"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
						javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
						java.awt.Color.red), this.getBorder())); this.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});
*/
				this.setLayout(new FormLayout(
					"21dlu, $lcgap, 116dlu, $lcgap, 125dlu, $lcgap, 22dlu, $lcgap, 109dlu, $lcgap, 127dlu",
					"default, $lgap, 18dlu, $lgap, default, $lgap, 15dlu, $lgap, default, 2*($lgap), default, $lgap, bottom:1dlu, 18dlu, 19dlu, default, 40dlu, 7dlu, default, 41dlu, 7dlu, default, 39dlu, 7dlu, default, 37dlu, 7dlu, default, 37dlu, 25dlu"));

				//---- label1 ----
				label1.setText("Class Code:");
				this.add(label1, CC.xy(3, 3));
				this.add(textField1, CC.xy(5, 3));

				//---- label4 ----
				label4.setText("Session Days");
				this.add(label4, CC.xy(9, 3));
				this.add(textField6, CC.xy(11, 3));

				//---- label11 ----
				label11.setText("Course Name");
				this.add(label11, CC.xy(3, 5));
				this.add(textField11, CC.xy(5, 5));

				//---- label5 ----
				label5.setText("Credit Hours");
				this.add(label5, CC.xy(9, 5));
				this.add(textField7, CC.xy(11, 5));

				//---- label2 ----
				label2.setText("Class Type");
				this.add(label2, CC.xy(3, 7));
				this.add(textField2, CC.xy(5, 7));

				//---- label6 ----
				label6.setText("Course Prerequisites");
				this.add(label6, CC.xy(9, 7));
				this.add(textField12, CC.xy(11, 7));

				//---- label8 ----
				label8.setText("Instructor");
				this.add(label8, CC.xy(3, 9));
				this.add(textField3, CC.xy(5, 9));

				//---- label12 ----
				label12.setText("Consultation Time");
				this.add(label12, CC.xy(9, 9));
				this.add(textField8, CC.xy(11, 9));

				//---- label7 ----
				label7.setText("Class timings");
				this.add(label7, CC.xy(3, 12));
				this.add(textField4, CC.xy(5, 12));

				//---- label9 ----
				label9.setText("Email");
				this.add(label9, CC.xy(9, 12));
				this.add(textField9, CC.xy(11, 12));

				//---- label3 ----
				label3.setText("Room #");
				this.add(label3, CC.xy(3, 15));
				this.add(textField5, CC.xy(5, 15));

				//---- label10 ----
				label10.setText("Contacts");
				this.add(label10, CC.xy(9, 15));
				this.add(textField10, CC.xy(11, 15));

				//---- label13 ----
				label13.setText("Course Description");
				this.add(label13, CC.xywh(3, 17, 1, 2));

				//======== scrollPane1 ========
				{
					scrollPane1.setViewportView(textPane1);
				}
				this.add(scrollPane1, CC.xywh(5, 17, 7, 2));

				//---- label14 ----
				label14.setText("Course Objective");
				this.add(label14, CC.xywh(3, 20, 1, 2));

				//======== scrollPane2 ========
				{
					scrollPane2.setViewportView(textPane2);
				}
				this.add(scrollPane2, CC.xywh(5, 20, 7, 2));

				//---- label15 ----
				label15.setText("Teaching and Learning Methodology");
				this.add(label15, CC.xywh(3, 23, 1, 2, CC.FILL, CC.FILL));

				//======== scrollPane3 ========
				{
					scrollPane3.setViewportView(textPane3);
				}
				this.add(scrollPane3, CC.xywh(5, 23, 7, 2));

				//---- label16 ----
				label16.setText("TextBookAndPreCourseReading");
				this.add(label16, CC.xywh(3, 26, 1, 2));

				//======== scrollPane4 ========
				{
					scrollPane4.setViewportView(textPane4);
				}
				this.add(scrollPane4, CC.xywh(5, 26, 7, 2));

				//---- label17 ----
				label17.setText("PrerequisiteSkilleAndKnowledge");
				this.add(label17, CC.xy(3, 30));

				//======== scrollPane5 ========
				{
					scrollPane5.setViewportView(textPane5);
				}
				this.add(scrollPane5, CC.xywh(5, 29, 7, 2));

				//---- button1 ----
				button1.setText("Submit");
				button1.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						submitMouseClicked(e);
					}
				});
				this.add(button1, CC.xy(5, 31));

				//---- button2 ----
				button2.setText("Next");
				button2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						nextPageMouseClicked(e);
					}
				});
				this.add(button2, CC.xy(11, 31));
			}
//			frame1ContentPane.add(this, CC.xy(1, 1));
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Hasan Asghar
	private JFrame frame1;
	private JLabel label1;
	private JTextField textField1;
	private JLabel label4;
	private JTextField textField6;
	private JLabel label11;
	private JTextField textField11;
	private JLabel label5;
	private JTextField textField7;
	private JLabel label2;
	private JTextField textField2;
	private JLabel label6;
	private JTextField textField12;
	private JLabel label8;
	private JTextField textField3;
	private JLabel label12;
	private JTextField textField8;
	private JLabel label7;
	private JTextField textField4;
	private JLabel label9;
	private JTextField textField9;
	private JLabel label3;
	private JTextField textField5;
	private JLabel label10;
	private JTextField textField10;
	private JLabel label13;
	private JScrollPane scrollPane1;
	private JTextPane textPane1;
	private JLabel label14;
	private JScrollPane scrollPane2;
	private JTextPane textPane2;
	private JLabel label15;
	private JScrollPane scrollPane3;
	private JTextPane textPane3;
	private JLabel label16;
	private JScrollPane scrollPane4;
	private JTextPane textPane4;
	private JLabel label17;
	private JScrollPane scrollPane5;
	private JTextPane textPane5;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
