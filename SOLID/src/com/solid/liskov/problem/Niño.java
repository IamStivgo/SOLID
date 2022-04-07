package com.solid.liskov.problem;

public class Niño extends Persona {
    public Niño (String nombre, String apellidos){
        super(null, nombre, apellidos, null);
    }

    @Override
    public void pagar(){
        throw new RuntimeException("Un niño no puede pagar");
    }
}
