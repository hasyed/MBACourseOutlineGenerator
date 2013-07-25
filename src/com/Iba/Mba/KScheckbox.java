/*
 * Created by JFormDesigner on Fri Jan 25 19:47:11 PKT 2013
 */

package com.Iba.Mba;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.Iba.Mba.DB.MySQLAccess;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Hasan Asghar
 */
public class KScheckbox extends JFrame {
	private DefaultTableModel modelKnow;
	private DefaultTableModel modelSkills;
	private static final Object[] columnNames = { "Outcomes", "1", "2", "3",
			"4", "5", "6", "7", "8", "9", "10" };
	private static final Object[][] rowData = { { "", } };
	private static int classNbr;
	public MySQLAccess mySQLAccess;
	public ArrayList<String> textKnow;
	public ArrayList<String> textSkill;
	int checkBoxKnow[][];
	int checkBoxSkill[][];

	public KScheckbox() throws Exception {
		initComponents();
		//classNbr = 234;
		textKnow = new ArrayList<String>();
		mySQLAccess = new MySQLAccess();
		textSkill = new ArrayList<String>();
		textSkill = mySQLAccess.getSkillsOutcomes(classNbr);
		textKnow = mySQLAccess.getKnowledgeOutcomes(classNbr);
		checkBoxKnow = new int[textKnow.size()][11];
		checkBoxSkill = new int[textSkill.size()][11];
		test();
	}

	public KScheckbox(int c) throws Exception {
		initComponents();

		classNbr = c;
		textKnow = new ArrayList<String>();
		mySQLAccess = new MySQLAccess();
		textSkill = new ArrayList<String>();
		textSkill = mySQLAccess.getSkillsOutcomes(classNbr);
		textKnow = mySQLAccess.getKnowledgeOutcomes(classNbr);
		checkBoxKnow = new int[textKnow.size()][11];
		checkBoxSkill = new int[textSkill.size()][11];
		test();
	}

/*	public static void main(String args[]) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				KScheckbox GUI;
				try {
					GUI = new KScheckbox();
					GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					GUI.setSize(1200, 700);
					GUI.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}*/

	public void test() {

		modelKnow = new DefaultTableModel(rowData, columnNames);
		table1.setModel(modelKnow);

		modelSkills = new DefaultTableModel(rowData, columnNames);
		table2.setModel(modelSkills);

		// table1.getColumnModel().getColumn(0).setCellEditor(new
		// CheckBoxCellEditor());
		table1.getColumnModel().getColumn(1)
				.setCellEditor(new CheckBoxCellEditor());
		table1.getColumnModel().getColumn(2)
				.setCellEditor(new CheckBoxCellEditor());
		table1.getColumnModel().getColumn(3)
				.setCellEditor(new CheckBoxCellEditor());
		table1.getColumnModel().getColumn(4)
				.setCellEditor(new CheckBoxCellEditor());
		table1.getColumnModel().getColumn(5)
				.setCellEditor(new CheckBoxCellEditor());
		table1.getColumnModel().getColumn(6)
				.setCellEditor(new CheckBoxCellEditor());
		table1.getColumnModel().getColumn(7)
				.setCellEditor(new CheckBoxCellEditor());
		table1.getColumnModel().getColumn(8)
				.setCellEditor(new CheckBoxCellEditor());
		table1.getColumnModel().getColumn(9)
				.setCellEditor(new CheckBoxCellEditor());
		table1.getColumnModel().getColumn(10)
				.setCellEditor(new CheckBoxCellEditor());

		// table2.getColumnModel().getColumn(0).setCellEditor(new
		// CheckBoxCellEditor());
		table2.getColumnModel().getColumn(1)
				.setCellEditor(new CheckBoxCellEditor());
		table2.getColumnModel().getColumn(2)
				.setCellEditor(new CheckBoxCellEditor());
		table2.getColumnModel().getColumn(3)
				.setCellEditor(new CheckBoxCellEditor());
		table2.getColumnModel().getColumn(4)
				.setCellEditor(new CheckBoxCellEditor());
		table2.getColumnModel().getColumn(5)
				.setCellEditor(new CheckBoxCellEditor());
		table2.getColumnModel().getColumn(6)
				.setCellEditor(new CheckBoxCellEditor());
		table2.getColumnModel().getColumn(7)
				.setCellEditor(new CheckBoxCellEditor());
		table2.getColumnModel().getColumn(8)
				.setCellEditor(new CheckBoxCellEditor());
		table2.getColumnModel().getColumn(9)
				.setCellEditor(new CheckBoxCellEditor());
		table2.getColumnModel().getColumn(10)
				.setCellEditor(new CheckBoxCellEditor());

		for (int i = 0; i < textKnow.size()-1; i++) {
			modelKnow.addRow(rowData[0]);
			
		}
		for (int i = 0; i < textSkill.size()-1; i++) {
			modelSkills.addRow(rowData[0]);	
		}
		
		for (int i = 0; i < textKnow.size(); i++) {
			table1.setValueAt(textKnow.get(i).toString(), i, 0);

		}
		for (int i = 0; i < textSkill.size(); i++) {
			table2.setValueAt(textSkill.get(i).toString(), i, 0);
		}
		for (int i = 0; i < textKnow.size(); i++) {
			for (int j = 1; j < 11; j++) {
				table1.setValueAt(false, i, j);
			}
		}

		for (int i = 0; i < textSkill.size(); i++) {
			for (int j = 1; j < 11; j++) {
				table2.setValueAt(false, i, j);
			}
		}

		/*
		 * button1.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent ae) { modelKnow.addRow(rowData[0]); //
		 * model.addRow(name()); } });
		 */
	}

