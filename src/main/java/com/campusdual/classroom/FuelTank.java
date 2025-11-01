package com.campusdual.classroom;

public class FuelTank {
    private int actualFuel = 10;

    public void setActualFuel(int actualFuel) {
        if (actualFuel >=0){
            this.actualFuel = actualFuel;
            System.out.println("Capacidad actual: " + this.actualFuel + "litros");
        }else {
            System.out.println("Error: la capacidad del combustible no puede ser menor que 0");
        }

    }

    public void showDetails() {
        System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
    }

    public int getActualFuel() {
        return this.actualFuel;
    }
}
