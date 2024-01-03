package org.example.project4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    //@Autowired
    //@Qualifier("catBean")
    private Pet pet;

    public Person() {
        System.out.println("Person bean is created");
    }

    @Autowired
    public Person(@Qualifier("dogBean") Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    @Autowired
//    @Qualifier("dogBean")
//    public void setPet(Pet pet) {
//        System.out.println("Class Person: set pet");
//        this.pet = pet;
//    }

    public void callYourPet() {
        System.out.println("Hello, My lovely Pet!");
        pet.say();
    }
}
