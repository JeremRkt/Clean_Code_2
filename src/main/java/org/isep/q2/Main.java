package org.isep.q2;

public class Main {
    public static void main(String[] args) {
        LengthCalculator  lastNameLengthCalculator = new LastNameLengthCalculator();
        int rakotoarinosyLength = lastNameLengthCalculator.calculate("rakotoarinosy");
        System.out.println(rakotoarinosyLength);

        LengthCalculator firstNameCalculator = new LengthCalculator() {
            @Override
            public int calculate(String string) {
                return string.length();
            }
        };
        int fbtk = firstNameCalculator.calculate("jeremyah");
        System.out.println(fbtk);

        LengthCalculator cityNameCalculator = (String cityName) -> {return cityName.length();};
        LengthCalculator cityNameCalculator2 = cityName -> cityName.length();
        LengthCalculator cityNameCalculator3 = String::length;
        System.out.println(cityNameCalculator3.calculate("argenteuil"));

        /*Une lambda permet d'introduire une fonction sans passer par la création d'une classe ou une méthode.
        Cette Fonction peut être assignéd à une variable ou passé en paramètre une méthode.
         */
        /*
        Functional Interface est une annotation introduite par JAVA 8 qui ne peut contenir qu'une seule méthode abstraite,
        mais qui peut contenir autant de méthode statique et par défaut qu'elle veut.
         */

    }
}
