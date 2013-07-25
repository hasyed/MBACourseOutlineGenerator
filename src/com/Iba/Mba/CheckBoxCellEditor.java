package com.Iba.Mba;
import java.awt.Color;
import java.awt.Component;

import javax.swing.AbstractCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

class CheckBoxCellEditor extends AbstractCellEditor implements
		TableCellEditor {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JCheckBox checkBox;

	public CheckBoxCellEditor() {
		checkBox = new JCheckBox();
		checkBox.setHorizontalAlignment(SwingConstants.CENTER);
		checkBox.setBackground(Color.white);
		checkBox.isEnabled();
		//checkBox.setSelected(false);
	}

	public Component getTableCellEditorComponent(JTable table, Object value,
			boolean isSelected, int row, int column) {

		//checkBox.setSelected(false);

		// Component c =
		// table.getDefaultRenderer(String.class).getTableCellRendererComponent(table,
		// value, isSelected, false, row, column);
		// if (c != null) {
		// checkBox.setBackground(c.getBackground());
		// }

		return checkBox;
	}

	public Object getCellEditorValue() {
		return Boolean.valueOf(checkBox.isSelected());
	}
}