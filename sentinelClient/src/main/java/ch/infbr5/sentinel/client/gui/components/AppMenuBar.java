package ch.infbr5.sentinel.client.gui.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.KeyStroke;

public class AppMenuBar extends JMenuBar {

	public static final String CMD_DISPLAY_PERSON_SELECTION_DLG = "DISPLAY_PERSON_SELECTION_DLG";
	public static final String CMD_RESET_SYSTEM = "RESET_SYSTEM";
	public static final String CMD_EXIT = "EXIT";
	public static final String CMD_EINSTELLUNGEN = "EINSTELLUNGEN";
	public static final String CMD_EXPORT_PERSONDATA = "EXPORT_PERSONDATA";
	public static final String CMD_IMPORT_PERSONDATA = "IMPORT_PERSONDATA";
	public static final String CMD_EXPORT_CONFIG = "EXPORT_CONFIG";
	public static final String CMD_IMPORT_CONFIG = "IMPORT_CONFIG";
	public static final String CMD_IMPORT_FOTO = "FOTO_IMPORT";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenu adminMenu;
	private JMenuItem disableAdminItem;
	private JMenuItem enableAdminItem;
	private JMenuItem propertiesItem; 

	public AppMenuBar(ActionListener startMenuListener, boolean adminMode) {
		super();

		this.createStartMenu(startMenuListener);
		this.createCheckpointMenu(startMenuListener);
		this.createAdminMenu(startMenuListener);
		
		this.adminMenu.setVisible(adminMode);
		propertiesItem.setEnabled(adminMode);
	}

	private void createAdminMenu(ActionListener startMenuListener) {
		this.adminMenu = new JMenu("Admin");
		this.adminMenu.getAccessibleContext().setAccessibleDescription("Admin");
		this.add(this.adminMenu);

		JMenuItem exportPersonDataItem = new JMenuItem("Personendaten exportieren");
		exportPersonDataItem.setActionCommand(CMD_EXPORT_PERSONDATA);
		exportPersonDataItem.addActionListener(startMenuListener);
		this.adminMenu.add(exportPersonDataItem);

		JMenuItem importPersonDataItem = new JMenuItem("Personendaten importieren");
		importPersonDataItem.setActionCommand(CMD_IMPORT_PERSONDATA);
		importPersonDataItem.addActionListener(startMenuListener);
		this.adminMenu.add(importPersonDataItem);
		
		this.adminMenu.addSeparator();
		
		JMenuItem importFotoItem = new JMenuItem("Fotos importieren");
		importFotoItem.setActionCommand(CMD_IMPORT_FOTO);
		importFotoItem.addActionListener(startMenuListener);
		this.adminMenu.add(importFotoItem);

		this.adminMenu.addSeparator();
		
		JMenuItem exportConfigItem = new JMenuItem("Configuration exportieren");
		exportConfigItem.setActionCommand(CMD_EXPORT_CONFIG);
		exportConfigItem.addActionListener(startMenuListener);
		this.adminMenu.add(exportConfigItem);
		
		JMenuItem importConfigItem = new JMenuItem("Configuration importieren");
		importConfigItem.setActionCommand(CMD_IMPORT_CONFIG);
		importConfigItem.addActionListener(startMenuListener);
		this.adminMenu.add(importConfigItem);

		this.adminMenu.addSeparator();

		JMenuItem openLogfileItem = new JMenuItem("Logfile öffnen");
		openLogfileItem.addActionListener(startMenuListener);
		this.adminMenu.add(openLogfileItem);

		JMenuItem resetSystemItem = new JMenuItem("System löschen");
		resetSystemItem.setActionCommand(CMD_RESET_SYSTEM);
		resetSystemItem.addActionListener(startMenuListener);
		this.adminMenu.add(resetSystemItem);
	}

	private void createCheckpointMenu(ActionListener checkpointMenuListener) {
		JMenu menu = new JMenu("Checkpoint");
		menu.setMnemonic(KeyEvent.VK_C);
		menu.getAccessibleContext().setAccessibleDescription("Checkpoint");
		this.add(menu);

		JMenuItem menuItem = new JMenuItem("Manuelle Auswahl", KeyEvent.VK_F6);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, ActionEvent.ALT_MASK));
		menuItem.setActionCommand(CMD_DISPLAY_PERSON_SELECTION_DLG);
		menuItem.addActionListener(checkpointMenuListener);
		menu.add(menuItem);
	}

	private void createStartMenu(ActionListener startMenuListener) {
		JMenu menu = new JMenu("Start");
		menu.setMnemonic(KeyEvent.VK_S);
		menu.getAccessibleContext().setAccessibleDescription("Start");
		this.add(menu);

//		this.enableAdminItem = new JMenuItem("Admin-Modus aktivieren");
//		this.enableAdminItem.getAccessibleContext().setAccessibleDescription("Admin-Modus aktivieren");
//		this.enableAdminItem.setActionCommand("ENABLE_ADMIN_MODE");
//		this.enableAdminItem.addActionListener(startMenuListener);
//		menu.add(this.enableAdminItem);
//
//		this.disableAdminItem = new JMenuItem("Admin-Modus beenden");
//		this.disableAdminItem.getAccessibleContext().setAccessibleDescription("Admin-Modus beenden");
//		this.disableAdminItem.setActionCommand("DISABLE_ADMIN_MODE");
//		this.disableAdminItem.addActionListener(startMenuListener);
//		menu.add(this.disableAdminItem);
//		this.disableAdminItem.setVisible(false);
//		
		propertiesItem = new JMenuItem("Einstellungen", KeyEvent.VK_E);
		propertiesItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
		propertiesItem.getAccessibleContext().setAccessibleDescription("Einstellungen");
		propertiesItem.setActionCommand(CMD_EINSTELLUNGEN);
		propertiesItem.addActionListener(startMenuListener);
		menu.add(propertiesItem);
		
		
//		JMenuItem logoutItem = new JMenuItem("Logout", KeyEvent.VK_L);
//		logoutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK));
//		logoutItem.getAccessibleContext().setAccessibleDescription("Logout");
//		logoutItem.setActionCommand("LOGOUT");
//		logoutItem.addActionListener(startMenuListener);
//		menu.add(logoutItem);

		JMenuItem beendenItem = new JMenuItem("Beenden", KeyEvent.VK_B);
		beendenItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
		beendenItem.getAccessibleContext().setAccessibleDescription("Beenden");
		beendenItem.setActionCommand(CMD_EXIT);
		beendenItem.addActionListener(startMenuListener);
		menu.add(beendenItem);
	}

	public void disableAdminMode() {
		this.adminMenu.setVisible(false);
		this.enableAdminItem.setVisible(true);
		this.disableAdminItem.setVisible(false);

		this.revalidate();
	}

	public void enableAdminMode(String originalPassword) {
		JPasswordField field = new JPasswordField();
		JLabel txt = new JLabel("Bitte Adminpasswort eingeben");
		Object[] fields = { txt, field };
		JOptionPane.showConfirmDialog(this, fields, "Adminpasswort", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		String adminPassword = String.valueOf(field.getPassword());

		if (adminPassword != null && adminPassword.equals(originalPassword)) {
			this.adminMenu.setVisible(true);
			this.enableAdminItem.setVisible(false);
			this.disableAdminItem.setVisible(true);

			this.revalidate();
		} else {
			JOptionPane.showMessageDialog(this, "Adminpasswort stimmt nicht überein.", "Adminpasswort falsch",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
