/*
 * Created by JFormDesigner on Fri Jan 25 22:11:42 PKT 2013
 */

package com.Iba.Mba;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.codehaus.groovy.tools.shell.commands.ExitCommand;

import report.MainApplication;

import com.Iba.Mba.DB.MySQLAccess;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Hasan Asghar
 */
public class addMarksDes extends JFrame {

	static int classNbr;
	public addMarksDes(int c) {
		initComponents();
		classNbr=c;
	}	

/*	public static void main (String args[]){
		
		 javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	addMarksDes GUI = new addMarksDes(34);
	                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                GUI.setSize(900, 400);
	                GUI.setVisible(true);
	              
	            }
	        });
	}*/


	private void nextMouseClicked(MouseEvent e) {
		// TODO add your code here
		MySQLAccess mySQLAccess = new MySQLAccess();
		String learnString[]= new String[6];
		int marks[]= new int[21];
		marks[0]=Integer.parseInt(textField1.getText());
		marks[1]=Integer.parseInt(textField2.getText());
		marks[2]=Integer.parseInt(textField3.getText());
		marks[3]=Integer.parseInt(textField4.getText());
		marks[4]=Integer.parseInt(textField6.getText());
		marks[5]=Integer.parseInt(textField7.getText());
		marks[6]=Integer.parseInt(textField8.getText());
		marks[7]=Integer.parseInt(textField9.getText());
		marks[8]=Integer.parseInt(textField11.getText());
		marks[9]=Integer.parseInt(textField17.getText());
		marks[10]=Integer.parseInt(textField18.getText());
		marks[11]=Integer.parseInt(textField19.getText());
		marks[12]=Integer.parseInt(textField21.getText());
		marks[13]=Integer.parseInt(textField22.getText());
		marks[14]=Integer.parseInt(textField23.getText());
		marks[15]=Integer.parseInt(textField24.getText());
		marks[16]=Integer.parseInt(textField26.getText());
		marks[17]=Integer.parseInt(textField27.getText());
		marks[18]=Integer.parseInt(textField28.getText());
		marks[19]=Integer.parseInt(textField29.getText());
		marks[20]=Integer.parseInt(textField31.getText());
		learnString[0]=textField5.getText();
		learnString[1]=textField10.getText();
		learnString[2]=textField20.getText();
		learnString[3]=textField25.getText();
		learnString[4]=textField30.getText();
		learnString[5]=textField32.getText();
		try {
			mySQLAccess.addMarksDestribution(marks, learnString, classNbr);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			new MainApplication(classNbr);
			this.setVisible(false);
			System.exit(0);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		//ExitCommand command= new ExitCommand(shell);
			
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hasan Asghar
		frame1 = new JFrame();
		panel2 = new JPanel();
		panel3 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		textField1 = new JTextField();
		textField2 = new JTextField();
		textField3 = new JTextField();
		textField4 = new JTextField();
		textField5 = new JTextField();
		label9 = new JLabel();
		textField6 = new JTextField();
		textField7 = new JTextField();
		textField8 = new JTextField();
		textField9 = new JTextField();
		textField10 = new JTextField();
		label10 = new JLabel();
		textField11 = new JTextField();
		textField17 = new JTextField();
		textField18 = new JTextField();
		textField19 = new JTextField();
		textField20 = new JTextField();
		label11 = new JLabel();
		textField21 = new JTextField();
		textField22 = new JTextField();
		textField23 = new JTextField();
		textField24 = new JTextField();
		textField25 = new JTextField();
		label12 = new JLabel();
		textField26 = new JTextField();
		textField27 = new JTextField();
		textField28 = new JTextField();
		textField29 = new JTextField();
		textField30 = new JTextField();
		label13 = new JLabel();
		textField31 = new JTextField();
		textField32 = new JTextField();
		panel1 = new JPanel();
		next = new JButton();
		add = new JButton();

		//======== frame1 ========
		{
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new FormLayout(
				"455dlu",
				"211dlu"));

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
					"436dlu",
					"163dlu, $lgap, default"));

				//======== panel2 ========
				{
					panel2.setLayout(new FormLayout(
						"113dlu, 3*($lcgap, 60dlu), $lcgap, 59dlu, $lcgap, 61dlu",
						"default, $lgap, 44dlu, 6*($lgap, 13dlu)"));

					//======== panel3 ========
					{
						panel3.setLayout(new FormLayout(
							"437dlu",
							"13dlu"));

						//---- label1 ----
						label1.setText("Marks Destribution");
						label1.setFont(new Font("Tahoma", Font.BOLD, 14));
						panel3.add(label1, CC.xy(1, 1, CC.CENTER, CC.DEFAULT));
					}
					panel2.add(panel3, CC.xywh(1, 1, 11, 1));

					//---- label2 ----
					label2.setText("Marks Head");
					label2.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label2, CC.xy(1, 3, CC.CENTER, CC.DEFAULT));

