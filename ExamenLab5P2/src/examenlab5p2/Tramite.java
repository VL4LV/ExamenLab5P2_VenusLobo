/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Tramite {

    protected String nombreTramite;
    protected String descripcion;
    protected Date fechaSolicitud;
    protected String idSolicitud;

    public Tramite() {
    }

    public Tramite(String nombreTramite, String descripcion, Date fechaSolicitud, String idSolicitud) {
        this.nombreTramite = nombreTramite;
        this.descripcion = descripcion;
        this.fechaSolicitud = fechaSolicitud;
        this.idSolicitud = idSolicitud;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(String idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

}
