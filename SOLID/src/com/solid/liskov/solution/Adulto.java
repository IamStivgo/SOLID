package com.solid.liskov.solution;

public class Adulto extends Persona implements IAccionesAdulto{
    private String dni;
    private String tarjeta;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Adulto(String nombre, String apellidos, String dni, String tarjeta) {
        super(nombre, apellidos);
        this.dni = dni;
        this.tarjeta = tarjeta;
    }

    @Override
    public void pagar() {
        System.out.println("mi dni es "+ getDni()+ " pago con la tarjeta " + tarjeta);
    }
}
