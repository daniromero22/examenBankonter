package principal.views;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.ResourceBundle.Control;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import principal.controllers.ControladorEstudiantes;
import principal.controllers.DatosDeTabla;
import principal.controllers.SuperControlador;
import principal.entities.Estudiante;


public class PanelTabla extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tableAlumnos;
	private DefaultTableModel dtm = null;
	private Object datosEnTabla[][] = DatosDeTabla.getDatosDeTabla();
	private String titulosEnTabla[] = DatosDeTabla.getTitulosColumnas();
	private static PanelTabla instance = null;
	
	public static PanelTabla getInstance() {
		if (instance == null) {
			instance = new PanelTabla();
		}
		
		return instance;
	}
	
	
	
	
	/**
	 * Create the panel.
	 */
	public PanelTabla() {
		setLayout(new BorderLayout(0, 0));
		
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		add(splitPane, BorderLayout.CENTER);
		this.dtm = getDefaultTableModelNoEditable();
		tableAlumnos = new JTable(dtm);
		JScrollPane scrollPane = new JScrollPane(tableAlumnos);
		
		tableAlumnos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				int indiceFilaSel = tableAlumnos.getSelectedRow();
				Object value = datosEnTabla[indiceFilaSel][0];

				Estudiante estSeleccionado = ControladorEstudiantes.getInstance().obtenerEstudiantePorId((Integer)value);
				ControladorEstudiantes.getInstance().mostrarEstudiante(estSeleccionado);
				PanelEStudiante panelEstudiante = new PanelEStudiante(estSeleccionado);
				JScrollPane scrollPane2 = new JScrollPane(panelEstudiante);
				splitPane.setRightComponent(scrollPane2);
				splitPane.setResizeWeight(0.2);
				
			}
		});
		
		
		
		
		splitPane.setLeftComponent(scrollPane);
		
	}
	
	public void actualizarTabla(Estudiante e) {
	    // 1. Actualizar los datos en la matriz datosEnTabla
	    datosEnTabla = DatosDeTabla.getDatosDeTabla(); // Suponiendo que obtienes los nuevos datos de alguna fuente
	    int f = tableAlumnos.getSelectedRow();
	    
	    
	    this.datosEnTabla[f][0] = e.getId();
	    this.datosEnTabla[f][1] = e.getNombre();
	    this.datosEnTabla[f][2] = e.getApellido_1();
	    this.datosEnTabla[f][3] = e.getApellido_2();
	    this.datosEnTabla[f][4] = e.getDni();
	    this.datosEnTabla[f][5] = e.getDireccion();
	    this.datosEnTabla[f][6] = e.getMail();
	    this.datosEnTabla[f][7] = e.getTelefono();
	    this.datosEnTabla[f][8] = e.getIdSexo();
	    this.datosEnTabla[f][9] = e.getImagen();
	    this.datosEnTabla[f][10] = e.getColorFavorito();
	    

	    // 3. Notificar a la tabla que los datos han sido actualizados
	    dtm.fireTableDataChanged();
	    

	    
	}

	
	
	private DefaultTableModel getDefaultTableModelNoEditable () {
		DefaultTableModel dtm = new DefaultTableModel(datosEnTabla, titulosEnTabla) {
			
			/**
			 * La sobreescritura de este método nos permite controlar qué celdas queremos que sean editables
			 */
			@Override
			public boolean isCellEditable(int row, int column) {
				if (column != 1) {
					return false;
				}
				return true;
			}
		};
		return dtm;
	}

	public Object[][] getDatosEnTabla() {
		return datosEnTabla;
	}

	public void setDatosEnTabla(Object[][] datosEnTabla) {
		this.datosEnTabla = datosEnTabla;
	}
	
	
	
	
	
	
	
}
