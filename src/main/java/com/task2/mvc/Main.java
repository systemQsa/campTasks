package com.task2.mvc;

import com.task2.mvc.controller.Controller;
import com.task2.mvc.model.Model;
import com.task2.mvc.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.runProgram();
    }
}
