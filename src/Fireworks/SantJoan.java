/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fireworks;

import java.util.Date;

/**
 *
 * @author BERNAT
 */
public class SantJoan {
    
    private Date dia;
    private String nom;
    private int random;

    public SantJoan(Date dia, String nom, int random) {
        this.dia = dia;
        this.nom = nom;
        this.random = random;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }
    
    
}
