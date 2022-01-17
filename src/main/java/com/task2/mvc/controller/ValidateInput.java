package com.task2.mvc.controller;

import com.task2.mvc.model.Model;
import com.task2.mvc.view.Constants;
import com.task2.mvc.view.View;

import java.util.Scanner;

public class ValidateInput {
    private View view;
    private Model model;
    private Scanner scanner;

    public ValidateInput(Scanner scanner, View view, Model model) {
        this.scanner = scanner;
        this.view = view;
        this.model = model;
    }

    public void validateInputData() {
        view.printResponse(Constants.INPUT_NAME);
        String name = scanner.nextLine();
        if (name.matches(Validation.INPUT_DATA_ENG) || name.matches(Validation.INPUT_DATA_UKR)) {
             model.setFirstName(name);
        }else {
            view.printResponse(Constants.WRONG_INPUT_NAME);
        }
        view.printResponse(Constants.INPUT_SURNAME);
        String surname = scanner.nextLine();
        if (surname.matches(Validation.INPUT_DATA_ENG) || surname.matches(Validation.INPUT_DATA_UKR)) {
            model.setLastName(surname);
        }else {
            view.printResponse(Constants.WRONG_INPUT_SURNAME);
        }
        view.printResponse(Constants.INPUT_LOGIN);
        String login = scanner.nextLine();
        if (login.matches(Validation.INPUT_LOGIN)){
            model.setLogin(login);
        }else {
            view.printResponse(Constants.WRONG_INPUT_LOGIN);
        }
    }
}
