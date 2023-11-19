package org.fasttrackIT.won14.homework8.ex23;

public class Programmer extends Employee {
    private String language;
    private static final String position = "programmer";


    public Programmer(String firstName, String lastName, String birthday, String address, String dateOfEmployment, String language) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return position;
    }
}
