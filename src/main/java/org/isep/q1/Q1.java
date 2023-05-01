package org.isep.q1;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Q1 {
    public static void main(String[]args){

        Optional<String> myOptional1 = Optional.empty();
        System.out.println(myOptional1);
        if (myOptional1.isPresent()){
            System.out.println(myOptional1.get());
        }
        if (myOptional1.isEmpty()){
            System.out.println("Optional is empty");
        }

        Optional<String> marie = Optional.of("Marie");
        System.out.println(marie);
        marie.ifPresent(name -> System.out.println(name));

        Optional<String> myOptional2 =  Optional.empty();
        System.out.println(myOptional2);

        String str[] = new String[10];
        str[4] = "CLEAN CODE COURSES";

        Optional<String> value1 = Optional.of(str[4]);
        System.out.println("Filtered value: "+ value1.filter(s -> s.equals("ABC")));
        System.out.println("Filtered value: "+value1.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));

        System.out.println(value1.get());
        System.out.println("Hash code value: " + value1.hashCode());
        System.out.println(value1.isPresent());
        System.out.println(Optional.ofNullable(str[4]));

        System.out.println("orElse: "+value1.orElse("Value is not present"));
        System.out.println("orElse: "+myOptional2.orElse("Value is not present"));
        value1.ifPresent(System.out::println);
    }
}
