package org.fasttrackIT.won14.homework8.ex23;

import java.time.LocalDate;

public class Employee implements Person {
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String address;
    private LocalDate dateOfEmployment;
    private String position;

    public Employee(String firstName, String lastName, String birthday, String address, String dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = LocalDate.parse(birthday);
        this.address = address;
        this.dateOfEmployment = LocalDate.parse(dateOfEmployment);
        this.position = position;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        Integer age;
        if (LocalDate.now().getMonthValue() > birthday.getMonthValue()) {
            age = LocalDate.now().getYear() - birthday.getYear();
        } else {
            if ((LocalDate.now().getMonthValue() == birthday.getMonthValue()) && (LocalDate.now().getDayOfMonth() >= birthday.getDayOfMonth())) {
                age = LocalDate.now().getYear() - birthday.getYear();
            } else {
                age = LocalDate.now().getYear() - birthday.getYear() - 1;
            }

        }
        return age;

    }
}
