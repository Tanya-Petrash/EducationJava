package hw01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        // Ctrl Alt L выровнять
        // displayTheHighestAndSmallNumber(new ArrayList<>(Arrays.asList(85, 3, 5, 1000, 2596)));
        // String firstname = "";
        // String secondname = "";
        //displayTheName(firstname, secondname);
        int monthData = 0;
        theSeasonOfYear(monthData);
    }

    public static void theSeasonOfYear(int monthData) {
        //  Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
        Scanner scan = new Scanner(System.in); // для ввода в консоль
        System.out.println("Write the month");
        monthData = scan.nextInt();
        switch (monthData) {
            case 1:
            case 2:
            case 12:
                System.out.print("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("It's summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("It's autumn");
                break;
        }
        /*  List<Integer> winter = Arrays.asList(12, 1, 2);
        List<Integer> spring = Arrays.asList(3, 4, 5);
        List<Integer> summer = Arrays.asList(6, 7, 8);
        List<Integer> autumn = Arrays.asList(9, 10, 11);
        for (Integer item : winter) {
            if (monthData == item) {
                System.out.print("It's winter");
            }
        }
        for (Integer item : spring) {
            if (monthData == item) {
                System.out.print("It's spring");
            }
        }
        for (Integer item : summer) {
            if (monthData == item) {
                System.out.print("It's summer");
            }
        }
        for (Integer item : autumn) {
            if (monthData == item) {
                System.out.print("It's autumn");
            }
        } */
    }

    public static void displayTheName(String firstname, String secondname) {
        //Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
        Scanner scan = new Scanner(System.in); // для ввода в консоль
        System.out.println("Write first name");
        firstname = scan.nextLine();
        System.out.println("Write second name");
        secondname = scan.nextLine();
        if (firstname.equalsIgnoreCase(secondname)) {
            System.out.print("The names are the same");
        } else {System.out.print("The name are different");}
    }

    public static void displayTheHighestAndSmallNumber(List<Integer> integerList) {
        // Даны 5 чисел (тип int). Вывести вначале наименьшее, а затем наибольшее из данных чисел
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

