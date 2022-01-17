package com.task1.randomgame;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }



    public void getUserInput(){
        Scanner scan = new Scanner(System.in);
        model.setUserInput(beginProgram(scan));

        view.printProgramFlow(view.getWIN(), model.rand());
    }
    private int beginProgram(Scanner scanner){
        System.out.println(view.getPRINT_INPUT() + model.getBottomLine() + " " + model.getUpperBound());
        while (!scanner.hasNextInt()){
            System.out.println(view.getWRONG_INPUT_INFO());
            scanner.next();
        }
        return  scanner.nextInt();
    }
}
