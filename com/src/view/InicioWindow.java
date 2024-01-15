package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*
* @author Francisco Carrera Martínez
*/
public class InicioWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBuscar;
	public String tipo;
	public String nombre;

	/**
	 * Create the frame.
	 */
	public InicioWindow(/*Usuario u*/) {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("TopFilms");

		setContentPane(contentPane);
		
		ImageIcon icono = new ImageIcon("src/main/java/img/ico.jpg");
		icono.setImage(icono.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
		JLabel lblNewLabel = new JLabel(icono);
		
		JLabel lblNewLabel_1 = new JLabel("Buscar:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Película");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtBuscar = new JTextField();
		txtBuscar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtBuscar.getText().equals("Buscar") && txtBuscar.getForeground().equals(Color.gray)) {
                    txtBuscar.setText("");
                    txtBuscar.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtBuscar.getText().equals("")) {
					txtBuscar.setText("Buscar");
					txtBuscar.setForeground(Color.gray);
				}
			}
		});
		txtBuscar.setForeground(new Color(128, 128, 128));
		txtBuscar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtBuscar.setText("Buscar");
		txtBuscar.setColumns(10);
		
		JRadioButton rdbtnSerie = new JRadioButton("Serie");
		rdbtnSerie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton rdbtnActor = new JRadioButton("Actor");
		rdbtnActor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton rdbtnDirector = new JRadioButton("Director");
		rdbtnDirector.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton rdbtnEstudio = new JRadioButton("Estudio");
		rdbtnEstudio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnSerie);
		buttonGroup.add(rdbtnActor);
		buttonGroup.add(rdbtnDirector);
		buttonGroup.add(rdbtnEstudio);
		
		ImageIcon icono2 = new ImageIcon("src/main/java/img/lupa.png");
		icono2.setImage(icono2.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH));
		JButton btnNewButton = new JButton(icono2);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*ListaContenido lc = new ListaContenido();
				boolean checked = false;
				if (rdbtnNewRadioButton.isSelected()) {
					lc.setCheckPeli(true);
					checked = true;
				} else if (rdbtnSerie.isSelected()){
					lc.setCheckSerie(true);
					checked = true;
				} else if (rdbtnActor.isSelected()){
					lc.setCheckSerie(true);
					checked = true;
				} else if (rdbtnNewDirector.isSelected()){
					lc.setCheckSerie(true);
					checked = true;
				} else if (rdbtnEstudio.isSelected()){
					lc.setCheckSerie(true);
					checked = true;
				} else {
					JOptionPane.showMessageDialog(null, "Selecciona el tipo de contenido que quieres buscar.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				if (checked == true) {
				    lc.setBusqueda(txtBuscar.getText());
				    if (lc.getBusqueda == false) {
				    	lblNewLabel_2.setVisible(true);
				    } else {
				    	lblNewLabel_2.setVisible(false);
				    	if (lc.getCheckPeli() == true) {
							Pelicula p = lc.getPelicula(txtBuscar.getText());
							btnNewButton_2.setText(p.getTitulo());
							ImageIcon icono = new ImageIcon(p.getImage());
							tipo = "Pelicula";
							nombre = p.getTitulo();
						} else if (lc.getCheckSerie() == true){
							Serie s = lc.getSerie(txtBuscar.getText());
							btnNewButton_2.setText(s.getTitulo());
							ImageIcon icono = new ImageIcon(s.getImage());
							tipo = "Serie";
							nombre = s.getTitulo();
						} else if (lc.getCheckActor() == true){
							Actor a = lc.getActor(txtBuscar.getText());
							btnNewButton_2.setText(a.getTitulo());
							ImageIcon icono = new ImageIcon(a.getImage());
							tipo = "Actor";
							nombre = a.getTitulo()
						} else if (lc.getCheckDirector() == true){
							Director d = lc.getDirector(txtBuscar.getText());
							btnNewButton_2.setText(d.getTitulo());
							ImageIcon icono = new ImageIcon(d.getImage());
							tipo = "Director";
							nombre = d.getTitulo()
						} else if (lc.getCheckEstudio() == true){
							Estudio s = lc.getEstudio(txtBuscar.getText());
							btnNewButton_2.setText(e.getTitulo());
							ImageIcon icono = new ImageIcon(e.getImage());
							tipo = "Estudio";
							nombre = e.getTitulo()
				    	}
				    	icono.setImage(icono.getImage().getScaledInstance(20, 30, java.awt.Image.SCALE_SMOOTH));
						btnNewButton_1.setIcon(icono);
						btnNewButton_1.setVisible(true);
						btnNewButton_2.setVisible(true);
				    }
				}*/											
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setToolTipText("Buscar");
		
		JButton btnNewButton_1 = new JButton("New button");
		//btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if (u.getRol() == "Administrador") {
					Admin a = new Admin(tipo, nombre);
					a.setVisible();
					setVisible();
				} else {*/
					Vista v = new Vista(/*tipo, nombre, u*/);
					v.setVisible(true);
					setVisible(false);
				//}
			}
		});
		btnNewButton_1.setVisible(true);
		
		JButton btnNewButton_2 = new JButton("New button");
		//btnNewButton_2.setVisible(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if (u.getRol() == "Administrador") {
				Admin a = new Admin(tipo, nombre);
				a.setVisible();
				setVisible();
			} else {*/
				Vista v = new Vista(/*tipo, nombre, u*/);
				v.setVisible(true);
				setVisible(false);
			//}
			}
		});
		btnNewButton_2.setVisible(true);	
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblNewLabel_2 = new JLabel("No hay resultados");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setVisible(false);
		
		JButton btnNewButton_3 = new JButton("Ver Perfil");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PerfilWindow p = new PerfilWindow(/*u*/);
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 26));
		btnNewButton_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		JLabel lblNewLabel_3 = new JLabel("Resultados:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JButton btnNewButton_4 = new JButton("Añadir contenido");
		/*if (u.getRol == "Administrador") {
			btnNewButton_5.setVisible(false);
		}*/
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*boolean checked;
				if (rdbtnNewRadioButton.isSelected()) {
					tipo = "Pelicula";
					checked = true;
				} else if (rdbtnSerie.isSelected()){
					tipo = "Serie";
					checked = true;
				} else if (rdbtnActor.isSelected()){
					tipo = "Actor";
					checked = true;
				} else if (rdbtnNewDirector.isSelected()){
					tipo = "Director";
					checked = true;
				} else if (rdbtnEstudio.isSelected()){
					tipo = "Estudio";
					checked = true;
				} else {
					JOptionPane.showMessageDialog(null, "Selecciona el tipo de contenido que quieres añadir.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				if (checked == true) {*/
					AdminWindow a = new AdminWindow(/*"Nuevo", "tipo"*/);
					a.setVisible(true);
					setVisible(false);
				//}
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton_5 = new JButton("Cerrar sesión");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioSesionWindow i = new InicioSesionWindow();
				i.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5.setToolTipText("Cerrar sesión");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(100)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnDirector, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnEstudio, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
											.addGap(54)
											.addComponent(btnNewButton))
										.addComponent(rdbtnActor, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnSerie, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
										.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel))
									.addGap(300)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_3)
										.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(80)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(100)
							.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(638, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_1)
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtBuscar, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addGap(54)
					.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnSerie, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnActor, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnDirector, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnEstudio, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(btnNewButton_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_5, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(356))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(80)
					.addComponent(lblNewLabel_3)
					.addGap(30)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnNewButton_2)
					.addGap(270)
					.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(165))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
