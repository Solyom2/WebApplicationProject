package hu.iit.me.model;

import hu.iit.me.exceptions.EmptyFieldException;
import hu.iit.me.exceptions.InvalidAgeException;
import hu.iit.me.exceptions.InvalidIdException;
import hu.iit.me.exceptions.InvalidPhoneNumberException;

public class Applicant {

    private int id;
    private String name;
    private int age;
    private String address;
    private Degree degree;
    private String phoneNumber;

    public Applicant() {}

    public Applicant(int id, String name, int age, String address, Degree degree, String phoneNumber) throws InvalidIdException, InvalidAgeException, InvalidPhoneNumberException, EmptyFieldException{
        testId(id);
        testEmptyField(name);
        testEmptyField(address);
        testAge(age);
        testPhoneNumber(phoneNumber);

        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.degree = degree;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void testId(int id) throws InvalidIdException {
        if(id <= 0)
            throw new InvalidIdException("Nem megfelelő ID");
    }

    public void testAge(int age) throws InvalidAgeException {
        if(age <= 16 || age > 65)
            throw new InvalidAgeException("Nem megfelelő életkor");
    }

    public void testEmptyField(String field) throws EmptyFieldException {
        if(field.length() == 0)
            throw new EmptyFieldException("Üres mező");
    }

    public void testPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if(phoneNumber.length() != 11 && !phoneNumber.matches("[0-9]+"))
            throw new InvalidPhoneNumberException("Érvénytelen telefonszám");
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", degree='" + degree + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
