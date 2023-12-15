package com.education;

import java.util.Scanner;

public class PizzaApplication {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] cheeses = {"Cheddar", "Edam", "Camembert", "Brie", "Mozzarella"};
    private static String[] meats = {"Beacon", "Chicken", "Sausages", "Vegetarian", "Salami"};

    public static void main(String[] args) {
        System.out.println("Choose the ingredients for your pizza");
        System.out.println("Choose cheese : ");
        printIngredients(cheeses);
        System.out.print("Your option is : ");
        int Choose = inputSelection(cheeses.length);
        System.out.println("You chose " + cheeses[Choose - 1]);

//        printIngredients(meats);
//        System.out.print("Your option is : ");
//        int Meat = inputSelection(meats.length);
//        System.out.println("You chose " + meats[Meat - 1]);


    }

    private static void printIngredients(String[] ingredients) {
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println((i + 1) + ") " + ingredients[i]);
        }
    }
    private static int inputSelection(int size){
        if (scanner.hasNextInt()){
            int result = scanner.nextInt();
            if (result <= size && result > 0){
                return result;
            }

        }
        return 1;
    }
}