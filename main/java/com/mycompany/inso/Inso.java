/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inso;
import com.mycompany.inso.IU.Principal;
import com.mycompany.inso.*;
import com.mycompany.inso.BD.ControladorBD;
import com.mycompany.inso.LOG.Director;

/**
 *
 * @author rodri
 */
public class Inso {

    public static void main(String[] args) {
        Principal prin = new Principal();
        prin.setVisible(true);
        ControladorBD control = new ControladorBD();
        control.guardarDirector(new Director("nombre", "fecha_Nacimiento", "sexo", "lugar_nacimiento", "nacionalidad", "premios", "nominaciones"));
    }
}
