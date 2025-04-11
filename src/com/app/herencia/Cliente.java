package com.app.herencia;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cliente extends Persona{

    private int idCliente;
    private LocalDate fechaRegistro;
    private static int contadorDeClientes = 0;

    public Cliente(String nombre, String apellido, int edad, LocalDate fechaRegistro){
        super(nombre, apellido, edad);
        this.idCliente = ++contadorDeClientes;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String toString(){
        return """
                idPersona: %d
                Nombre: %s
                Apellido: %s
                Edad: %d
                idCliente: %d
                Fecha registro: %s
                """.formatted(
                        getIdPersona(),
                        getNombre(),
                        getApellido(),
                        getEdad(),
                        getIdCliente(),
                        getFechaRegistro()
                                .format(
                                        DateTimeFormatter.ofPattern("dd/MM/yyyy")
                                )
        );
    }
}
