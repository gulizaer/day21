package day21_multi_Dimensionla_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        String[][] items = { {"Apple", "Banana", "Grape", "Avocado"},
                           {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                           {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"} };
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.println(items[i][j] + "\t ");
            }
            }

        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.println(items[i][j]+ "\t");

            }

        }
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.println(items[i][j].substring(0,3) + "\t");


            }

        }





    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (each inner array reversed, add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (the first 3 letters of every element, add \t between two words)
				App    Ban   Gra	Avo
				Pap     Toi   Tis    Dia
				Cok   Fan   Ari   Pep   Wat

 */