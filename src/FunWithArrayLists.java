import java.util.Scanner;

import java.util.ArrayList;

public class FunWithArrayLists {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Write a Java program to create a new array list to hold colors.
        ArrayList<String> colors = new ArrayList<>();

        //Add at least 3 colors (string) to the array list and print out all its values.
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("The values of my ArrayList are: " + colors);

        //Using the array list created above, print out the value at index 1.
        System.out.println(colors.get(1));

        /*Using the array list above, prompt the user for one new color,
        and add that color to the array list.
         */
        System.out.println("Please enter a new color. This will be added to the ArrayList.");
        String newColor = scanner.next();
        colors.add(newColor);
        System.out.println(colors);

        /*Using the array list, continue prompting the user for colors until they
        type in "Q" or "q" to quit.
        Each time the user enters a color, add that to the array list.
        Print out the list at the end.
         */
        String newInt2 = "";

        do{
            System.out.println("Now enter as many colors as you want. Once you are done type \"q\" and the program will stop.");
            newInt2 = scanner.next();
            colors.add(newInt2);

            if(newInt2.equalsIgnoreCase("q")){
                colors.remove("q");
                colors.remove("Q");
                System.out.println(colors);

            }else{
                System.out.println(colors);
            }

        }while(!newInt2.equalsIgnoreCase("q"));
    }
}
