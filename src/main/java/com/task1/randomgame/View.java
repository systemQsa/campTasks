package com.task1.randomgame;

import java.util.Arrays;

public class View {
    private final String PRINT_INPUT = "Please enter some number between ";
    private final String WRONG_INPUT_INFO = "Wrong number. Try again...";
    private final String WIN = "Congrats!!!";

    public String getPRINT_INPUT() {
        return PRINT_INPUT;
    }

    public String getWRONG_INPUT_INFO() {
        return WRONG_INPUT_INFO;
    }

    public String getWIN() {
        return WIN;
    }

    public void printProgramFlow(String message, int[]fails){
        System.out.println(message + Arrays.toString(fails));
    }

    public void  printInfo(String info){
        System.out.println(info);
    }
}
