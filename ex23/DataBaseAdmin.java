package org.fasttrackIT.won14.homework8.ex23;

public class DataBaseAdmin extends Employee {
    String dbTechnology;

    public DataBaseAdmin(String firstName, String lastName, String birthday, String address, String dateOfEmployment, String position, String dbTechnology) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db.admin: " + super.getAddress();
    }

}
