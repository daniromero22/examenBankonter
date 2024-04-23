package principal.views;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JTextField;

import principal.controllers.ControladorContrato;
import principal.controllers.ControladorUsuario;
import principal.entities.Contrato;
import principal.entities.Usuario;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;

import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GestionContrato extends JPanel {

	private static final long serialVersionUID = 1L;
	private static GestionContrato instance = null;
	private JTextField jtfId;
	private JTextField jtfDescripcion;
	private JTextField jtfSaldo;
	private JTextField jtfLimite;
	JComboBox<Usuario> jcbUsuario;
	JColorChooser jColorChooser;
	private JTextField jtfFechaDeFirma;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JCheckBox chkbxTipo;
	JRadioButton rdbtnNewRadioButton;
	JRadioButton rdbtnNewRadioButton_1;
	JRadioButton rdbtnNewRadioButton_2;
	JRadioButton rdbtnNewRadioButton_3;



	/**
	 * Create the panel.
	 */
	public GestionContrato(Contrato c) {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNewLabel = new JLabel("Gestion de contratos");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridwidth = 11;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ID:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		add(lblNewLabel_1, gbc_lblNewLabel_1);

		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.gridwidth = 10;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridy = 2;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Tipo de contrato:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 3;
		add(lblNewLabel_2, gbc_lblNewLabel_2);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cuenta Bancaria");
		buttonGroup.add(rdbtnNewRadioButton);
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 3;
		add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Tarjeta crédito");
		buttonGroup.add(rdbtnNewRadioButton_2);
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_2.gridx = 6;
		gbc_rdbtnNewRadioButton_2.gridy = 3;
		add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tarjeta débito");
		buttonGroup.add(rdbtnNewRadioButton_1);
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_1.gridx = 1;
		gbc_rdbtnNewRadioButton_1.gridy = 4;
		add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Préstamo");
		buttonGroup.add(rdbtnNewRadioButton_3);
		GridBagConstraints gbc_rdbtnNewRadioButton_3 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton_3.gridx = 6;
		gbc_rdbtnNewRadioButton_3.gridy = 4;
		add(rdbtnNewRadioButton_3, gbc_rdbtnNewRadioButton_3);

		JLabel lblNewLabel_3 = new JLabel("Descripcion:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 5;
		add(lblNewLabel_3, gbc_lblNewLabel_3);

		jtfDescripcion = new JTextField();
		GridBagConstraints gbc_jtfDescripcion = new GridBagConstraints();
		gbc_jtfDescripcion.gridwidth = 10;
		gbc_jtfDescripcion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDescripcion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDescripcion.gridx = 1;
		gbc_jtfDescripcion.gridy = 5;
		add(jtfDescripcion, gbc_jtfDescripcion);
		jtfDescripcion.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Usuario:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 6;
		add(lblNewLabel_4, gbc_lblNewLabel_4);

		jcbUsuario = new JComboBox<Usuario>();
		GridBagConstraints gbc_jcbUsuario = new GridBagConstraints();
		gbc_jcbUsuario.gridwidth = 5;
		gbc_jcbUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_jcbUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbUsuario.gridx = 1;
		gbc_jcbUsuario.gridy = 6;
		add(jcbUsuario, gbc_jcbUsuario);

		JButton btnGestionProveedor = new JButton("Gestión Usuario");
		btnGestionProveedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				gestionUsuario();
			}
		});
		GridBagConstraints gbc_btnGestionProveedor = new GridBagConstraints();
		gbc_btnGestionProveedor.insets = new Insets(0, 0, 5, 5);
		gbc_btnGestionProveedor.gridx = 6;
		gbc_btnGestionProveedor.gridy = 6;
		add(btnGestionProveedor, gbc_btnGestionProveedor);

		JLabel lblNewLabel_5 = new JLabel("Saldo(€):");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 7;
		add(lblNewLabel_5, gbc_lblNewLabel_5);

		jtfSaldo = new JTextField();
		GridBagConstraints gbc_jtfSaldo = new GridBagConstraints();
		gbc_jtfSaldo.gridwidth = 10;
		gbc_jtfSaldo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfSaldo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfSaldo.gridx = 1;
		gbc_jtfSaldo.gridy = 7;
		add(jtfSaldo, gbc_jtfSaldo);
		jtfSaldo.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Limite(€):");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 8;
		add(lblNewLabel_6, gbc_lblNewLabel_6);

		jtfLimite = new JTextField();
		GridBagConstraints gbc_jtfLimite = new GridBagConstraints();
		gbc_jtfLimite.gridwidth = 10;
		gbc_jtfLimite.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLimite.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLimite.gridx = 1;
		gbc_jtfLimite.gridy = 8;
		add(jtfLimite, gbc_jtfLimite);
		jtfLimite.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Fecha de firma:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 9;
		add(lblNewLabel_7, gbc_lblNewLabel_7);

		jtfFechaDeFirma = new JTextField();
		GridBagConstraints gbc_jtfFechaDeFirma = new GridBagConstraints();
		gbc_jtfFechaDeFirma.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFechaDeFirma.gridwidth = 10;
		gbc_jtfFechaDeFirma.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFechaDeFirma.gridx = 1;
		gbc_jtfFechaDeFirma.gridy = 9;
		add(jtfFechaDeFirma, gbc_jtfFechaDeFirma);
		jtfFechaDeFirma.setColumns(10);

		JButton btnNewButton = new JButton("Guardar");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 11;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 10;
		add(btnNewButton, gbc_btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		cargarPrimero();

	}

	public void abrirNuevoDialogo(JPanel panel) {
		JDialog dialogo = new JDialog();
		// El usuario no puede redimensionar el di�logo
		dialogo.setResizable(true);
		// t�tulo del d�alogo
		dialogo.setTitle("Gestión de empresas");
		// Introducimos el panel creado sobre el di�logo
		dialogo.setContentPane(panel);
		// Empaquetar el di�logo hace que todos los componentes ocupen el espacio que
		// deben y el lugar adecuado
		dialogo.pack();
		// El usuario no puede hacer clic sobre la ventana padre, si el Di�logo es modal
		dialogo.setModal(true);
		// Centro el di�logo en pantalla
		dialogo.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width) / 2 - dialogo.getWidth() / 2,
				(Toolkit.getDefaultToolkit().getScreenSize().height) / 2 - dialogo.getHeight() / 2);
		// Muestro el di�logo en pantalla
		dialogo.setVisible(true);
	}

	private void gestionUsuario() {
		Usuario p = (Usuario) this.jcbUsuario.getSelectedItem();
		GestionUsuario gp = new GestionUsuario(p);
		gp.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		gp.setVisible(true);
	}

	public boolean esPrecioFloat() {
		try {
			Float.parseFloat(this.jtfSaldo.getText());
			return true;
		} catch (Exception e) {
			return false;
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

//	private void selUsuario(Usuario o) {
//		for (int i = 0; i < this.jcbUsuario.getItemCount(); i++) {
//			if (this.jcbUsuario.getItemAt(i).getId() == o.getNombreUsuario()) {
//				this.jcbUsuario.setSelectedIndex(i);
//			}
//		}
//	}

	private boolean isFechaValida() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String strFechaCad = this.jtfFechaDeFirma.getText();

		if (!strFechaCad.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}"))
			return false;

		if (strFechaCad.trim().equals("")) {
			return false;
		}
		Date fechaCad = null;
		try {
			fechaCad = sdf.parse(strFechaCad);

			System.out.println(sdf.format(fechaCad));
			return true;
		} catch (Exception ex) {
			return false;
		}

	}
	
	private void cargarPrimero() {

		Contrato o = ControladorContrato.getPrimero();
		if (o != null) {
			this.jtfLimite.setText(String.valueOf (o.getLimite()));
			this.jtfId.setText(String.valueOf(o.getId()));
			this.jtfDescripcion.setText(o.getDescripcion());
			this.jtfSaldo.setText(String.valueOf(o.getSaldo()));
			if (o.isIdTipoContrato()) {
				this.chkbxTipo.setSelected(true);
			} else {
				this.chkbxTipo.setSelected(false);
			}

//			if (o.getDescripcion() == ) {
//				this.rdbtnNewRadioButton.setSelected(true);
//			}
//			if (o.getIva() == 4) {
//				this.rdbtnNewRadioButton_1.setSelected(true);
//			}
//			if (o.getIva() == 10) {
//				this.rdbtnNewRadioButton_2.setSelected(true);
//			}
//			if (o.getIva() == 21) {
//				this.rdbtnNewRadioButton_3.setSelected(true);
//			}

//			selUsuario(o);

		}

	}

	private void guardar() {

		Usuario p = ControladorUsuario.findArtById(Integer.parseInt(this.jtfId.getText()));

		if (isFechaValida()) {

			ControladorUsuario.update(p);
			JOptionPane.showMessageDialog(null, "Registro modificado con éxito");
		} else {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar, la fecha no es válida");
		}

	}
	
//	private void cargarPProveedores() {
//		List<Proveedor> l = ControladorProveedores.findAll();
//		for (Proveedor proveedor : l) {
//			this.jcbProveedor.addItem(proveedor);
//			;
//		}
//
//	}

}
