/*
 * Created by JFormDesigner on Mon Jan 21 21:43:59 PKT 2013
 */

package com.Iba.Mba;

import java.awt.*;
import java.awt.Checkbox;
import java.awt.event.*;
import javax.swing.*;

import com.Iba.Mba.DB.MySQLAccess;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Hasan Asghar
 */
public class page3 extends JFrame {
	int checkBox[][];
	int classNbr;
	public page3(int classNumber) {
		initComponents();
		checkBox = new int[11][10];
		classNbr=classNumber;
	}
	private void setCheckboxMouseClicked(MouseEvent e) {
		// TODO add your code here
		if (checkBox1.isSelected()) {
			checkBox[1][1] = 1;
		} 
		if (checkBox2.isSelected()) {
			checkBox[1][2] = 1;
		} 
		if (checkBox3.isSelected()) {
			checkBox[1][3] = 1;
		} 
		if (checkBox4.isSelected()) {
			checkBox[1][4] = 1;
		} 
		if (checkBox5.isSelected()) {
			checkBox[1][5] = 1;
		} 
		if (checkBox6.isSelected()) {
			checkBox[1][6] = 1;
		} 
		if (checkBox11.isSelected()) {
			checkBox[2][1] = 1;
		} 
		if (checkBox12.isSelected()) {
			checkBox[2][2] = 1;
		} 
		if (checkBox13.isSelected()) {
			checkBox[2][3] = 1;
		} 
		if (checkBox14.isSelected()) {
			checkBox[2][4] = 1;
		} 
		if (checkBox15.isSelected()) {
			checkBox[2][5] = 1;
		} 
		if (checkBox16.isSelected()) {
			checkBox[2][6] = 1;
		} 
		if (checkBox21.isSelected()) {
			checkBox[3][1] = 1;
		} 
		if (checkBox22.isSelected()) {
			checkBox[3][2] = 1;
		}
		if (checkBox23.isSelected()) {
			checkBox[3][3] = 1;
		} 
		if (checkBox24.isSelected()) {
			checkBox[3][4] = 1;
		} 
		if (checkBox25.isSelected()) {
			checkBox[3][5] = 1;
		} 
		if (checkBox26.isSelected()) {
			checkBox[3][6] = 1;
		} 
		if (checkBox31.isSelected()) {
			checkBox[4][1] = 1;
		} 
		if (checkBox32.isSelected()) {
			checkBox[4][2] = 1;
		} 
		if (checkBox33.isSelected()) {
			checkBox[4][3] = 1;
		} 
		if (checkBox34.isSelected()) {
			checkBox[4][4] = 1;
		}
		if (checkBox35.isSelected()) {
			checkBox[4][5] = 1;
		} 
		if (checkBox36.isSelected()) {
			checkBox[4][6] = 1;
		}
		if (checkBox41.isSelected()) {
			checkBox[5][1] = 1;
		}
		if (checkBox42.isSelected()) {
			checkBox[5][2] = 1;
		} 
		if (checkBox43.isSelected()) {
			checkBox[5][3] = 1;
		} 
		if (checkBox44.isSelected()) {
			checkBox[5][4] = 1;
		} 
		if (checkBox45.isSelected()) {
			checkBox[5][5] = 1;
		} 
		if (checkBox46.isSelected()) {
			checkBox[5][6] = 1;
		} 
		if (checkBox51.isSelected()) {
			checkBox[6][1] = 1;
		} 
		if (checkBox52.isSelected()) {
			checkBox[6][2] = 1;
		} 
		if (checkBox53.isSelected()) {
			checkBox[6][3] = 1;
		} 
		if (checkBox54.isSelected()) {
			checkBox[6][4] = 1;
		} 
		if (checkBox55.isSelected()) {
			checkBox[6][5] = 1;
		} 
		if (checkBox56.isSelected()) {
			checkBox[6][6] = 1;
		} 
		if (checkBox61.isSelected()) {
			checkBox[7][1] = 1;
		} 
		if (checkBox62.isSelected()) {
			checkBox[7][2] = 1;
		} 
		if (checkBox63.isSelected()) {
			checkBox[7][3] = 1;
		}
		if (checkBox64.isSelected()) {
			checkBox[7][4] = 1;
		}
		if (checkBox65.isSelected()) {
			checkBox[7][5] = 1;
		}
		if (checkBox66.isSelected()) {
			checkBox[7][6] = 1;
		} 
		if (checkBox71.isSelected()) {
			checkBox[8][1] = 1;
		} 
		if (checkBox72.isSelected()) {
			checkBox[8][2] = 1;
		} 
		if (checkBox73.isSelected()) {
			checkBox[8][3] = 1;
		} 
		if (checkBox74.isSelected()) {
			checkBox[8][4] = 1;
		} 
		if (checkBox75.isSelected()) {
			checkBox[8][5] = 1;
		} 
		if (checkBox76.isSelected()) {
			checkBox[8][6] = 1;
		} 
		if (checkBox81.isSelected()) {
			checkBox[9][1] = 1;
		} 
		if (checkBox82.isSelected()) {
			checkBox[9][2] = 1;
		} 
		if (checkBox83.isSelected()) {
			checkBox[9][3] = 1;
		} 
		if (checkBox84.isSelected()) {
			checkBox[9][4] = 1;
		} 
		if (checkBox85.isSelected()) {
			checkBox[9][5] = 1;
		} 
		if (checkBox86.isSelected()) {
			checkBox[9][6] = 1;
		} 
		if (checkBox91.isSelected()) {
			checkBox[10][1] = 1;
		} 
		if (checkBox92.isSelected()) {
			checkBox[10][2] = 1;
		} 
		if (checkBox93.isSelected()) {
			checkBox[10][3] = 1;
		} 
		if (checkBox94.isSelected()) {
			checkBox[10][4] = 1;
		} 
		if (checkBox95.isSelected()) {
			checkBox[10][5] = 1;
		} 
		if (checkBox96.isSelected()) {
			checkBox[10][6] = 1;
		}

		MySQLAccess dao = new MySQLAccess();
		try {
			System.out.println(classNbr);
			dao.setCheckbox(checkBox,classNbr);	
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		

	}

	private void nextMouseClicked(MouseEvent e) {
		// TODO add your code here
		addKnowledgeSkills GUI = new addKnowledgeSkills(classNbr);
        GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GUI.setSize(1200,700);
        GUI.setVisible(true);
        this.setVisible(false);
		
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hasan Asghar
		label18 = new JLabel();
		label17 = new JLabel();
		this2 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		checkBox1 = new JCheckBox();
		checkBox2 = new JCheckBox();
		checkBox3 = new JCheckBox();
		checkBox4 = new JCheckBox();
		checkBox5 = new JCheckBox();
		checkBox6 = new JCheckBox();
		label8 = new JLabel();
		checkBox11 = new JCheckBox();
		checkBox12 = new JCheckBox();
		checkBox13 = new JCheckBox();
		checkBox14 = new JCheckBox();
		checkBox15 = new JCheckBox();
		checkBox16 = new JCheckBox();
		label9 = new JLabel();
		checkBox21 = new JCheckBox();
		checkBox22 = new JCheckBox();
		checkBox23 = new JCheckBox();
		checkBox24 = new JCheckBox();
		checkBox25 = new JCheckBox();
		checkBox26 = new JCheckBox();
		label10 = new JLabel();
		checkBox31 = new JCheckBox();
		checkBox32 = new JCheckBox();
		checkBox33 = new JCheckBox();
		checkBox34 = new JCheckBox();
		checkBox35 = new JCheckBox();
		checkBox36 = new JCheckBox();
		label11 = new JLabel();
		checkBox41 = new JCheckBox();
		checkBox42 = new JCheckBox();
		checkBox43 = new JCheckBox();
		checkBox44 = new JCheckBox();
		checkBox45 = new JCheckBox();
		checkBox46 = new JCheckBox();
		label12 = new JLabel();
		checkBox51 = new JCheckBox();
		checkBox52 = new JCheckBox();
		checkBox53 = new JCheckBox();
		checkBox54 = new JCheckBox();
		checkBox55 = new JCheckBox();
		checkBox56 = new JCheckBox();
		label13 = new JLabel();
		checkBox61 = new JCheckBox();
		checkBox62 = new JCheckBox();
		checkBox63 = new JCheckBox();
		checkBox64 = new JCheckBox();
		checkBox65 = new JCheckBox();
		checkBox66 = new JCheckBox();
		label14 = new JLabel();
		checkBox71 = new JCheckBox();
		checkBox72 = new JCheckBox();
		checkBox73 = new JCheckBox();
		checkBox74 = new JCheckBox();
		checkBox75 = new JCheckBox();
		checkBox76 = new JCheckBox();
		label15 = new JLabel();
		checkBox81 = new JCheckBox();
		checkBox82 = new JCheckBox();
		checkBox83 = new JCheckBox();
		checkBox84 = new JCheckBox();
		checkBox85 = new JCheckBox();
		checkBox86 = new JCheckBox();
		label16 = new JLabel();
		checkBox91 = new JCheckBox();
		checkBox92 = new JCheckBox();
		checkBox93 = new JCheckBox();
		checkBox94 = new JCheckBox();
		checkBox95 = new JCheckBox();
		checkBox96 = new JCheckBox();
		button1 = new JButton();
		button2 = new JButton();

		//======== this ========

		// JFormDesigner evaluation mark
	/*	setBorder(new javax.swing.border.CompoundBorder(
			new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
				"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
				javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});
*/
		setLayout(new FormLayout(
			"137dlu, 242dlu",
			"4*(default), 2*($lgap, default)"));

		//---- label18 ----
		label18.setText("MBA Program Objectives and Outcomes Matrix");
		label18.setFont(new Font("Tahoma", Font.BOLD, 12));
		add(label18, CC.xy(2, 3));

		//---- label17 ----
		label17.setText("MBA Program Outcomes");
		label17.setHorizontalAlignment(SwingConstants.TRAILING);
		label17.setFont(new Font("Tahoma", Font.BOLD, 14));
		add(label17, CC.xy(1, 4, CC.CENTER, CC.CENTER));

		//======== this2 ========
		{
			this2.setToolTipText("Business acumen, knowledge and skills of the business and management. With rigor of class room teaching and engagement with strategic level decision makers from local and global organizations");
			this2.setLayout(new FormLayout(
				"8*(16dlu, $lcgap), 16dlu",
				"3*(16dlu, $lgap), 15dlu, 8*($lgap, 16dlu)"));

			//---- label1 ----
			label1.setText("1");
			label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label1, CC.xy(7, 3, CC.CENTER, CC.DEFAULT));

			//---- label2 ----
			label2.setText("2");
			label2.setToolTipText("Develop and groom competencies including communication and leadership by inculcating drive for success, disciplined, hard work with innovative as well as analytical problem solving skills");
			label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label2, CC.xy(9, 3, CC.CENTER, CC.CENTER));

			//---- label3 ----
			label3.setText("3");
			label3.setToolTipText("Developing both the local and global mindset with national, regional and global business perspective by using case method and experiential projects within national and International organizations");
			label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label3, CC.xy(11, 3, CC.CENTER, CC.DEFAULT));

