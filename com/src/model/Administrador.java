/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author rodri
 */
public class Administrador extends Usuario{

    public Administrador(int usuario_id, String nombreUsuario, String nombreCOmpleto, int rol, String contraseña) {
        super(nombreUsuario, nombreCOmpleto, rol, contraseña);
    }
   
}
