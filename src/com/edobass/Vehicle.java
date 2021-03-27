package com.edobass;

/*
// Desafío.
         // Comience con una clase base de Vehículo, luego cree una clase Coche que herede de esta clase base.
         // Finalmente, cree otra clase, un tipo específico de Coche que herede de la clase Coche.
         // Debería poder conducir con la mano, cambiar de marcha y moverse (velocidad en otras palabras).
         // Deberá decidir dónde colocar el estado y los comportamientos apropiados (campos y métodos).
         // Como se mencionó anteriormente, se deben incluir cambios de marcha, aumento / disminución de velocidad.
         // Para su tipo específico de vehículo, querrá agregar algo específico para ese tipo de automóvil.
You should be able to hand steering, changing gears, and moving (speed in other words).
 */

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) { //constructor de Vehicle

        this.name = name;
        this.size = size;

        this.currentDirection = 0; //inicializamos en 0 por lo que no se pasan como parametro en el constructor
        this.currentVelocity = 0;
    }

    public void steer(int direction) { //metodo direccion
        this.currentDirection += direction; //this para referencia la variable currentDirecction e ir sumando con el parametro direccion
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degress"); //imprimo el resultado
    }

    public void move(int velocity, int direction) { //metodo mover
        currentVelocity = velocity; // se asigna valores a variables currentVelocity y currentDirection
        currentDirection = direction;
        System.out.println("Vehicle move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void stop(){ // metodo stop
        this.currentVelocity =0; //velocidad se pone en 0
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

