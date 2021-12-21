package hw01;

import java.nio.file.ClosedWatchServiceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Hw01 {
    public static void main(String[] args) {
        // Ctrl Alt L выровнять
        // displayTheHighestAndSmallNumber(new ArrayList<>(Arrays.asList(85, 3, 5, 1000, 2596)));
        //  String firstname = "";
        //  String secondname = "";
        //   displayTheName(firstname, secondname);
        int monthData = 0;
        theSeasonOfYear(monthData);
    }

    public static void theSeasonOfYear(int monthData) {
        //  Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.
        monthData = 12;
        List<Integer> winter = new ArrayList<>();
        int december = 12;
        int january = 01;
        int february = 02;
        winter.add(december);
        winter.add(january);
        winter.add(february);
        List<Integer> spring = new ArrayList<>();
        int march = 03;
        int april = 04;
        int may = 05;
        spring.add(march);
        spring.add(april);
        spring.add(may);
        List<Integer> summer = new ArrayList<>();
        int june = 06;
        int july = 07;
        int august = 8; // почему ругается на 08
        summer.add(june);
        summer.add(july);
        summer.add(august);
        List<Integer> autumn = new ArrayList<>();
        int september = 9;  // почему ругается на 09
        int october = 10;
        int november = 11;
        autumn.add(september);
        autumn.add(october);
        autumn.add(november);
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
        }
    }


        public static void displayTheName (String firstname, String secondname){
            //Даны имена 2х человек (тип String). Если имена равны, то вывести сообщение о том, что люди являются тезками.
            Scanner scan = new Scanner(System.in); // для ввода в консоль
            System.out.println("Write first name");
            firstname = scan.nextLine();
            System.out.println("Write second name");
            secondname = scan.nextLine();
            if (firstname.contentEquals(secondname)) {
                System.out.print("The names are the same");
            } else {System.out.print("The name are different");}
        }
        public static void displayTheHighestAndSmallNumber (List < Integer > integerList) {
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

