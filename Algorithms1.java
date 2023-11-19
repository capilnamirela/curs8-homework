package org.fasttrackIT.won14.homework8;

public class Algorithms1 {
    public static void main(String[] args) {
        String text = "abcdefabs";
        Integer textLength = text.length();
        String[] myArray = text.split("");

        String[] evenIndexes = new String[textLength];
        for (int i = 0; i < textLength; i++){
            if( (i % 2 )== 0) {
                evenIndexes[i] = myArray[i].toUpperCase();
            } else {
                evenIndexes[i] = myArray[i];
            }
        }

        String[] oddIndexes = new String[textLength];
        for (int i = 0; i < textLength; i++){
            if( (i % 2 )!= 0) {
                oddIndexes[i] = myArray[i].toUpperCase();
            } else {
                oddIndexes[i] = myArray[i];
            }
        }

        for (int i = 0; i < textLength; i++){
            System.out.print(evenIndexes[i]);
        }
        System.out.print(" , ");

        for (int i = 0; i < textLength; i++){
            System.out.print(oddIndexes[i]);
        }
    }

}
