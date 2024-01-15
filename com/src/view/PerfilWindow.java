package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*
* @author Francisco Carrera Martínez
*/
public class PerfilWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtLista;
	private JTextField txtPelicula;
	private JButton btnAadir;
	private JLabel lblMisListas;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_31;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_33;
	private JLabel lblNewLabel_34;
	private JButton btnNewButton_1;

	/**
	 * Create the frame.
	 */
	public PerfilWindow(/*Usuario u*/) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("TopFilms");

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Hola Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		JButton btnNewButton = new JButton("Actualizar info");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if (textField_2.getText != "") {
					u.setNombre;
				}
				if (textField_1.getText != "") {
					u.setApellidos(textField_1.getText);
				}
				if (textField.getText != "") {
					u.setNombre_Usuario(textField.getText);
				}
				String contraseña = new String(passwordField.getPassword());
				if (contraseña != "") {
					u.setContraseña(textField_1.getText);
				}
				*/
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setToolTipText("Actualizar info");
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				String contraseña = new String(passwordField.getPassword());
				if (contraseña.equals("Contraseña") && passwordField.getForeground().equals(Color.gray)) {
					passwordField.setText("");
					passwordField.setForeground(Color.black);
					passwordField.setEchoChar('*');
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				String contraseña = new String(passwordField.getPassword());
				if (contraseña.equals("")) {
					passwordField.setEchoChar((char) 0);
					passwordField.setText("Contraseña");
					passwordField.setForeground(Color.gray);
				}
			}
		});
		passwordField.setToolTipText("Contraseña");
		passwordField.setText("Contraseña");
		passwordField.setForeground(Color.GRAY);
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setColumns(10);
        passwordField.setEchoChar(' ');
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField.getText().equals("Nombre de usuario") && textField.getForeground().equals(Color.gray)) {
					textField.setText("");
					textField.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textField.getText().equals("")) {
					textField.setText("Nombre de usuario");
					textField.setForeground(Color.gray);
				}
			}
		});
        textField.setToolTipText("Nombre de usuario");
		textField.setText("Nombre de usuario");
		textField.setForeground(Color.GRAY);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField_1.getText().equals("Apellidos") && textField_1.getForeground().equals(Color.gray)) {
					textField_1.setText("");
					textField_1.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textField_1.getText().equals("")) {
					textField_1.setText("Apellidos");
					textField_1.setForeground(Color.gray);
				}
			}
		});
		textField_1.setToolTipText("Apellidos");
		textField_1.setText("Apellidos");
		textField_1.setForeground(Color.GRAY);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (textField_2.getText().equals("Nombre") && textField_2.getForeground().equals(Color.gray)) {
					textField_2.setText("");
					textField_2.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (textField_2.getText().equals("")) {
					textField_2.setText("Nombre");
					textField_2.setForeground(Color.gray);
				}
			}
		});
		textField_2.setToolTipText("Nombre");
		textField_2.setText("Nombre");
		textField_2.setForeground(Color.GRAY);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		
		JLabel lblTuInfo = new JLabel("Tu info");
		lblTuInfo.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		txtLista = new JTextField();
		txtLista.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtLista.getText().equals("Lista") && txtLista.getForeground().equals(Color.gray)) {
					txtLista.setText("");
					txtLista.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtLista.getText().equals("")) {
					txtLista.setText("Lista");
					txtLista.setForeground(Color.gray);
				}
			}
		});
		txtLista.setToolTipText("Lista");
		txtLista.setText("Lista");
		txtLista.setForeground(Color.GRAY);
		txtLista.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLista.setColumns(10);
		
		txtPelicula = new JTextField();
		txtPelicula.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtPelicula.getText().equals("Contenido") && txtPelicula.getForeground().equals(Color.gray)) {
					txtPelicula.setText("");
					txtPelicula.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtPelicula.getText().equals("")) {
					txtPelicula.setText("Contenido");
					txtPelicula.setForeground(Color.gray);
				}
			}
		});
		txtPelicula.setToolTipText("Contenido");
		txtPelicula.setText("Contenido");
		txtPelicula.setForeground(Color.GRAY);
		txtPelicula.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPelicula.setColumns(10);
		
		btnAadir = new JButton("Añadir");
		btnAadir.setToolTipText("Añadir");
		btnAadir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblMisListas = new JLabel("Mis listas");
		lblMisListas.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_22 = new JLabel("New label");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_23 = new JLabel("New label");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_25 = new JLabel("New label");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_26 = new JLabel("New label");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_27 = new JLabel("New label");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_28 = new JLabel("New label");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_29 = new JLabel("New label");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_30 = new JLabel("New label");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_31 = new JLabel("New label");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_32 = new JLabel("New label");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_33 = new JLabel("New label");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		lblNewLabel_34 = new JLabel("New label");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(110)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTuInfo, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnNewButton)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnAadir, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
										.addGap(179))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel)
										.addGap(427)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblMisListas, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(txtLista, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblNewLabel_1)
													.addComponent(lblNewLabel_5)
													.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))
												.addGap(105)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_21, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_22, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_23, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_24, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
													.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE))))
										.addGap(80)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblNewLabel_25, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_26, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_27, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_28, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_29, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_30, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_31, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_32, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_33, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_34, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtPelicula, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))))))
					.addContainerGap(161, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(144)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
							.addComponent(lblTuInfo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(18))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMisListas, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_25, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_26, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_27, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_28, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_29, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_30, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_31, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_32, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_33, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_34, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_16, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_21, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_22, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_23, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(lblNewLabel_24, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtLista, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAadir, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1))
					.addGap(171))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(581, Short.MAX_VALUE)
					.addComponent(txtPelicula, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(222))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
