package com.corejava.streams.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExamples {

    // we can create OptionalObject using three methods
    // empty
    // of
    // OfNullable


    public static void main(String[] args) {
        //empty
        final Optional<Object> emptyOptionalObject = Optional.empty();
        System.out.println(emptyOptionalObject);

        // of -- used when we Know its is a null object -- it will throw null pointer exception

        Customer customer = new Customer(1,null, Arrays.asList(1234,8889));
        // of method will check if the value is empty return or else throw nullPointerexception
     //   final Optional<String> customerName = Optional.of(customer.getName());
      //  System.out.println(customerName);

        // ofNullbale --check if value is nt present or null give Optional of emtpy but not null pointer

//        final Optional<String> stringOptional = Optional.ofNullable(customer.getName());
//        System.out.println(stringOptional);
//
//       if(stringOptional.isPresent())
//       {
//           // give the actual value
//           System.out.println( stringOptional.get());
//
//       }
        final Optional<String> stringOptional = Optional.ofNullable(customer.getName());

        
         // this will print default becoz the stringOptional is empty
        System.out.println( stringOptional.orElse("default"));


        final Integer integer = Optional.ofNullable(customer.getId()).orElse(1);

        // if we Know this value is empty/null we can throw custom exeception

        final Integer integer1 = Optional.ofNullable(customer.getId()).orElseThrow(() -> new RuntimeException("value not presnet"));
        System.out.println(integer1);

        Customer customer2 = new Customer(1,null, Arrays.asList(1234,8889));
        Customer customer3 = new Customer(1,"rohit", Arrays.asList(1234,8889));
        // new I wnato perform something on the value
        final Optional<String> stringOptional1 = Optional.ofNullable(customer2.getName()).map(String::toUpperCase);

        // I want to do something if the optiona object is present
        stringOptional1.ifPresent(s-> System.out.println(s));
      // I want to set it i can either set null or a default value or keep it null
        final String s = Optional.of(customer2.getName()).orElse("");
        customer2.setName(s);
        //sout
    }
}
