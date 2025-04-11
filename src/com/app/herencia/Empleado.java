package com.app.herencia;

public class Empleado extends Persona{
    private long idEmpleado;
    private double sueldo;
    private static int contadorEmpleado = 0;

    public Empleado(String nombre, String apellido, int edad, double sueldo){
        super(nombre, apellido, edad);
        this.idEmpleado = ++contadorEmpleado;
        this.sueldo = sueldo;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString(){
        return """
            idPersona: %d
            Nombre: %s
            Apellido: %s
            Edad: %d
            idEmpleado: %d
            Sueldo: %.2f
            """.formatted(
                getIdPersona(),
                getNombre(),
                getApellido(),
                getEdad(),
                getIdEmpleado(),
                getSueldo()
            );
    }
}
