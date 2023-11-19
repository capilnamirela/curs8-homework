package org.fasttrackIT.won14.homework8.ex1;

public class Main {
    public static void main(String[] args) {
        Fridge myFridge = new Fridge(1000, "frigider", "cu doua usi", 10,"no frost", 60, 50, 180, 55, 4);

        System.out.println("pretul este: " + myFridge.getPrice()+" lei");
        System.out.println("produsul disponibil: " + myFridge.getName() + " " + myFridge.getDescription() + " " + myFridge.getType() + " stoc: " + myFridge.getQuantity() + " buc");
        System.out.println("dimensiuni " + myFridge.getLength() + " cm lungime " + myFridge.getWidth() + " cm latime " + myFridge.getHeight() + " cm inaltime " + myFridge.getWeight() + " kg greutate");
        System.out.println("tempertura recomandata: " + myFridge.getTemperature() + " grade");

        Cosmetics myLipstick = new Cosmetics(50, "gloss", "cu sclipici", 5, "rosu", 5);
        System.out.println("produsul: " + myLipstick.getName() + ", pretul " + myLipstick.getPrice() + "lei, caracteristici: " + myLipstick.getDescription() + ", cantitatea in stoc: " + myLipstick.getQuantity() +" buc, culoarea: " + myLipstick.getColor() + ", cantitatea continuta: " + myLipstick.getWeight() + "g");


    }
}
