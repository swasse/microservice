package be.ehb.microservice.model;

import java.util.TreeSet;

public class ContactDAO {

    private static final TreeSet<Contact> CONTACTS = new TreeSet<>();

    public static void addContact(Contact c){
        CONTACTS.add(c);
    }

    public static TreeSet<Contact> getContacts(){
        return CONTACTS;
    }

    public static Contact findByName(String name){
        for(Contact element : CONTACTS  ){
            if( element.getName().equalsIgnoreCase(name) ){
                return element;
            }
        }
        return null;
    }

    public static void removeByName(String name){
        Contact c = findByName(name);
        if(c != null ){
            CONTACTS.remove(c);
        }
    }

}
