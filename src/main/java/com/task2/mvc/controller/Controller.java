package com.task2.mvc.controller;

import com.task2.mvc.model.Model;
import com.task2.mvc.view.View;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    public void runProgram(){
        Scanner scanner = new Scanner(System.in);
        ValidateInput validateInput = new ValidateInput(scanner,view,model);
        validateInput.validateInputData();
    }
}
