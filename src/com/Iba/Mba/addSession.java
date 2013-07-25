/*
 * Created by JFormDesigner on Fri Jan 25 15:00:52 PKT 2013
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
public class addSession extends JFrame {
	private DefaultTableModel model;
	private static final Object[][] rowData = { { "", "", "" } };
	private static final Object[] columnNames = { "   Chapters   ",
			"         Session Topic        ", "  Assessment  " };
	ArrayList<sessionData> sessionDatas;
	static int classNbr;

	public addSession(int c) {
		initComponents();
		sessionDatas = new ArrayList<sessionData>();
		test();
		classNbr = c;
	}

	public void test() {

		model = new DefaultTableModel(rowData, columnNames);
		table1.setModel(model);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}

	private void nextMouseClicked(MouseEvent e) {
		// TODO add your code here
		sessionDatas = new ArrayList<sessionData>();
		for (int i = 0; i < table1.getRowCount(); i++) {
			sessionData data = new sessionData(table1.getValueAt(i, 0)
					.toString(), table1.getValueAt(i, 1).toString(), table1
					.getValueAt(i, 2).toString());
			sessionDatas.add(data);
		}/*
		 * for (int i = 0; i < table1.getRowCount()-1; i++) {
		 * System.out.println(
		 * "chapters "+sessionDatas.get(i).getChapters()+" Topics "
		 * +sessionDatas.
		 * get(i).getSessionTopic()+" as "+sessionDatas.get(i).getAssessments
		 * ()); }
		 */
		MySQLAccess mySQLAccess = new MySQLAccess();
		if (sessionDatas.size() >= 2) {
			try {
				mySQLAccess.addSession(sessionDatas, classNbr);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			addAssignment GUI = new addAssignment(classNbr);
			GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GUI.setSize(1200, 700);
			GUI.setVisible(true);
			this.setVisible(false);
		}
		else{
			JOptionPane.showMessageDialog(frame1, "the number of Session should be 28 or more");
		}
	}

	private void addRowMouseClicked(MouseEvent e) {
		// TODO add your code here
		model.addRow(rowData[0]);
	}

	/*
	 * public static void main (String args[]){
	 * 
	 * javax.swing.SwingUtilities.invokeLater(new Runnable() { public void run()
	 * { addSession GUI = new addSession(234);
	 * GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * GUI.setSize(1200,700); GUI.setVisible(true);
	 * 
	 * } }); }
	 */
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hasan Asghar
		frame1 = new JFrame();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();

		// ======== frame1 ========
		{
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new FormLayout("default", "default"));

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
				this.setLayout(new FormLayout("577dlu",
						"1dlu, $lgap, 372dlu, default"));

				// ======== scrollPane1 ========
				{
					scrollPane1.setViewportView(table1);
				}
				this.add(scrollPane1, CC.xy(1, 3, CC.FILL, CC.FILL));

				// ======== panel1 ========
				{
					panel1.setLayout(new FormLayout(
							"380dlu, 98dlu, $lcgap, 95dlu", "default"));

					// ---- button1 ----
					button1.setText("Add");
					button1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							addRowMouseClicked(e);
						}
					});
					panel1.add(button1, CC.xy(2, 1));

					// ---- button2 ----
					button2.setText("Next");
					button2.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							nextMouseClicked(e);
						}
					});
					panel1.add(button2, CC.xy(4, 1));
				}
				this.add(panel1, CC.xy(1, 4));
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
	private JScrollPane scrollPane1;
	private JTable table1;
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
