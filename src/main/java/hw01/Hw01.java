package hw01;

import java.nio.file.ClosedWatchServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Hw01 {
    public static void main(String[] args) {
        // Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел
        // Ctrl Alt L выровнять
        // displayTheHighestAndSmallNumber(new ArrayList<>(Arrays.asList(85, 3, 5, 1000, 2596)));
        String firstname = "";
        String secondname = "";
        displayTheName(firstname, secondname);
    }

    public static void displayTheName(String firstname, String secondname) {
        //Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
        Scanner scan = new Scanner(System.in); // для ввода в консоль
        System.out.println("Write first name");
        firstname = scan.nextLine();
        System.out.println("Write second name");
        secondname = scan.nextLine();
        if (firstname.contentEquals(secondname)) {
            System.out.print("The names are the same");
        }
        else {System.out.print("The name are different");}
    }





    public static void displayTheHighestAndSmallNumber(List<Integer> integerList) {
        //        List<Integer> numbers = new ArrayList<>();//(Arrays.asList(1,2,3,4,5));
        //        int firstnumber = 85;
        //        int secondnumber = 3;
        //        int thirdnumber = 5;
        //        int fourthnumber = 1000;
        //        int fifthhnumber = 2596;
        //        numbers.add(firstnumber);
        //        numbers.add(secondnumber);
        //        numbers.add(thirdnumber);
        //        numbers.add(fourthnumber);
        //        numbers.add(fifthhnumber);
        Integer min = null;
        Integer max = null;
        for (Integer item : integerList) {
            if (min == null || min > item) {
                min = item;
            }
            if (max == null || max < item) {
                max = item;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