					//---- label3 ----
					label3.setText("Total Frequency");
					label3.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label3, CC.xy(3, 3));

					//---- label4 ----
					label4.setText("Total Exempted");
					label4.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label4, CC.xy(5, 3));

					//---- label5 ----
					label5.setText("Marks Frequency");
					label5.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label5, CC.xy(7, 3));

					//---- label6 ----
					label6.setText("Total Marks");
					label6.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label6, CC.xy(9, 3));

					//---- label7 ----
					label7.setText("Learning Outcomes");
					label7.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label7, CC.xy(11, 3));

					//---- label8 ----
					label8.setText("Assignment");
					label8.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label8, CC.xy(1, 5, CC.RIGHT, CC.DEFAULT));
					panel2.add(textField1, CC.xy(3, 5));
					panel2.add(textField2, CC.xy(5, 5));
					panel2.add(textField3, CC.xy(7, 5));
					panel2.add(textField4, CC.xy(9, 5));
					panel2.add(textField5, CC.xy(11, 5));

					//---- label9 ----
					label9.setText("Quiz");
					label9.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label9, CC.xy(1, 7, CC.RIGHT, CC.DEFAULT));
					panel2.add(textField6, CC.xy(3, 7));
					panel2.add(textField7, CC.xy(5, 7));
					panel2.add(textField8, CC.xy(7, 7));
					panel2.add(textField9, CC.xy(9, 7));
					panel2.add(textField10, CC.xy(11, 7));

					//---- label10 ----
					label10.setText("Mid Term Paper");
					label10.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label10, CC.xy(1, 9, CC.RIGHT, CC.DEFAULT));
					panel2.add(textField11, CC.xy(3, 9));
					panel2.add(textField17, CC.xy(5, 9));
					panel2.add(textField18, CC.xy(7, 9));
					panel2.add(textField19, CC.xy(9, 9));
					panel2.add(textField20, CC.xy(11, 9));

					//---- label11 ----
					label11.setText("Term Project");
					label11.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label11, CC.xy(1, 11, CC.RIGHT, CC.DEFAULT));
					panel2.add(textField21, CC.xy(3, 11));
					panel2.add(textField22, CC.xy(5, 11));
					panel2.add(textField23, CC.xy(7, 11));
					panel2.add(textField24, CC.xy(9, 11));
					panel2.add(textField25, CC.xy(11, 11));

					//---- label12 ----
					label12.setText("Final Paper");
					label12.setFont(new Font("Tahoma", Font.BOLD, 12));
					panel2.add(label12, CC.xy(1, 13, CC.RIGHT, CC.DEFAULT));
					panel2.add(textField26, CC.xy(3, 13));
					panel2.add(textField27, CC.xy(5, 13));
					panel2.add(textField28, CC.xy(7, 13));
					panel2.add(textField29, CC.xy(9, 13));
					panel2.add(textField30, CC.xy(11, 13));

					//---- label13 ----
					label13.setText("Total Marks");
					label13.setFont(new Font("Tahoma", Font.PLAIN, 12));
					panel2.add(label13, CC.xywh(1, 15, 7, 1, CC.RIGHT, CC.DEFAULT));
					panel2.add(textField31, CC.xy(9, 15));
					panel2.add(textField32, CC.xy(11, 15));
				}
				this.add(panel2, CC.xy(1, 1, CC.FILL, CC.FILL));

				//======== panel1 ========
				{
					panel1.setLayout(new FormLayout(
						"234dlu, 98dlu, $lcgap, 95dlu",
						"default"));

					//---- next ----
					next.setText("Next");
					next.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							nextMouseClicked(e);
							
						}
					});
					panel1.add(next, CC.xy(2, 1));

					//---- add ----
					add.setText("Add");
					panel1.add(add, CC.xy(4, 1));
				}
				this.add(panel1, CC.xy(1, 3));
			}
		//	frame1ContentPane.add(this, CC.xy(1, 1));
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Hasan Asghar
	private JFrame frame1;
	private JPanel panel2;
	private JPanel panel3;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JLabel label9;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField8;
	private JTextField textField9;
	private JTextField textField10;
	private JLabel label10;
	private JTextField textField11;
	private JTextField textField17;
	private JTextField textField18;
	private JTextField textField19;
	private JTextField textField20;
	private JLabel label11;
	private JTextField textField21;
	private JTextField textField22;
	private JTextField textField23;
	private JTextField textField24;
	private JTextField textField25;
	private JLabel label12;
	private JTextField textField26;
	private JTextField textField27;
	private JTextField textField28;
	private JTextField textField29;
	private JTextField textField30;
	private JLabel label13;
	private JTextField textField31;
	private JTextField textField32;
	private JPanel panel1;
	private JButton next;
	private JButton add;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
