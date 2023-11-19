package org.fasttrackIT.won14.homework8;

public class Algorithms2 {
    public static void main(String[] args) {
        Integer[] myArray = {3, -1, -1, -1, 2, 3, -1, 3, -1, 2, 4, 9, 3, 4, 4, 4, 4, 4};

        int frequency = 0;
        int nrMax = 0;

        for (int i = 0; i < myArray.length; i++) {
            int ifrequency = 1;
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    ifrequency++;
                }
                if (ifrequency > frequency) {
                    frequency = ifrequency;
                    nrMax = myArray[i];
                }
            }


        }
        System.out.println("nr: " + nrMax+ " apare de " + frequency + " ori");
    }
}
