package org.example;

//import javax.persistence.*;

//@Entity
public class Alumne {
    // @Id
    private String DNI;
    private String nom;
    private String cognom;

    public Alumne(String DNI, String nom, String cognom) {
        this.DNI = DNI;
        this.nom = nom;
        this.cognom = cognom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    @Override
    public String toString() {
        return "Alumne{" +
                "DNI='" + DNI  +
                ", nom='" + nom +
                ", cognom='" + cognom +
                '}';
    }

}
