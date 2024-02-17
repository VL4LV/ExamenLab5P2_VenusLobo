/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2;

import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Usuario {

    protected String nombre;
    protected String apellido;
    protected String contrasena;
    protected Date fechaNacimineto;
    protected String sexo;
    protected String departamento;
    protected String numeroIdentidad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contrasena, Date fechaNacimineto, String sexo, String departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.fechaNacimineto = fechaNacimineto;
        this.sexo = sexo;
        setDepartamento(departamento);
        setNumeroIdentidad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(Date fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {

        if (departamento.equalsIgnoreCase("Francisco Morazan") || departamento.equalsIgnoreCase("Cortes") || departamento.equalsIgnoreCase("Comayagua")) {
            this.departamento = departamento;
        } else {
            JOptionPane.showMessageDialog(null, "Ese departamento no esta disponible.");
        }

    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad() {
        Random r = new Random();
        String numeroIdentidad = "";
        if (departamento.equalsIgnoreCase("Francisco Morazan")) {
            numeroIdentidad += "01";
            int numFM = r.nextInt(28) + 1;
            if (numFM < 10) {
                numeroIdentidad += "0" + numFM;
            } else {
                numeroIdentidad += numFM;
            }
            numeroIdentidad += fechaNacimineto.getYear();

        } else if (departamento.equalsIgnoreCase("Cortes")) {
            numeroIdentidad += "02";
            int numC = r.nextInt(12) + 1;
            if (numC < 10) {
                numeroIdentidad += "0" + numC;
            } else {
                numeroIdentidad += numC;
            }
            numeroIdentidad += fechaNacimineto.getYear();

        } else if (departamento.equalsIgnoreCase("Comayagua")) {
            numeroIdentidad += "03";
            int numCo = r.nextInt(21) + 1;
            if (numCo < 10) {
                numeroIdentidad += "0" + numCo;
            } else {
                numeroIdentidad += numCo;
            }
            numeroIdentidad += fechaNacimineto.getYear();
        }

        int numAleatorio = r.nextInt(9) + 1;
        String cadena = "";
        for (int i = 0; i < 5; i++) {
            cadena += numAleatorio;
        }
        numeroIdentidad += cadena;
        this.numeroIdentidad = numeroIdentidad;
    }

    @Override
    public String toString() {
        return "numeroIdentidad=" + numeroIdentidad + '}';

    }
}
