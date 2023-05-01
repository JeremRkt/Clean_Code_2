package org.isep.Q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Q3 {
    public static String getSecondElementString(List<String> list){
        if (list == null || list.size() < 2){
            return null;
        }
        return list.get(1);
    }

    public static Integer getSecondElementInteger(List<Integer> list){
        if (list == null || list.size() < 2 ){
            return null;
        }
        return list.get(1);
    }

    public static <T> T getSecondElementUnknown(List<T>list){
        if (list == null || list.size() <2){
            return null;
        }
        return list.get(1);
    }

    public static void main(String[] args) {

    List<String> test = Arrays.asList("Vélo", "Voiture", "Train", "Trottinette");
    String getSecondElementString = getSecondElementString(test);
    System.out.println("Le Second élément de la liste: "+ getSecondElementString);

    List<Integer> listInteger = Arrays.asList(22,03,1);
    Integer secondElementInteger = getSecondElementInteger(listInteger);
        System.out.println("Le second élément Integer de la liste: " + secondElementInteger);


        /*
        La généricité permet de créer des classes permettant d'utiliser tout les types de données sans avoir à réécrire
        de manière modulaire et qui puisse être réutilisable, en offrant une sécurité accrue au niveau des types
         */
    }
}
