package com.mycompany.inso.IU;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*
* @author Francisco Carrera Martínez
*/
public class InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombreDeUsuario;
	private JPasswordField txtContrasea;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;

	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("TopFilms");

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		txtNombreDeUsuario = new JTextField();
		txtNombreDeUsuario.setText("Nombre de usuario");
		txtNombreDeUsuario.setForeground(Color.gray);
		txtNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
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
		txtNombreDeUsuario.setToolTipText("Nombre de usuario");
		txtNombreDeUsuario.setColumns(10);
		
		txtContrasea = new JPasswordField();
		txtContrasea.setText("Contraseña");
		txtContrasea.setForeground(Color.gray);
		txtContrasea.setToolTipText("Contraseña");
		txtContrasea.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtContrasea.setEchoChar((char) 0);
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
		txtContrasea.setColumns(10);
		
		JButton btnNewButton = new JButton("Iniciar sesión");
		btnNewButton.setToolTipText("Iniciar sesión");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNombreDeUsuario.getForeground() == Color.gray || txtContrasea.getForeground() == Color.gray) {
					JOptionPane.showMessageDialog(null, "Rellena los campos 'Nombre de usuario' y 'Contraseña'.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				//Usuario u = new Usuario();
				//if (u.iniciarSesion(txtNombreDeUsuario.getText(), txtContrasea.getText())) {
					//String contraseña = new String(txtContrasea.getPassword());
					//Usuario u = new Usuario();
					Inicio i = new Inicio(/*u.getUser(txtNombreDeUsuario.getText(), contraseña)*/);
					i.setVisible(true);
					setVisible(false);
				//}
			}
		});
		
		btnNewButton_1 = new JButton("¿No tienes cuenta? Regístrate");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registro r = new Registro();
				r.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setToolTipText("Regístrate");
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 12));
		btnNewButton_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		ImageIcon icono = new ImageIcon("src/main/java/img/ico.jpg");
		icono.setImage(icono.getImage().getScaledInstance(400, 400, java.awt.Image.SCALE_SMOOTH));
		lblNewLabel_1 = new JLabel(icono);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(282)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtContrasea, Alignment.TRAILING, 256, 256, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(txtNombreDeUsuario, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
							.addComponent(lblNewLabel, Alignment.LEADING)))
					.addContainerGap(992, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(313)
					.addComponent(btnNewButton_1)
					.addContainerGap(1027, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(1054, Short.MAX_VALUE)
					.addComponent(lblNewLabel_1)
					.addGap(300))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(249)
					.addComponent(lblNewLabel)
					.addGap(27)
					.addComponent(txtNombreDeUsuario, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(txtContrasea, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addGap(338))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(180)
					.addComponent(lblNewLabel_1)
					.addContainerGap(480, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
