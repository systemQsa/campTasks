package com.task2.mvc.controller;

public interface Validation {
    String INPUT_DATA_ENG = "^[a-zA-Z]+$";
    String INPUT_DATA_UKR = "^[А-ЯЩІЇЄЬ][а-яіїєщь]+$";
    String INPUT_LOGIN = "[a-zA-z0-9]+";
}
