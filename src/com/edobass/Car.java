package com.edobass;

public class Car extends Vehicle{

    private int wheels; //ruedas
    private int doors; //puertas
    private int gears; //engranajes
    private boolean isManual; //transmision

    private int currentGear; //cambios

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) { //constructor
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) { //metodo para el cambio de velocidad
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to "+ this.currentGear + " gear");
    }

    public void changeVelocity(int speed, int direction){ //metodo para velocidad
        move(speed,direction);
        System.out.println("Car.changeVelocity(): Velocity "+speed+" direcction "+direction);
    }

}
