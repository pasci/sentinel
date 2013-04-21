package ch.infbr5.sentinel.client.gui.components.configuration;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import ch.infbr5.sentinel.client.gui.util.SwingHelper;

public abstract class AbstractAdminDetailPanel<T> extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected T data;

	public void setDataRecord(T record) {
		data = record;
		if (data != null) {
			setFieldValues();
		} else {
			clearFieldValues();
		}
	}

	public T getDataRecord() {
		if (data != null) {
			getFieldValues();
		}
		
		return data;
	}
	
	protected JTextField createField(String fieldCaption) {
		JTextField field = new JTextField();
		
		add(SwingHelper.createLabel(fieldCaption), "gap para");
		field = SwingHelper.createTextField(30);
		add(field, "span, growx");
		
		return field;
	}
	
	protected JCheckBox createCheckbox(String fieldCaption) {
		JCheckBox checkbox = new JCheckBox();
		
		add(SwingHelper.createLabel(fieldCaption), "gap para");
		checkbox = SwingHelper.createCheckBox();
		add(checkbox, "span, growx");
		
		return checkbox;
	}

	public abstract void getFieldValues();

	public abstract void setFieldValues();

	public abstract void clearFieldValues();

	public abstract void setEditable(boolean mode);

}
