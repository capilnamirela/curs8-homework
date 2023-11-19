package org.fasttrackIT.won14.homework8.ex23;

public class Main {
    public static void main(String[] args) {
        Employee myEmployee = new Employee("Ana", "Popescu", "2000-12-31", "Brasov, Str. Verii", "2021-09-09", "marketing manager");
        System.out.println("Numele: " + myEmployee.getFirstName() + " " + myEmployee.getLastName());
        System.out.println("Data nasterii: " + myEmployee.getBirthday());
        System.out.println("Adresa: " + myEmployee.getAddress());
        System.out.println("Data angajarii: " + myEmployee.getDateOfEmployment() + " pozitia: " + myEmployee.getPosition());

        System.out.println("-------------------------------------------------");

        Programmer myProgrammer = new Programmer("Dan", "Georgescu", "1989-12-12", "Bucuresti", "2022-11-11", "Java");
        System.out.println("Numele: " + myProgrammer.getFirstName() + " " + myProgrammer.getLastName());
        System.out.println("Data nasterii: " + myProgrammer.getBirthday());
        System.out.println("Adresa: " + myProgrammer.getAddress());
        System.out.println("Data angajarii: " + myProgrammer.getDateOfEmployment() + " pozitia: " + myProgrammer.getPosition() + " " + myProgrammer.getLanguage());

        System.out.println("------------------------------------------------");

        DataBaseAdmin myAdmin = new DataBaseAdmin("Mihai", "Dumitru", "2000-11-19", "Craiova", "2023-10-10", "administrator", "SQL");
        System.out.println("Numele: " + myAdmin.getFirstName() + " " + myAdmin.getLastName());
        System.out.println("Data nasterii: " + myAdmin.getBirthday());
        System.out.println("Adresa: " + myAdmin.getAddress());
        System.out.println("Data angajarii: " + myAdmin.getDateOfEmployment() + " pozitia: " + myAdmin.getPosition() + " "+myAdmin.getDbTechnology());

        System.out.println("----------------------------------------------");
        System.out.println(myEmployee.getFirstName() + " " + myEmployee.getLastName() + " " + myEmployee.getAge() + " ani");
        System.out.println(myProgrammer.getFirstName() + " " + myProgrammer.getLastName() + " " + myProgrammer.getAge() + " ani");
        System.out.println(myAdmin.getFirstName() + " " + myAdmin.getLastName() + " " + myAdmin.getAge() + " ani");


    }


}