			//---- label4 ----
			label4.setText("4");
			label4.setToolTipText("Foster entrepreneurial spark and mindset");
			label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label4, CC.xy(13, 3, CC.CENTER, CC.DEFAULT));

			//---- label5 ----
			label5.setText("5");
			label5.setToolTipText("Develop ethical business leaders and not just managers");
			label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label5, CC.xy(15, 3, CC.CENTER, CC.DEFAULT));

			//---- label6 ----
			label6.setText("6");
			label6.setToolTipText("Develop critical thinking, creativity, divergent thinking & team building skills");
			label6.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label6, CC.xy(17, 3, CC.CENTER, CC.DEFAULT));

			//---- label7 ----
			label7.setText("1");
			label7.setToolTipText("Develop an ability to make well informed decisions which are ethically sound and profitable in different organizational situations");
			label7.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label7, CC.xy(5, 5, CC.CENTER, CC.CENTER));
			this2.add(checkBox1, CC.xy(7, 5));
			this2.add(checkBox2, CC.xy(9, 5));
			this2.add(checkBox3, CC.xy(11, 5));
			this2.add(checkBox4, CC.xy(13, 5));
			this2.add(checkBox5, CC.xy(15, 5));
			this2.add(checkBox6, CC.xy(17, 5));

			//---- label8 ----
			label8.setText("2");
			label8.setToolTipText("Appreciate the importance of social and environmental issues and dilemmas in business");
			label8.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label8, CC.xy(5, 7, CC.CENTER, CC.CENTER));
			this2.add(checkBox11, CC.xy(7, 7));
			this2.add(checkBox12, CC.xy(9, 7));
			this2.add(checkBox13, CC.xy(11, 7));
			this2.add(checkBox14, CC.xy(13, 7));
			this2.add(checkBox15, CC.xy(15, 7));
			this2.add(checkBox16, CC.xy(17, 7));

			//---- label9 ----
			label9.setText("3");
			label9.setToolTipText("Enhance value creation in personal and professional aspects with strong and proficient Interpersonal & teamwork skills, written, oral communication and listening abilities.");
			label9.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label9, CC.xy(5, 9, CC.CENTER, CC.CENTER));
			this2.add(checkBox21, CC.xy(7, 9));
			this2.add(checkBox22, CC.xy(9, 9));
			this2.add(checkBox23, CC.xy(11, 9));
			this2.add(checkBox24, CC.xy(13, 9));
			this2.add(checkBox25, CC.xy(15, 9));
			this2.add(checkBox26, CC.xy(17, 9));

			//---- label10 ----
			label10.setText("4");
			label10.setToolTipText("Utilize information, literary and computing skills to effectively prepare and present reports for various purposes.");
			label10.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label10, CC.xy(5, 11, CC.CENTER, CC.CENTER));
			this2.add(checkBox31, CC.xy(7, 11));
			this2.add(checkBox32, CC.xy(9, 11));
			this2.add(checkBox33, CC.xy(11, 11));
			this2.add(checkBox34, CC.xy(13, 11));
			this2.add(checkBox35, CC.xy(15, 11));
			this2.add(checkBox36, CC.xy(17, 11));

			//---- label11 ----
			label11.setText("5");
			label11.setToolTipText("Acquire field-specific knowledge and experience to process and interpret both strategic level and operational level processes and organizational systems.");
			label11.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label11, CC.xy(5, 13, CC.CENTER, CC.CENTER));
			this2.add(checkBox41, CC.xy(7, 13));
			this2.add(checkBox42, CC.xy(9, 13));
			this2.add(checkBox43, CC.xy(11, 13));
			this2.add(checkBox44, CC.xy(13, 13));
			this2.add(checkBox45, CC.xy(15, 13));
			this2.add(checkBox46, CC.xy(17, 13));

			//---- label12 ----
			label12.setText("6");
			label12.setToolTipText("Planning and implementation of different business and functional issues and agendas within the business organization.");
			label12.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label12, CC.xy(5, 15, CC.CENTER, CC.CENTER));
			this2.add(checkBox51, CC.xy(7, 15));
			this2.add(checkBox52, CC.xy(9, 15));
			this2.add(checkBox53, CC.xy(11, 15));
			this2.add(checkBox54, CC.xy(13, 15));
			this2.add(checkBox55, CC.xy(15, 15));
			this2.add(checkBox56, CC.xy(17, 15));

			//---- label13 ----
			label13.setText("7");
			label13.setToolTipText("Appreciate cultural sensitivity and diversity within a situation.");
			label13.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label13, CC.xy(5, 17, CC.CENTER, CC.CENTER));
			this2.add(checkBox61, CC.xy(7, 17));
			this2.add(checkBox62, CC.xy(9, 17));
			this2.add(checkBox63, CC.xy(11, 17));
			this2.add(checkBox64, CC.xy(13, 17));
			this2.add(checkBox65, CC.xy(15, 17));
			this2.add(checkBox66, CC.xy(17, 17));

			//---- label14 ----
			label14.setText("8");
			label14.setToolTipText("Understand opportunities and challenges of internationalization/ globalization, technology and social media on business.");
			label14.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label14, CC.xy(5, 19, CC.CENTER, CC.CENTER));
			this2.add(checkBox71, CC.xy(7, 19));
			this2.add(checkBox72, CC.xy(9, 19));
			this2.add(checkBox73, CC.xy(11, 19));
			this2.add(checkBox74, CC.xy(13, 19));
			this2.add(checkBox75, CC.xy(15, 19));
			this2.add(checkBox76, CC.xy(17, 19));

			//---- label15 ----
			label15.setText("9");
			label15.setToolTipText("Continuous engagement in professional development and personal effectiveness.");
			label15.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label15, CC.xy(5, 21, CC.CENTER, CC.CENTER));
			this2.add(checkBox81, CC.xy(7, 21));
			this2.add(checkBox82, CC.xy(9, 21));
			this2.add(checkBox83, CC.xy(11, 21));
			this2.add(checkBox84, CC.xy(13, 21));
			this2.add(checkBox85, CC.xy(15, 21));
			this2.add(checkBox86, CC.xy(17, 21));

			//---- label16 ----
			label16.setText("10");
			label16.setToolTipText("Understand & balance between the business and human factors while choosing among different alternatives");
			label16.setFont(new Font("Tahoma", Font.PLAIN, 14));
			this2.add(label16, CC.xy(5, 23, CC.CENTER, CC.CENTER));
			this2.add(checkBox91, CC.xy(7, 23));
			this2.add(checkBox92, CC.xy(9, 23));
			this2.add(checkBox93, CC.xy(11, 23));
			this2.add(checkBox94, CC.xy(13, 23));
			this2.add(checkBox95, CC.xy(15, 23));
			this2.add(checkBox96, CC.xy(17, 23));
		}
		add(this2, CC.xy(2, 4, CC.DEFAULT, CC.CENTER));

		//---- button1 ----
		button1.setText("Set");
		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setCheckboxMouseClicked(e);
			}
		});
		add(button1, CC.xy(2, 6));

		//---- button2 ----
		button2.setText("Next");
		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nextMouseClicked(e);
			}
		});
		add(button2, CC.xy(2, 8));
		// //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY
	// //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Hasan Asghar
	private JLabel label18;
	private JLabel label17;
	private JPanel this2;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JCheckBox checkBox1;
	private JCheckBox checkBox2;
	private JCheckBox checkBox3;
	private JCheckBox checkBox4;
	private JCheckBox checkBox5;
	private JCheckBox checkBox6;
	private JLabel label8;
	private JCheckBox checkBox11;
	private JCheckBox checkBox12;
	private JCheckBox checkBox13;
	private JCheckBox checkBox14;
	private JCheckBox checkBox15;
	private JCheckBox checkBox16;
	private JLabel label9;
	private JCheckBox checkBox21;
	private JCheckBox checkBox22;
	private JCheckBox checkBox23;
	private JCheckBox checkBox24;
	private JCheckBox checkBox25;
	private JCheckBox checkBox26;
	private JLabel label10;
	private JCheckBox checkBox31;
	private JCheckBox checkBox32;
	private JCheckBox checkBox33;
	private JCheckBox checkBox34;
	private JCheckBox checkBox35;
	private JCheckBox checkBox36;
	private JLabel label11;
	private JCheckBox checkBox41;
	private JCheckBox checkBox42;
	private JCheckBox checkBox43;
	private JCheckBox checkBox44;
	private JCheckBox checkBox45;
	private JCheckBox checkBox46;
	private JLabel label12;
	private JCheckBox checkBox51;
	private JCheckBox checkBox52;
	private JCheckBox checkBox53;
	private JCheckBox checkBox54;
	private JCheckBox checkBox55;
	private JCheckBox checkBox56;
	private JLabel label13;
	private JCheckBox checkBox61;
	private JCheckBox checkBox62;
	private JCheckBox checkBox63;
	private JCheckBox checkBox64;
	private JCheckBox checkBox65;
	private JCheckBox checkBox66;
	private JLabel label14;
	private JCheckBox checkBox71;
	private JCheckBox checkBox72;
	private JCheckBox checkBox73;
	private JCheckBox checkBox74;
	private JCheckBox checkBox75;
	private JCheckBox checkBox76;
	private JLabel label15;
	private JCheckBox checkBox81;
	private JCheckBox checkBox82;
	private JCheckBox checkBox83;
	private JCheckBox checkBox84;
	private JCheckBox checkBox85;
	private JCheckBox checkBox86;
	private JLabel label16;
	private JCheckBox checkBox91;
	private JCheckBox checkBox92;
	private JCheckBox checkBox93;
	private JCheckBox checkBox94;
	private JCheckBox checkBox95;
	private JCheckBox checkBox96;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
