/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inso.LOG;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author rodri
 */
@Entity
public class Critica {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int idCritica;
    String tituloCritica;
    String textoCritica;

    public Critica(int idCritica, String tituloCritica, String textoCritica) {
        this.idCritica = idCritica;
        this.tituloCritica = tituloCritica;
        this.textoCritica = textoCritica;
    }

    public int getIdCritica() {
        return idCritica;
    }

    public void setIdCritica(int idCritica) {
        this.idCritica = idCritica;
    }

    public String getTituloCritica() {
        return tituloCritica;
    }

    public void setTituloCritica(String tituloCritica) {
        this.tituloCritica = tituloCritica;
    }

    public String getTextoCritica() {
        return textoCritica;
    }

    public void setTextoCritica(String textoCritica) {
        this.textoCritica = textoCritica;
    }
    
}
