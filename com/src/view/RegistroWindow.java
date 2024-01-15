package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*
* @author Francisco Carrera Martínez
*/
public class RegistroWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtNombreDeUsuario;
	private JPasswordField txtContrasea;
	private JTextField txtMedio;
	private JButton btnNewButton_1;

	/**
	 * Create the frame.
	 */
	public RegistroWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("TopFilms");

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Regístrate");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setToolTipText("Regístrate");
		
		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtNombre.getText().equals("Nombre") && txtNombre.getForeground().equals(Color.gray)) {
                    txtNombre.setText("");
                    txtNombre.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtNombre.getText().equals("")) {
					txtNombre.setText("Nombre");
					txtNombre.setForeground(Color.gray);
				}
			}
		});
		txtNombre.setForeground(new Color(128, 128, 128));
		txtNombre.setToolTipText("Nombre");
		txtNombre.setText("Nombre");
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtApellidos.getText().equals("Apellidos") && txtApellidos.getForeground().equals(Color.gray)) {
                    txtApellidos.setText("");
                    txtApellidos.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtApellidos.getText().equals("")) {
					txtApellidos.setText("Apellidos");
					txtApellidos.setForeground(Color.gray);
				}
			}
		});
		txtApellidos.setForeground(new Color(128, 128, 128));
		txtApellidos.setToolTipText("Apellidos");
		txtApellidos.setText("Apellidos");
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtApellidos.setColumns(10);
		
		txtNombreDeUsuario = new JTextField();
		txtNombreDeUsuario.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtNombreDeUsuario.getText().equals("Nombre de usuario") && txtNombreDeUsuario.getForeground().equals(Color.gray)) {
                    txtNombreDeUsuario.setText("");
                    txtNombreDeUsuario.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtNombreDeUsuario.getText().equals("")) {
					txtNombreDeUsuario.setText("Nombre de usuario");
					txtNombreDeUsuario.setForeground(Color.gray);
				}
			}
		});
		txtNombreDeUsuario.setForeground(new Color(128, 128, 128));
		txtNombreDeUsuario.setToolTipText("Nombre de usuario");
		txtNombreDeUsuario.setText("Nombre de usuario");
		txtNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNombreDeUsuario.setColumns(10);
		
		txtContrasea = new JPasswordField();
		txtContrasea.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				String contraseña = new String(txtContrasea.getPassword());
				if (contraseña.equals("Contraseña") && txtContrasea.getForeground().equals(Color.gray)) {
                    txtContrasea.setText("");
                    txtContrasea.setForeground(Color.black);
                    txtContrasea.setEchoChar('*');
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				String contraseña = new String(txtContrasea.getPassword());
				if (contraseña.equals("")) {
					txtContrasea.setEchoChar((char) 0);
					txtContrasea.setText("Contraseña");
					txtContrasea.setForeground(Color.gray);
				}
			}
		});
		txtContrasea.setForeground(new Color(128, 128, 128));
		txtContrasea.setToolTipText("Contraseña");
		txtContrasea.setText("Contraseña");
		txtContrasea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtContrasea.setColumns(10);
		txtContrasea.setEchoChar((char) 0);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("Crítico".equals((String) comboBox.getSelectedItem())) {
					txtMedio.setEditable(true);
				}
			}
		});
		comboBox.addItem("Usuario");
        comboBox.addItem("Crítico");
		comboBox.setMaximumRowCount(2);
		
		txtMedio = new JTextField();
		txtMedio.setEditable(false);
		txtMedio.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtMedio.getText().equals("Medio") && txtMedio.getForeground().equals(Color.gray)) {
                    txtMedio.setText("");
                    txtMedio.setForeground(Color.black);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (txtMedio.getText().equals("")) {
					txtMedio.setText("Medio");
					txtMedio.setForeground(Color.gray);
				}
			}
		});
		txtMedio.setForeground(new Color(128, 128, 128));
		txtMedio.setToolTipText("Medio");
		txtMedio.setText("Medio");
		txtMedio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMedio.setColumns(10);
		
		JButton btnNewButton = new JButton("Registrarme");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNombre.getForeground() == Color.gray || txtApellidos.getForeground() == Color.gray || txtNombreDeUsuario.getForeground() == Color.gray || txtContrasea.getForeground() == Color.gray) {
					JOptionPane.showMessageDialog(null, "Rellena todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
				} else if ("Crítico".equals((String) comboBox.getSelectedItem()) && txtMedio.getForeground() == Color.gray) {
					JOptionPane.showMessageDialog(null, "Rellena el campo 'Medio' con el nombre del medio para el que trabajas.", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					if ("Crítico".equals((String) comboBox.getSelectedItem())) {
						//Critico c = new Critico();
						//if(c.registrarse(txtNombre.getText(), txtApellidos.getText(), txtNombreDeUsuario.getText(), txtContrasea.getText())) {
							//c.medio = txtMedio.getText();
							//Añadir a lista de Críticos
							JOptionPane.showMessageDialog(null, "Te has registrado correctamente.", "Info", JOptionPane.INFORMATION_MESSAGE);
							InicioSesionWindow s = new InicioSesionWindow();
							s.setVisible(true);
							setVisible(false);
						//} else {
							//JOptionPane.showMessageDialog(null, "El nombre de usuario que has elegido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
						//}
					} else {
						//Usuario u = new Usuario();
						//if(u.registrarse(txtNombre.getText(), txtApellidos.getText(), txtNombreDeUsuario.getText(), txtContrasea.getText())) {
							//Añadir a lista de Usuarios
							JOptionPane.showMessageDialog(null, "Te has registrado correctamente.", "Info", JOptionPane.INFORMATION_MESSAGE);
							InicioSesionWindow s = new InicioSesionWindow();
							s.setVisible(true);
							setVisible(false);
						//} else {
							//JOptionPane.showMessageDialog(null, "El nombre de usuario que has elegido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
						//}
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setToolTipText("Registrarme");
		
		btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioSesionWindow s = new InicioSesionWindow();
				s.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setToolTipText("Atrás");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(550, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
									.addGap(40)
									.addComponent(txtMedio, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtContrasea, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNombreDeUsuario, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))))
					.addGap(580))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(141)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtApellidos, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtNombreDeUsuario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtContrasea, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMedio, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
					.addContainerGap(322, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
