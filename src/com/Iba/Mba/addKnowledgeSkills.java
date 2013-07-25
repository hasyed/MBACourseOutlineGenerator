/*
 * Created by JFormDesigner on Fri Jan 25 18:01:34 PKT 2013
 */

package com.Iba.Mba;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.Iba.Mba.DB.MySQLAccess;
import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author Hasan Asghar
 */
public class addKnowledgeSkills extends JFrame {
	private DefaultTableModel modelKnow;
	private DefaultTableModel modelSkills;
	private static final Object[][] rowData = { { "" } };
	private static final Object[] columnNamesKnow = { "Knowledge Outcomes" };
	private static final Object[] columnNamesSkill = { "Skills/Abilities Outcomes" };
	public static int classNbr;
	public ArrayList<String> know;
	public ArrayList<String> skill;

	public addKnowledgeSkills(int clsnbr) {
		initComponents();
		test();
		know = new ArrayList<String>();
		skill = new ArrayList<String>();
		classNbr = clsnbr;
		//classNbr = 234;
	}

	public void test() {
		modelKnow = new DefaultTableModel(rowData, columnNamesKnow);
		table1.setModel(modelKnow);

		modelSkills = new DefaultTableModel(rowData, columnNamesSkill);
		table2.setModel(modelSkills);
	}

	private void nextMouseClicked(MouseEvent e) throws Exception {
		// TODO add your code here
		/*
		 * System.out.println(modelKnow.getRowCount());
		 * System.out.println(modelKnow.getColumnCount());
		 */

		for (int h = 0; h < modelKnow.getRowCount(); h++) {
			System.out.println(" h " + h);
			if (!modelKnow.getValueAt(h, 0).equals("")) {
				know.add((String) modelKnow.getValueAt(h, 0));
				System.out.println(modelKnow.getValueAt(h, 0));
				// modelKnow.get

				// modelKnow.getValueAt(row, column)
			}
		}
		for (int j = 0; j < modelSkills.getRowCount(); j++) {
			System.out.println(" j " + j);
			if (!modelSkills.getValueAt(j, 0).equals("")) {
				skill.add((String) modelSkills.getValueAt(j, 0));
				System.out.println(modelSkills.getValueAt(j, 0));
			}
		}

		MySQLAccess mySQLAccess = new MySQLAccess();
		mySQLAccess.addKnowledge(know, modelKnow.getRowCount(), classNbr);
		mySQLAccess.addSkills(skill, modelSkills.getRowCount(), classNbr);

		// mySQLAccess.getKnowledgeOutcomes(classNbr);
		KScheckbox GUI = new KScheckbox(classNbr);
		GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUI.setSize(1200, 700);
		GUI.setVisible(true);
		this.setVisible(false);

	}

	private void table1MouseClicked(MouseEvent e) {
		// TODO add your code here
		int selC = table1.getSelectedColumn();
		int selR = table1.getSelectedRow();
		System.out.println(" selC " + selC + " selR " + selR);
		// System.out.println(modelKnow.getValueAt(selR, selC));
	}

	private void knowledgeMouseClicked(MouseEvent e) {
		// TODO add your code here
		modelKnow.addRow(rowData[0]);
		for (int h = 0; h < modelKnow.getRowCount(); h++) {
			System.out.println(" h " + h);
			if (!modelKnow.getValueAt(h, 0).equals("")) {
				// know.add((String)modelKnow.getValueAt(h, 0));
				System.out.println(modelKnow.getValueAt(h, 0));
				// modelKnow.get
				// modelKnow.getValueAt(row, column)
			} else {
				System.out.println(modelKnow.getValueAt(h, 0));
			}
		}
	}

	private void skillsMouseClicked(MouseEvent e) {
		// TODO add your code here
		modelSkills.addRow(rowData[0]);
		for (int j = 0; j < modelSkills.getRowCount(); j++) {
			System.out.println(" j " + j);
			if (!modelSkills.getValueAt(j, 0).equals("")) {
				// skill.add((String)modelSkills.getValueAt(j, 0));
				System.out.println(modelSkills.getValueAt(j, 0));
			} else {
				System.out.println(modelSkills.getValueAt(j, 0));
			}
		}
	}

/*	public static void main(String args[]) {

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				addKnowledgeSkills GUI = new addKnowledgeSkills(234);
				GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				GUI.setSize(1200, 700);
				GUI.setVisible(true);
				
			}
		});
	}*/

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY
		// //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Hasan Asghar
		frame1 = new JFrame();
		panel3 = new JPanel();
		label1 = new JLabel();
		scrollPane1 = new JScrollPane();
		table1 = new JTable();
		scrollPane2 = new JScrollPane();
		table2 = new JTable();
		panel1 = new JPanel();
		knowledge = new JButton();
		panel2 = new JPanel();
		skills = new JButton();
		panel4 = new JPanel();
		button1 = new JButton();

		// ======== frame1 ========
		{
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(new FormLayout("578dlu",
					"default, $lgap, default"));

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
				this.setLayout(new FormLayout("289dlu, $lcgap, 287dlu",
						"default, $lgap, 314dlu, $lgap, default, $lgap, 26dlu, $lgap, default"));

				// ======== panel3 ========
				{
					panel3.setLayout(new FormLayout("579dlu", "28dlu"));

					// ---- label1 ----
					label1.setText("Course Learning Outcomes");
					label1.setFont(new Font("Tahoma", Font.PLAIN, 14));
					panel3.add(label1, CC.xy(1, 1, CC.CENTER, CC.DEFAULT));
				}
				this.add(panel3, CC.xywh(1, 1, 3, 1));

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
				this.add(scrollPane1, CC.xy(1, 3, CC.FILL, CC.FILL));

				// ======== scrollPane2 ========
				{
					scrollPane2.setViewportView(table2);
				}
				this.add(scrollPane2, CC.xy(3, 3, CC.FILL, CC.FILL));

				// ======== panel1 ========
				{
					panel1.setLayout(new FormLayout("149dlu, $lcgap, 133dlu",
							"default"));

					// ---- knowledge ----
					knowledge.setText("Add");
					knowledge.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							knowledgeMouseClicked(e);
						}
					});
					panel1.add(knowledge, CC.xy(3, 1));
				}
				this.add(panel1, CC.xy(1, 5));

				// ======== panel2 ========
				{
					panel2.setLayout(new FormLayout("148dlu, $lcgap, 133dlu",
							"default"));

					// ---- skills ----
					skills.setText("Add");
					skills.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							skillsMouseClicked(e);
						}
					});
					panel2.add(skills, CC.xy(3, 1));
				}
				this.add(panel2, CC.xy(3, 5));

				// ======== panel4 ========
				{
					panel4.setLayout(new FormLayout("147dlu, $lcgap, 133dlu",
							"default"));

					// ---- button1 ----
					button1.setText("Next");
					button1.addMouseListener(new MouseAdapter() {
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
					panel4.add(button1, CC.xy(3, 1));
				}
				this.add(panel4, CC.xy(3, 7));
			}
			// frame1ContentPane.add(this, CC.xy(1, 1));
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}
		// //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY
	// //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Hasan Asghar
	private JFrame frame1;
	private JPanel panel3;
	private JLabel label1;
	private JScrollPane scrollPane1;
	private JTable table1;
	private JScrollPane scrollPane2;
	private JTable table2;
	private JPanel panel1;
	private JButton knowledge;
	private JPanel panel2;
	private JButton skills;
	private JPanel panel4;
	private JButton button1;
	// JFormDesigner - End of variables declaration //GEN-END:variables
}