	private void nextMouseClicked(MouseEvent e) throws Exception {
		// TODO add your code here
		/*
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("ID is"+arrayList.get(i).getId());
			System.out.println("Text is "+arrayList.get(i).getText());
		}*/
		
		/*System.out.println("value of table at 1 1 " + table1.getValueAt(1, 1));
		System.out.println("value of table at 1 2 " + table1.getValueAt(1, 2));
		*/addSession GUI = new addSession(classNbr);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setSize(1200, 700);
		GUI.setVisible(true);
	}

	private void setCheckboxesMouseClicked(MouseEvent e) throws Exception {
		// TODO add your code here
		int countknow = 0;
		int countskil = 0;
		for (int i = 0; i < textKnow.size() - 1; i++) {
			for (int j = 1; j < 11; j++) {
				if (table1.getValueAt(i, j).equals(true)
						|| table1.getValueAt(i, j).toString().equals("true")) {
					// if(table1.getValueAt(i, j).equals("true")){
					// if((Boolean) table1.getValueAt(i, j)){
					checkBoxKnow[i][j] = 1;
					countknow++;
				}
			}
		}

		for (int i = 0; i < textSkill.size() - 1; i++) {
			for (int j = 1; j < 11; j++) {
				if (table2.getValueAt(i, j).equals(true)
						|| table2.getValueAt(i, j).toString().equals("true")) {
					checkBoxSkill[i][j] = 1;
					countskil++;
				}
			}
		}

		System.out.println("count know " + countknow);
		System.out.println("count skill " + countskil);
		
		ArrayList<tableData> arrayListKnow= new ArrayList<tableData>();
		 arrayListKnow=mySQLAccess.getKnowledgeOutcomes1(classNbr);		 
		 mySQLAccess.addBridgeDataKnowledge(checkBoxKnow, arrayListKnow, classNbr);
		 
		 ArrayList<tableData> arrayListSkill= new ArrayList<tableData>();
		 arrayListSkill=mySQLAccess.getSkillsOutcomes1(classNbr);
		 
		 mySQLAccess.addBridgeDataSkills(checkBoxSkill, arrayListSkill, classNbr);

	}

