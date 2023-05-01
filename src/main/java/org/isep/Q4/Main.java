package org.isep.Q4;

import org.isep.Q3.GenerateRandomNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static List<Integer> initializeIntegerList(int size, Supplier<Integer> supplier){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++){
            list.add(supplier.get());
        }
        return list;
    }
    public static <T> List<T> initializeList(int size, Supplier<T> supplier){
        List<T> list = new ArrayList<>();
        for(int i = 0; i < size; i++){
            list.add(supplier.get());
        }
        return list;
    }
    public static void main(String[] args) {

        Predicate<String> isFrenchNumber = (phoneNumber) -> {return phoneNumber.startsWith("+33");};
        Predicate<String> isFrenchNumber02 = (phoneNumber) -> phoneNumber.startsWith("+33");
        boolean valuer = isFrenchNumber.test("+33651854898");
        System.out.println(valuer);

        GenerateRandomNumber randomNumber = () -> (int)(Math.random()*101);
        Supplier<Integer> randomNumber1 = () -> (int)(Math.random()*101);
        int randomNumber3 = randomNumber.create();
        int randomNumber4 = randomNumber1.get();

        System.out.println("Premier nombre aléatoire" + randomNumber3);
        System.out.println("Second nombre aléatoire" + randomNumber4);

        List<Integer> integerList = initializeIntegerList(10, randomNumber1);
        System.out.println("Liste aléatoire d'entier: " + integerList);

        System.out.println("Utilisation de initializeList: ");

        List<String> stringList = initializeList(5, () -> "test");
        System.out.println(stringList);

        List<Integer> integerList1 = initializeList(3, () -> 22);
        System.out.println(integerList1);

        Supplier<Integer> randomIntSupplier = () -> new Random().nextInt(101);
        List<Integer> randomIntList = initializeList(10, randomIntSupplier);
        System.out.println();

        Consumer<String> messageBienvenue = (pseudo) -> System.out.println("Bienvenue, " + pseudo + "!");
        messageBienvenue.accept("Bertrand");
        messageBienvenue.accept("Giuseppe");
        messageBienvenue.accept("Quatre");
        System.out.println();

        Function<String,Integer> stringLengthFunction = characterString -> characterString.length();

        String testString = "Je teste mon code";
        Integer testStringlength = stringLengthFunction.apply(testString);
        System.out.println(testStringlength);
        System.out.println();

        BiFunction<Double, Double, Double> powerFunction = (base, exponent) -> Math.pow(base, exponent);
        double result = powerFunction.apply(2.0, 5.0);
        System.out.println(result);

        /*
        Un predicate est une fonction qui vérifie si le critère de sélection est correcte et si elle est vérifiée, elle
        renvoie un boolean.
        Un Supplier est une fonction qui ne prend en compte aucun paramètre et en sortie renvoie une valeur.
        Un Consumer est un interface fonctionnelle qui prend en entrée un argument et ne renvoie rien.
        Fonction prend une valeur en entrée et renvoie une autre valeur. Elle est souvent utilisée pour transformer des
        données.

        Ces différents concepts sont étoitements liés, du fait qu'elles permettent l'utilisation des fonctions
         efficacement et expressivement dans le code.
         */
    }
}
