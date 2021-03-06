package com.freudromero.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {
    public static void main(String[] args) {
       try {

           // Create an object mapper
           ObjectMapper mapper = new ObjectMapper();

           // Read JSON file and map/convert to java POJO data/sample-lite.json
           Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

           // Print first and last name
           System.out.println("First name = " + theStudent.getFirstName());
           System.out.println("Last name = " + theStudent.getLastName());

           // Print out address and street city
           System.out.println("Street = " + theStudent.getAddress().getStreet());
           System.out.println("City = " + theStudent.getAddress().getCity() );

           // Print out the languages
           for(String tempLang : theStudent.getLanguages()){
               System.out.println(tempLang);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
    }
}
