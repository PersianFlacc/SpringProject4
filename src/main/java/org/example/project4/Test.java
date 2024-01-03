package org.example.project4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        //Dog myDog = context.getBean("dogBean", Dog.class);
        //myDog.say();

        context.close();
    }
}
