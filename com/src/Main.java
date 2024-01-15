/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


import view.InicioSesionWindow;
import dao.DAO;
import model.Director;

/**
 *
 * @author rodri
 */
public class Main {

    public static void main(String[] args) {
    	InicioSesionWindow i = new InicioSesionWindow();
        i.setVisible(true);
        DAO control = new DAO();
        control.guardarDirector(new Director("nombre", "fecha_Nacimiento", "sexo", "lugar_nacimiento", "nacionalidad", "premios", "nominaciones"));
    }
}
