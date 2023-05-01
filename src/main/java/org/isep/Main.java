package org.isep;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<String> phoneNumbers = List.of("0134110038",
                "0641967445",
                "+33662146782",
                "+33662146782",
                "+33762146782",
                "0712947230",
                "+33600000001");

        List<String> internationalFrenchMobilePhone = phoneNumbers
                .stream()
                .filter(phone -> phone != null)
                .filter(phone -> phone.startsWith("+33"))
                .filter(phone -> phone.startsWith("+336"))
                .distinct()
                .sorted() //sort the list (by default ->x)
                .peek(phone -> System.out.println(phone))
                .toList();

        List<Integer> OtherEg = phoneNumbers
                .parallelStream() //Use another processor of the computer( more efficient)
                .filter(phone -> phone.startsWith("+33")) //Filter the elements
                .filter(phone -> phone.startsWith("+336"))//Retrieve only the element that are filtered that begin with
                .distinct() //Remove the double from list
                .map(phone -> phone.length())
                .peek(phone -> System.out.println(phone))
                .toList();

    }
}