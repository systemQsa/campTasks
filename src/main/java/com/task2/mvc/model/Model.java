package com.task2.mvc.model;

public class Model {

    private String firstName;
    private String lastName;
    private String login;

    public String getFirstName() {
        return firstName;
    }

    public Model setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Model setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public Model setLogin(String login) {
        this.login = login;
        return this;
    }
}
