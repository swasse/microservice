package be.ehb.microservice.controllers;

import be.ehb.microservice.model.Contact;
import be.ehb.microservice.model.ContactDAO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.TreeSet;

@Controller()
@RequestMapping(value = "/contact")
public class ContactController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public TreeSet<Contact> findAll(){
        return ContactDAO.getContacts();
    }

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Contact findByName(@PathVariable(value = "name") String name){
        return ContactDAO.findByName(name);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity addContact(@RequestParam(value = "name") String name,
                                     @RequestParam(value = "nr") String nr){
        Contact nContact = new Contact(name, nr);
        ContactDAO.addContact(nContact);

        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity removeContact(@RequestParam(value = "name") String name){
        ContactDAO.removeByName(name);

        return new ResponseEntity(HttpStatus.OK);
    }


}












