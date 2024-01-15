package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextPane;

/**
*
* @author Francisco Carrera Martínez
*/
public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEscribeTuResea;
	private JTextField txtT;

	/**
	 * Create the frame.
	 */
	public Vista(/*String nombre, String tipo, Usuario u*/) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("TopFilms");

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel();		
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_4 = new JLabel("New label");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_5 = new JLabel("New label");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3_6 = new JLabel("New label");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioWindow i = new InicioWindow();
				i.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setToolTipText("Atrás");
		
		JLabel lblNewLabel_4 = new JLabel("Críticas profesionales");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNewLabel_5 = new JLabel("Reseñas");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtEscribeTuResea = new JTextField();
		txtEscribeTuResea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtEscribeTuResea.getText().equals("Escribe tu reseña") && txtEscribeTuResea.getForeground().equals(Color.gray)) {
					txtEscribeTuResea.setText("");
					txtEscribeTuResea.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtEscribeTuResea.getText().equals("")) {
					txtEscribeTuResea.setText("Escribe tu reseña");
					txtEscribeTuResea.setForeground(Color.gray);
				}
			}
		});
		txtEscribeTuResea.setForeground(new Color(128, 128, 128));
		txtEscribeTuResea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEscribeTuResea.setToolTipText("Escribe tu reseña");
		txtEscribeTuResea.setText("Escribe tu reseña");
		txtEscribeTuResea.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Añadir reseña");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if (u.getRol() == "Crítico") {
					Critica c = new Critica();
					c.setTitulo_Critica(txtT.getText());
					c.setTexto_Critica(txtEscribeTuResea.getText());
					Añadir a lista de Críticas
				} else {
					Reseña c = new Reseña();
					c.setTitulo_Reseña(txtT.getText());
					c.setTexto_Reseña(txtEscribeTuResea.getText());
					Añadir a lista de Reseñas
				}*/
			}
		});
		
		txtT = new JTextField();
		txtT.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtT.getText().equals("Título reseña") && txtT.getForeground().equals(Color.gray)) {
					txtT.setText("");
					txtT.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtT.getText().equals("")) {
					txtT.setText("Título reseña");
					txtT.setForeground(Color.gray);
				}
			}
		});
		txtT.setToolTipText("Título reseña");
		txtT.setForeground(new Color(128, 128, 128));
		txtT.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtT.setText("Título reseña");
		txtT.setColumns(10);
		JTextPane textPane = new JTextPane();
		
		JTextPane textPane_1 = new JTextPane();
		
		/*
		ListaContenido lc = new ListaContenido();
		if (tipo == "Pelicula") {
			Pelicula c = lc.getPelicula(nombre);
			ImageIcon icono = new ImageIcon(c.getImagen);
			icono.setImage(icono.getImage().getScaledInstance(250, 375, java.awt.Image.SCALE_SMOOTH));
			lblNewLabel.setIcon(icono);
			lblNewLabel_1.setText(c.getTitulo());
			lblNewLabel_2.setText("Sinopsis: " + c.getSinopsis());
			lblNewLabel_3.setText("Fecha Estreno: " + c.getFecha_Estreno());
			lblNewLabel_3_1.setText("Genero: " + c.getGenero());
			lblNewLabel_3_2.setText("Presupuesto: " + c.getPresupuesto());
			lblNewLabel_3_3.setText("Ganancias: " + c.getGanancias());
			lblNewLabel_3_4.setVisible(false);
			lblNewLabel_3_5.setVisible(false);
			lblNewLabel_3_6.setVisible(false);
			textPane.setText(Reseñas);
			textPane.setText(Criticas);
		} else if (tipo == "Serie") {
			Serie c = lc.getSerie(nombre);
			ImageIcon icono = new ImageIcon(c.getImagen);
			icono.setImage(icono.getImage().getScaledInstance(250, 375, java.awt.Image.SCALE_SMOOTH));
			lblNewLabel.setIcon(icono);
			lblNewLabel_1.setText(c.getTitulo());
			lblNewLabel_2.setText("Sinopsis: " + c.getSinopsis());
			lblNewLabel_3.setText("Fecha Estreno: " + c.getFecha_Estreno());
			lblNewLabel_3_1.setText("Genero: " + c.getGenero());
			lblNewLabel_3_2.setText("Presupuesto: " + c.getPresupuesto());
			lblNewLabel_3_3.setText("Ganancias: " + c.getGanancias());
			lblNewLabel_3_4.setText("Nº Episodios: " + c.getN_Episodios());
			lblNewLabel_3_5.setText("Duración Med Episodios: " + c.getDuracion_Med_Episodios());
			lblNewLabel_3_6.setText("Nº Temporadas: " + c.getN_Temporadas());
			textPane.setText(Reseñas);
			textPane.setText(Criticas);
		} else if (tipo == "Actor") {
			Actor c = lc.getActor(nombre);
			ImageIcon icono = new ImageIcon(c.getImagen);
			icono.setImage(icono.getImage().getScaledInstance(250, 375, java.awt.Image.SCALE_SMOOTH));
			lblNewLabel.setIcon(icono);
			lblNewLabel_1.setText(c.getNombre());
			lblNewLabel_2.setText("Fecha de nacimiento: " + c.getFecha_Nacimiento());
			lblNewLabel_3.setText("Sexo: " + c.getSexo());
			lblNewLabel_3_1.setText("Lugar de nacimiento: " + c.getLugar_Nacimiento());
			lblNewLabel_3_2.setText("Nacionalidad: " + c.getNacionalidad());
			lblNewLabel_3_3.setText("Premios: " + c.getPremios());
			lblNewLabel_3_4.setVisible(false);
			lblNewLabel_3_5.setVisible(false);
			lblNewLabel_3_6.setVisible(false);
			textPane.setText(Reseñas);
			textPane.setText(Criticas);
		} else if (tipo == "Director") {
			Director c = lc.getDirector(nombre);
			ImageIcon icono = new ImageIcon(c.getImagen);
			icono.setImage(icono.getImage().getScaledInstance(250, 375, java.awt.Image.SCALE_SMOOTH));
			lblNewLabel.setIcon(icono);
			lblNewLabel_1.setText(c.getNombre());
			lblNewLabel_2.setText("Fecha de nacimiento: " + c.getFecha_Nacimiento());
			lblNewLabel_3.setText("Sexo: " + c.getSexo());
			lblNewLabel_3_1.setText("Lugar de nacimiento: " + c.getLugar_Nacimiento());
			lblNewLabel_3_2.setText("Nacionalidad: " + c.getNacionalidad());
			lblNewLabel_3_3.setText("Premios: " + c.getPremios());
			lblNewLabel_3_4.setText("Nominaciones: " + c.getNominaciones());
			lblNewLabel_3_5.setVisible(false);
			lblNewLabel_3_6.setVisible(false);
			textPane.setText(Reseñas);
			textPane.setText(Criticas);
		} else if (tipo == "Estudio") {
			Estudio c = lc.getEstudio(nombre);
			ImageIcon icono = new ImageIcon(c.getImagen);
			icono.setImage(icono.getImage().getScaledInstance(250, 375, java.awt.Image.SCALE_SMOOTH));
			lblNewLabel.setIcon(icono);
			lblNewLabel_1.setText(c.getNombre());
			lblNewLabel_2.setText("Fecha de fundacion: " + c.getFecha_Fundacion());
			lblNewLabel_3.setText("Propietario: " + c.getPropietario());
			lblNewLabel_3_1.setText("Sedes: " + c.getSedes());
			lblNewLabel_3_2.setText("Patrimonio: " + c.getPatrimonio());
			lblNewLabel_3_3.setVisible(false);
			lblNewLabel_3_4.setVisible(false);
			lblNewLabel_3_5.setVisible(false);
			lblNewLabel_3_6.setVisible(false);
			textPane.setText(Reseñas);
			textPane.setText(Criticas);
		}
		*/
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(100)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_5, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_6, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
					.addGap(113)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(484)
							.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(517))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnNewButton_1)
								.addContainerGap())
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 448, Short.MAX_VALUE)
									.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addGap(402))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtT, Alignment.LEADING)
										.addComponent(txtEscribeTuResea, Alignment.LEADING))
									.addContainerGap())))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_5))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(20)
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_3_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3_5, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtEscribeTuResea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_3_6, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addGap(43)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(14)
									.addComponent(btnNewButton_1)))))
					.addContainerGap(442, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
