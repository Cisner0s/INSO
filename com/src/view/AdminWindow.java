package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

/**
*
* @author Francisco Carrera Martínez
*/
public class AdminWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btnNewButton;
	private JButton btnOk;
	private JButton btnNewButton_1;
	public String image;

	/**
	 * Create the frame.
	 */
	public AdminWindow(/*String nombre, String tipo*/) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("TopFilms");

		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_8.setColumns(10);
		
		btnNewButton = new JButton("Imagen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
		        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
		        int resultado = fileChooser.showOpenDialog(null);
		        if (resultado == JFileChooser.APPROVE_OPTION) {
		        	File seleccion = fileChooser.getSelectedFile();
		        	JOptionPane.showMessageDialog(null, "Archivo seleccionado: " + seleccion.getAbsolutePath());
		        	image = seleccion.getAbsolutePath();
		        }
			}
		});
		btnNewButton.setToolTipText("Imagen");
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*ListaContenido lc = new ListaContenido();
				if (nombre != "Nuevo") {
					if (tipo == "Pelicula") {
						Pelicula c = lc.getPelicula();
						c.setTitulo(textField_1.getText());
						c.setSinopsis(textField_1.getText());
						c.setFecha_Estreno(textField_2.getText());
						c.setGenero(textField_3.getText());
						c.setPresupuesto(textField_4.getText());
						c.setGanancias(textField_5.getText());
						c.setImagen(imagen);
						Añadir a lista de peliculas
					} else if (tipo == "Serie") {
						Serie c = lc.getSerie(nombre);
						c.setTitulo(textField.getText());
						c.setSinopsis(textField_1.getText());
						c.setFecha_Estreno(textField_2.getText());
						c.setGenero(textField_3.getText());
						c.setPresupuesto(textField_4.getText());
						c.setGanancias(textField_5.getText());
						c.setN_Episodios(textField_6.getText());
						c.setDuracion_Med_Episodios(textField_7.getText());
						c.setN_Temporadas(textField_8.getText());
						c.setImagen(imagen);
						Añadir a lista de series
					} else if (tipo == "Actor") {
						Actor c = lc.getActor(nombre);
						c.setNombre(textField.getText());
						c.setFecha_Nacimiento(textField_1.getText());
						c.setSexo(textField_2.getText());
						c.setLugar_Nacimiento(textField_3.getText());
						c.setNacionalidad(textField_5¡4.getText());
						c.setPremios(textField_5.getText());
						c.setImagen(imagen);
						Añadir a lista de actor
					} else if (tipo == "Director") {
						Director c = lc.getDirector(nombre);
						c.setNombre(textField.getText());
						c.setFecha_Nacimiento(textField_1.getText());
						c.setSexo(textField_2.getText());
						c.setLugar_Nacimiento(textField_3.getText());
						c.setNacionalidad(textField_4.getText());
						c.setPremios(textField_5.getText());
						c.setNominaciones(textField_6.getText());
						c.setImagen(imagen);
					} else if (tipo == "Estudio") {
						Estudio c = lc.getEstudio(nombre);
						c.setNombre(textField.getText());
						c.setFundacion(textField_1.getText());
						c.setPropietario(textField_2.getText());
						c.setSedes(textField_3.getText());
						c.setPatrimonio(textField_4.getText());
						c.setImagen(imagen);
					}
				} else {
					if (tipo == "Pelicula") {
						Pelicula c = new Pelicula();
						c.setTitulo(textField_1.getText());
						c.setSinopsis(textField_1.getText());
						c.setFecha_Estreno(textField_2.getText());
						c.setGenero(textField_3.getText());
						c.setPresupuesto(textField_4.getText());
						c.setGanancias(textField_5.getText());
						c.setImagen(imagen);
						Añadir a lista de peliculas
					} else if (tipo == "Serie") {
						Serie c = new Serie();
						c.setTitulo(textField.getText());
						c.setSinopsis(textField_1.getText());
						c.setFecha_Estreno(textField_2.getText());
						c.setGenero(textField_3.getText());
						c.setPresupuesto(textField_4.getText());
						c.setGanancias(textField_5.getText());
						c.setN_Episodios(textField_6.getText());
						c.setDuracion_Med_Episodios(textField_7.getText());
						c.setN_Temporadas(textField_8.getText());
						c.setImagen(imagen);
						Añadir a lista de series
					} else if (tipo == "Actor") {
						Actor c = new Actor();
						c.setNombre(textField.getText());
						c.setFecha_Nacimiento(textField_1.getText());
						c.setSexo(textField_2.getText());
						c.setLugar_Nacimiento(textField_3.getText());
						c.setNacionalidad(textField_5¡4.getText());
						c.setPremios(textField_5.getText());
						c.setImagen(imagen);
						Añadir a lista de actor
					} else if (tipo == "Director") {
						Director c = new Director();
						c.setNombre(textField.getText());
						c.setFecha_Nacimiento(textField_1.getText());
						c.setSexo(textField_2.getText());
						c.setLugar_Nacimiento(textField_3.getText());
						c.setNacionalidad(textField_4.getText());
						c.setPremios(textField_5.getText());
						c.setNominaciones(textField_6.getText());
						c.setImagen(imagen);
						Añadir a lista de director
					} else if (tipo == "Estudio") {
						Estudio c = new Estudio();
						c.setNombre(textField.getText());
						c.setFundacion(textField_1.getText());
						c.setPropietario(textField_2.getText());
						c.setSedes(textField_3.getText());
						c.setPatrimonio(textField_4.getText());
						c.setImagen(imagen);
						Añadir a lista de estudio
					}
				}
				*/
			}
		});
		btnOk.setToolTipText("OK");
		
		btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioWindow i = new InicioWindow();
				i.setVisible(true);
				setVisible(false);
			}
		});
		
		/*
		ListaContenido lc = new ListaContenido();
		if (nombre != "Nuevo") {
			if (tipo == "Pelicula") {
				Pelicula c = lc.getPelicula(nombre);
				textField.setText(c.getTitulo());
				textField_1.setText(c.getSinopsis());
				textField_2.setText(c.getFecha_Estreno());
				textField_3.setText(c.getGenero());
				textField_4.setText(c.getPresupuesto());
				textField_5.setText(c.getGanancias());
				textField_6.setVisible(false);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
			} else if (tipo == "Serie") {
				Serie c = lc.getSerie(nombre);
				textField.setText(c.getTitulo());
				textField_1.setText(c.getSinopsis());
				textField_2.setText(c.getFecha_Estreno());
				textField_3.setText(c.getGenero());
				textField_4.setText(c.getPresupuesto());
				textField_5.setText(c.getGanancias());
				textField_6.setText(c.getN_Episodios());
				textField_7.setText(c.getDuracion_Med_Episodios());
				textField_8.setText(c.getN_Temporadas());
			} else if (tipo == "Actor") {
				Actor c = lc.getActor(nombre);
				textField.setText(c.getNombre());
				textField_1.setText(c.getFecha_Nacimiento());
				textField_2.setText(c.getSexo());
				textField_3.setText(c.getLugar_Nacimiento());
				textField_4.setText(c.getNacionalidad());
				textField_5.setText(c.getPremios());
				textField_6.setVisible(false);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
			} else if (tipo == "Director") {
				Director c = lc.getDirector(nombre);
				textField.setText(c.getNombre());
				textField_1.setText(c.getFecha_Nacimiento());
				textField_2.setText(c.getSexo());
				textField_3.setText(c.getLugar_Nacimiento());
				textField_4.setText(c.getNacionalidad());
				textField_5.setText(c.getPremios());
				textField_6.setText(c.getNominaciones());
				textField_7.setVisible(false);
				textField_8.setVisible(false);
			} else if (tipo == "Estudio") {
				Estudio c = lc.getEstudio(nombre);
				textField.setText(c.getNombre());
				textField_1.setText(c.getFecha_Fundacion());
				textField_2.setText(c.getPropietario());
				textField_3.setText(c.getSedes());
				textField_4.setText(c.getPatrimonio());
				textField_5.setVisible(false);
				textField_6.setVisible(false);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
			}
		} else {
			if (tipo == "Pelicula") {
				textField.setText("Título");
				textField_1.setText("Sinopsis");
				textField_2.setText("Fecha de estreno");
				textField_3.setText("Genero");
				textField_4.setText("Presupuesto");
				textField_5.setText("Ganancias);
				textField_6.setVisible(false);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
			} else if (tipo == "Serie") {
				textField.setText("Titulo());
				textField_1.setText("Sinopsis");
				textField_2.setText("Fecha de estreno");
				textField_3.setText("Genero");
				textField_4.setText("Presupuesto");
				textField_5.setText("Ganancias");
				textField_6.setText("Nº Episodios");
				textField_7.setText("Duracion Med Episodios);
				textField_8.setText("Nº Temporadas");
			} else if (tipo == "Actor") {
				textField.setText("Nombre");
				textField_1.setText("Fecha de nacimiento");
				textField_2.setText("Sexo");
				textField_3.setText("Lugar de nacimiento");
				textField_4.setText("Nacionalidad");
				textField_5.setText("Premios");
				textField_6.setVisible(false);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
			} else if (tipo == "Director") {
				textField.setText("Nombre");
				textField_1.setText("Fecha de nacimiento");
				textField_2.setText("Sexo");
				textField_3.setText("Lugar de nacimiento");
				textField_4.setText("Nacionalidad");
				textField_5.setText("Premios");
				textField_6.setText("Nominaciones");
				textField_7.setVisible(false);
				textField_8.setVisible(false);
			} else if (tipo == "Estudio") {
				textField.setText("Nombre");
				textField_1.setText("Fecha de fundacion");
				textField_2.setText("Propietario");
				textField_3.setText("Sedes");
				textField_4.setText("Patrimonio");
				textField_5.setVisible(false);
				textField_6.setVisible(false);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
			}
		}
		*/
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(726, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
					.addGap(698))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(251)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(btnNewButton)
					.addGap(6)
					.addComponent(btnOk)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addContainerGap(266, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