	private void table1MouseClicked(MouseEvent e) {
		// TODO add your code here
		int selC = table1.getSelectedColumn();
		int selR = table1.getSelectedRow();
		System.out.println(" selC " + selC + " selR " + selR);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hasan Asghar
		frame1 = new JFrame();
		label3 = new JLabel();
		label1 = new JLabel();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		label2 = new JLabel();
		scrollPane2 = new JScrollPane();
		table2 = new JTable();
		panel2 = new JPanel();
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();

		// ======== frame1 ========
		{
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new FormLayout("585dlu",
					"409dlu, $lgap, default"));

			// ======== this ========
			{

				// JFormDesigner evaluation mark
				/*
				 * this.setBorder(new javax.swing.border.CompoundBorder( new
				 * javax.swing.border.TitledBorder(new
				 * javax.swing.border.EmptyBorder(0, 0, 0, 0),
				 * "JFormDesigner Evaluation",
				 * javax.swing.border.TitledBorder.CENTER,
				 * javax.swing.border.TitledBorder.BOTTOM, new
				 * java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
				 * java.awt.Color.red), this.getBorder()));
				 * this.addPropertyChangeListener(new
				 * java.beans.PropertyChangeListener(){public void
				 * propertyChange(java.beans.PropertyChangeEvent
				 * e){if("border".equals(e.getPropertyName()))throw new
				 * RuntimeException();}});
				 */
				this.setLayout(new FormLayout("96dlu, $lcgap, 478dlu",
						"default, $lgap, 166dlu, $lgap, 196dlu, $lgap, default"));

				// ---- label3 ----
				label3.setText("MBA Program Outcomes");
				label3.setFont(new Font("Tahoma", Font.BOLD, 14));
				this.add(label3, CC.xy(3, 1, CC.CENTER, CC.CENTER));

				// ---- label1 ----
				label1.setText("Knowledge Outcomes");
				label1.setFont(new Font("Tahoma", Font.BOLD, 12));
				this.add(label1, CC.xy(1, 3, CC.CENTER, CC.FILL));

				// ======== scrollPane1 ========
				{

					// ---- table1 ----
					table1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							table1MouseClicked(e);
						}
					});
					scrollPane1.setViewportView(table1);
				}
				this.add(scrollPane1, CC.xy(3, 3, CC.FILL, CC.DEFAULT));

				// ---- label2 ----
				label2.setText("Skills/Abilities Outcomes");
				label2.setFont(new Font("Tahoma", Font.BOLD, 12));
				this.add(label2, CC.xy(1, 5, CC.CENTER, CC.DEFAULT));

				// ======== scrollPane2 ========
				{
					scrollPane2.setViewportView(table2);
				}
				this.add(scrollPane2, CC.xy(3, 5));

				// ======== panel2 ========
				{
					panel2.setLayout(new FormLayout("default", "default"));

					// ======== panel1 ========
					{
						panel1.setLayout(new FormLayout(
								"380dlu, 98dlu, $lcgap, 95dlu", "default"));

						// ---- button1 ----
						button1.setText("Set Checkboxes");
						button1.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								try {
									setCheckboxesMouseClicked(e);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						});
						panel1.add(button1, CC.xy(2, 1));

						// ---- button2 ----
						button2.setText("Next");
						button2.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								try {
									nextMouseClicked(e);
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}

							}
						});
						panel1.add(button2, CC.xy(4, 1));
					}
					panel2.add(panel1, CC.xy(1, 1));
				}
				this.add(panel2, CC.xywh(1, 7, 3, 1));
			}
			// frame1ContentPane.add(this, CC.xy(1, 1, CC.LEFT, CC.FILL));
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}
		// JFormDesigner - End of component initialization
		// //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY
	// //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Hasan Asghar
	private JFrame frame1;
	private JLabel label3;
	private JLabel label1;
	private JScrollPane scrollPane1;
	private JTable table1;
	private JLabel label2;
	private JScrollPane scrollPane2;
	private JTable table2;
	private JPanel panel2;
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
