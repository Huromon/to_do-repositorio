package org.example;

import java.util.Arrays;

public class Tarea {
    String nombre;
    String descripcion;
    String estado ;

    Tarea( String nombre, String descripcion ,String estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        comprobar_estado(estado);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {

            this.estado = estado;


    }
    public void comprobar_estado(String estado){
        if(estado.equalsIgnoreCase("Completado") ||estado.equalsIgnoreCase("Completada")){
            this.estado = "Completada";
        }
        else {
            this.estado = "Pendiente";
        }
    }


    @Override
    public String toString() {
        return getNombre() + " " + getDescripcion() + " " + getEstado();
    }

}
