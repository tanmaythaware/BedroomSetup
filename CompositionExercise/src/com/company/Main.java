package com.company;

public class Main {

    public static void main(String[] args) {
	    Wall wall1 = new Wall("Higashi");
        Wall wall2 = new Wall("Nishi");
        Wall wall3 = new Wall("Kita");
        Wall wall4 = new Wall("Minami");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Modern",4,3,2,1);
        Lamp lamp = new Lamp("Classic",false,75);
        Bedroom bedroom = new Bedroom("T2",wall1,wall2,wall3,wall4,bed,ceiling,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
