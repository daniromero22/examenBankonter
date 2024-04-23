package principal.views;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import principal.controllers.ControladorUsuario;
import principal.entities.Usuario;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionUsuario extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField jtfId;
	private JTextField jtfUsuario;
	private JTextField jtfEmail;
	private JTextField jtfContraseña;
	private JComboBox<String> jcbColorPreferido;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
//			GestionProveedor dialog = new GestionProveedor(p);
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestionUsuario(Usuario p) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("Gestion de usuarios");
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.gridwidth = 3;
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 0;
			gbc_lblNewLabel.gridy = 1;
			contentPanel.add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Id:");
			GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
			gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_1.gridx = 0;
			gbc_lblNewLabel_1.gridy = 2;
			contentPanel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		}
		{
			jtfId = new JTextField();
			GridBagConstraints gbc_jtfId = new GridBagConstraints();
			gbc_jtfId.gridwidth = 2;
			gbc_jtfId.insets = new Insets(0, 0, 5, 0);
			gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtfId.gridx = 1;
			gbc_jtfId.gridy = 2;
			contentPanel.add(jtfId, gbc_jtfId);
			jtfId.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Usuario:");
			GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
			gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_2.gridx = 0;
			gbc_lblNewLabel_2.gridy = 3;
			contentPanel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		}
		{
			jtfUsuario = new JTextField();
			GridBagConstraints gbc_jtfUsuario = new GridBagConstraints();
			gbc_jtfUsuario.gridwidth = 2;
			gbc_jtfUsuario.insets = new Insets(0, 0, 5, 0);
			gbc_jtfUsuario.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtfUsuario.gridx = 1;
			gbc_jtfUsuario.gridy = 3;
			contentPanel.add(jtfUsuario, gbc_jtfUsuario);
			jtfUsuario.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Contraseña:");
			GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
			gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_3.gridx = 0;
			gbc_lblNewLabel_3.gridy = 4;
			contentPanel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		}
		{
			jtfContraseña = new JTextField();
			GridBagConstraints gbc_jtfContraseña = new GridBagConstraints();
			gbc_jtfContraseña.gridwidth = 2;
			gbc_jtfContraseña.insets = new Insets(0, 0, 5, 0);
			gbc_jtfContraseña.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtfContraseña.gridx = 1;
			gbc_jtfContraseña.gridy = 4;
			contentPanel.add(jtfContraseña, gbc_jtfContraseña);
			jtfContraseña.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Email:");
			GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
			gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_5.gridx = 0;
			gbc_lblNewLabel_5.gridy = 5;
			contentPanel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		}
		{
			jtfEmail = new JTextField();
			GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
			gbc_jtfEmail.gridwidth = 2;
			gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
			gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
			gbc_jtfEmail.gridx = 1;
			gbc_jtfEmail.gridy = 5;
			contentPanel.add(jtfEmail, gbc_jtfEmail);
			jtfEmail.setColumns(10);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("Color preferido:");
			GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
			gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
			gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel_6.gridx = 0;
			gbc_lblNewLabel_6.gridy = 6;
			contentPanel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		}
		{
			{
				jcbColorPreferido = new JComboBox<String>();
				GridBagConstraints gbc_jcbColorPreferido = new GridBagConstraints();
				gbc_jcbColorPreferido.gridwidth = 2;
				gbc_jcbColorPreferido.insets = new Insets(0, 0, 5, 0);
				gbc_jcbColorPreferido.fill = GridBagConstraints.HORIZONTAL;
				gbc_jcbColorPreferido.gridx = 1;
				gbc_jcbColorPreferido.gridy = 6;
				contentPanel.add(jcbColorPreferido, gbc_jcbColorPreferido);
			}
		}
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnNewButton.setIcon(
				new ImageIcon(GestionUsuario.class.getResource("/tutorialJava/capitulo9_AWT_SWING/res/guardar.png")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 7;
		contentPanel.add(btnNewButton, gbc_btnNewButton);

		cargarNacionalidades();
		cargarDatos(p);
	}
	
	public void seleccionarNacionalidad(Usuario pro) {

		for (int i = 0; i < this.jcbColorPreferido.getItemCount(); i++) {

			if (this.jcbColorPreferido.getItemAt(i).toString().equals(pro.getColorPreferido())) {
				this.jcbColorPreferido.setSelectedIndex(i);
				break; // Salir del bucle una vez que se haya seleccionado la nacionalidad
			}
		}
	}

	private void cargarDatos(Usuario p) {
		this.jtfId.setText(String.valueOf(p.getId()));
		this.jtfUsuario.setText(p.getNombreUsuario());
		this.jtfEmail.setText(p.getEmail());
		
		seleccionarNacionalidad(p);

	}

	

	public static boolean tieneFormatoFecha(String texto) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false); // Esto hace que la validación sea estricta

		try {
			Date fecha = sdf.parse(texto);
			return true; // Si la cadena se puede parsear como fecha, entonces tiene el formato correcto
		} catch (ParseException e) {
			return false; // Si hay una excepción al parsear, significa que no tiene el formato correcto
		}
	}

	public static Date deStringADate(String texto) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Date fecha = sdf.parse(texto);
			return fecha; // Si la cadena se puede parsear como fecha, entonces tiene el formato correcto
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Error, la fecha no tiene un formato valido");
			return null; // Si hay una excepción al parsear, significa que no tiene el formato correcto
		}
	}

	private void cargarNacionalidades() {
	}

	private void guardar() {

		Usuario p = ControladorUsuario.findArtById(Integer.parseInt(this.jtfId.getText()));

//		if (isFechaValida()) {

			p.setColorPreferido(String.valueOf(this.jcbColorPreferido.getSelectedItem()));

			ControladorUsuario.update(p);
			JOptionPane.showMessageDialog(null, "Registro modificado con éxito");
//		} else {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar, la fecha no es válida");
//		}

	}

}
