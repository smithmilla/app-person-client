package com.app.herencia;

public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private int edad;
    private static int contadorPersonas = 0;


    public Persona (String nombre, String apellido, int edad)
    {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return """
                idPersona: %d
                Nombre: %s
                Apellido: %s
                Edad:  %d
                """.formatted(getIdPersona(), getNombre(), getApellido(), getEdad());
    }
}
