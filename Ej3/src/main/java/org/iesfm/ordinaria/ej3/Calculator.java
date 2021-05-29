package org.iesfm.ordinaria.ej3;

public class Calculator {

    public int maximum(int[] numbers) throws NotDoableException {
        if (numbers.length == 0) {
            throw new NotDoableException("Can't calculate maximum of empty list");
        }
        int currentMax = numbers[0];
        for (int num : numbers) {
            if (currentMax < num) {
                currentMax = num;
            }
        }

        return currentMax;
    }
}
