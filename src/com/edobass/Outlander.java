package com.edobass;

public class Outlander extends Car { // hereda atributos de Car
    private int roudServiceMonths; //meses de servicio

    public Outlander(int roudServiceMonths) { //constructor con 1 solo parametro
        super("Outlander","4WD", 5, 5, 6, false); //inicializa variables
        this.roudServiceMonths = roudServiceMonths;
    }

    public void accelarate (int rate){  //metodo para acelar

        int newVelocity = getCurrentVelocity() +rate; //suma la velocidad
        if(newVelocity==0){ //si es igual a 0 se detiene y queda en velocidad 1
            stop();
            changeGear(1);
        }else if(newVelocity>0 && newVelocity<=10){
            changeGear(1); //velocidad 1
        }else if(newVelocity>10 && newVelocity<=20) {
            changeGear(2); //velocidad 2
        }else if(newVelocity>20 && newVelocity<=30){
            changeGear(3); //velocidad 3
        } else{
            changeGear(4); //velocidad 4
        }

        if(newVelocity>0){ //si es mayor a 0 la velocidad
            changeVelocity(newVelocity,getCurrentDirection()); //llamo al metodo changeVelocity
        }
        }
    }

