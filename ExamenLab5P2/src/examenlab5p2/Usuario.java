/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2;

import java.util.Date;
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
    protected JFrame mensaje;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contrasena, Date fechaNacimineto, String sexo, String departamento, String numeroIdentidad, JFrame mensaje) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.fechaNacimineto = fechaNacimineto;
        this.sexo = sexo;
        this.departamento = departamento;
        this.numeroIdentidad = numeroIdentidad;
        this.mensaje = mensaje;
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
            JOptionPane.showMessageDialog(mensaje, "Ese departamento no esta disponible.");
        }

    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        if (departamento.equalsIgnoreCase("Francisco Morazan")) {
            numeroIdentidad += "01";
        } else if (departamento.equalsIgnoreCase("Cortes")) {
            numeroIdentidad += "02";
        } else if (departamento.equalsIgnoreCase("Comayagua")) {
            numeroIdentidad += "03";
        }
        this.numeroIdentidad = numeroIdentidad;
    }

    public JFrame getMensaje() {
        return mensaje;
    }

    public void setMensaje(JFrame mensaje) {
        this.mensaje = mensaje;
    }

}
