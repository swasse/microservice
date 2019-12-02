package be.ehb.microservice.model;

public class Contact implements Comparable<Contact> {

    private String name, number;

    public Contact() {
    }

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int compareTo(Contact o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
