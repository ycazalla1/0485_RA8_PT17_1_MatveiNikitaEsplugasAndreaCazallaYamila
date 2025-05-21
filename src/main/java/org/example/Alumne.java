package org.example;

import javax.persistence.*;

/**
 * Classe Alumne per gestionar la informació dels alumnes
 *
 * @author Yamila, Nikita i Andrea
 */
@Entity
public class Alumne {

    // Declaració d'atributs
    @Id
    private String dni;
    private String nom;
    private String cognom;

    /**
     * Constructor buït pel JPA
     */
    public Alumne(){}

    /**
     * Constructor de la classe
     *
     * @param DNI dni del alumne
     * @param nom nom de l'alumne
     * @param cognom cognom de l'alumne
     */
    public Alumne(String DNI, String nom, String cognom) {
        this.dni = DNI;
        this.nom = nom;
        this.cognom = cognom;
    }

    /**
     * Mètode per obtenir el dni de l'alumne
     *
     * @return DNI de l'alumne
     */
    public String getDni() {
        return dni;
    }

    /**
     * Mètode per establir el dni de l'alumne
     *
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Mètode per obtenir el nom de l'alumne
     *
     * @return nom de l'alumne
     */
    public String getNom() {
        return nom;
    }

    /**
     * Mètode per establir el nom de l'alumne
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Mètode per obtenir el cognom de l'alumne
     *
     * @return cognom de l'alumne
     */
    public String getCognom() {
        return cognom;
    }

    /**
     * Mètode per establir el cognom de l'alumne
     *
     * @param cognom
     */
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    /**
     * Mètode toString per mostrar la informació de l'alumne
     *
     * @return String amb la informació de l'alumne
     */
    @Override
    public String toString() {
        return "Alumne = " +
                "DNI: '" + dni + "'" +
                ", Nom:" + nom +
                ", Cognom:" + cognom +
                '}';
    }
}