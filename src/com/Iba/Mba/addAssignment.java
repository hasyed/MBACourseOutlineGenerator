/*
 * Created by JFormDesigner on Fri Jan 25 21:57:17 PKT 2013
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
public class addAssignment extends JFrame {
	private DefaultTableModel model;
	private static final Object[][] rowData = { { "", "", "" } };
	private static final Object[] columnNames = { "Assessment", "DueDate",
			"Remarks" };
	static int classNbr;

	public addAssignment(int c) {
		initComponents();
		test();
		classNbr = c;
	}

	public void test() {

		model = new DefaultTableModel(rowData, columnNames);
		table1.setModel(model);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				model.addRow(rowData[0]);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	/*
	 * public static void main (String args[]){
	 * 
	 * javax.swing.SwingUtilities.invokeLater(new Runnable() { public void run()
	 * { addAssignment GUI = new addAssignment();
	 * GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); GUI.setSize(1200,
	 * 700); GUI.setVisible(true);
	 * 
	 * } }); }
	 */

	private void nextMouseClicked(MouseEvent e) {
		// TODO add your code here
		MySQLAccess mySQLAccess = new MySQLAccess();
		ArrayList<assessment> arrayList = new ArrayList<assessment>();
		for (int i = 0; i < table1.getRowCount(); i++) {
			assessment assessment = new assessment(table1.getValueAt(i, 0)
					.toString(), table1.getValueAt(i, 1).toString(), table1
					.getValueAt(i, 2).toString());
			arrayList.add(assessment);
		}
		if(arrayList.size()>1){
		try {
			mySQLAccess.addAssessment(arrayList, classNbr);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		addMarksDes GUI = new addMarksDes(classNbr);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setSize(1200, 700);
		GUI.setVisible(true);
		this.setVisible(false);
	}
		else{
			JOptionPane.showMessageDialog(frame1, "Add more assessments");
		}
	}
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hasan Asghar
		frame1 = new JFrame();
		scrollPane2 = new JScrollPane();
		table1 = new JTable();
		panel1 = new JPanel();
		add = new JButton();
		next = new JButton();

		// ======== frame1 ========
		{
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new FormLayout("578dlu", "default"));

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
				this.setLayout(new FormLayout("581dlu", "372dlu, default"));

				// ======== scrollPane2 ========
				{
					scrollPane2.setViewportView(table1);
				}
				this.add(scrollPane2, CC.xy(1, 1, CC.FILL, CC.FILL));

				// ======== panel1 ========
				{
					panel1.setLayout(new FormLayout(
							"380dlu, 98dlu, $lcgap, 95dlu", "default"));

					// ---- add ----
					add.setText("Add");
					panel1.add(add, CC.xy(2, 1));

					// ---- next ----
					next.setText("Next");
					next.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							nextMouseClicked(e);
						}
					});
					panel1.add(next, CC.xy(4, 1));
				}
				this.add(panel1, CC.xy(1, 2));
			}
			// frame1ContentPane.add(this, CC.xy(1, 1));
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
	private JScrollPane scrollPane2;
	private JTable table1;
	private JPanel panel1;
	private JButton add;
	private JButton next;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
