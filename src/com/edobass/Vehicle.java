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

    public Vehicle(String name, String size) {

        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at" + currentDirection + "degress");
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle move(): Moving at " + currentVelocity + "in direction " + currentDirection);
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

    public void stop(){
        this.currentVelocity =0;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

