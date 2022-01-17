package com.task1.randomgame;

import java.util.Random;

public class Model {
    private int[] array;
    private int bottomLine;
    private int upperBound;
    private int userInput;
    private Random randNumber;

    public int getUserInput() {
        return userInput;
    }

    public int getBottomLine() {
        return bottomLine;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public Model setUserInput(int userInput) {
        this.userInput = userInput;
        return this;
    }

    public int[] rand() {
        bottomLine = 0;
        upperBound = 100;
        int index = 0;
        int rand = randNumber.nextInt(upperBound - bottomLine) + bottomLine;
        if (userInput < rand) {
            upperBound = userInput;
            array[index++] = userInput;
            return new int[0];
        } else if (userInput > rand) {
            bottomLine = userInput;
            array[index++] = userInput;
            return new int[0];
        }

        return array;
    }

}
