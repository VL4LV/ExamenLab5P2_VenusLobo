/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Civil extends Usuario{
    
    private ArrayList<Tramite> tramite = new ArrayList();

    public Civil() {
    }

    public Civil(String nombre, String apellido, String contrasena, Date fechaNacimineto, String sexo, String departamento, String numeroIdentidad) {
        super(nombre, apellido, contrasena, fechaNacimineto, sexo, departamento, numeroIdentidad);
    }

    public ArrayList<Tramite> getTramite() {
        return tramite;
    }

    public void setTramite(ArrayList<Tramite> tramite) {
        this.tramite = tramite;
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
        this.departamento = departamento;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }
    
}
