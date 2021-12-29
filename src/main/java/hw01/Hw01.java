package hw01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        // Ctrl Alt L выровнять
        // displayTheHighestAndSmallNumber(new ArrayList<>(Arrays.asList(85, 3, 5, 1000, 2596)));
        puzzle();
    }

    public static void puzzle() {
        Scanner scan = new Scanner(System.in); // для ввода в консоль
        System.out.print("Может ли дождь лить два дня подряд?\n");
        System.out.print("Enter answer\n");
        String answer = scan.nextLine();
        for (int i = 1; i <= 3; i++) {
            if (answer.contentEquals("н") || answer.contentEquals("no") || answer.contentEquals(
                "нет") || answer.contentEquals("n")) {
                System.out.print("Right\n");
                break;
            } else if (answer.contentEquals("Сдаюсь")) {
                System.out.print("Right answer is no\n");
                break;
            } else if (i <= 3) {
                System.out.print("Try again\n");
                String text = scan.nextLine();
                if (text.contentEquals("н") || text.contentEquals("no") ||
                    text.contentEquals("нет") || text.contentEquals("n")) {
                    System.out.print("Right\n");
                    break;} else if(text.contentEquals("Сдаюсь")) {
                    System.out.print("Right answer is no\n");
                    break;} else {
                    System.out.print("Game over\n");
                }
            }
        }
    }

    public static void fibonacci() {
        int n1 = 1; // первое число начинается с 1
        int n2 = 1; // второе число начинается с 1
        int n3;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 3; i <= 11; i++) { //  i = 3 так как первые два числа уже указала в условии
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2
                = n3; // значение n3 присваивается к n2 после чего след этап в for n2 уже идет с новым значением
        }
        System.out.println();
    }

    public static void recumbentRhombus() { //реализовать
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i <= k && i <= 9 - k) {
                    System.out.print("* ");
                } else if (!(i + 1 <= k || i + 1 <= 9 - k)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void emptySquare() {  //реализовать
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i >= 9 - k) {
                    System.out.print("* ");
                } else if (i <= 9 - k) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void highToDownRectangularTriangle() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i <= 9 - k) {
                    System.out.print("* ");
                } else if (i <= 9 - k) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void highRectangularTriangle() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (9 - i <= k) {
                    System.out.print("* ");
                } else if (9 - i <= k) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void downRectangularTriangle() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i <= k) {
                    System.out.print("* ");
                } else if (i - 9 >= k) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void stickBottomToHigh() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i == k) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void stickHighToBottom() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i == 9 - k) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void rectangle() { // прямоугольник
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i >= k - 9) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void rectangularTriangle() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i >= k) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void topDownHighLineFigure() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i <= k) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

    public static void downTopHighLineFigure() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i >= k) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }

    public static void cross() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i == k || i == 9 - k) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void rhombus() {
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (i <= k && i <= 9 - k) {
                    System.out.print("* ");
                } else if (!(i + 1 <= k || i + 1 <= 9 - k)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void downToHighLineFigure() { //первый вариант
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (k == 9 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void hightToDownLine_figures() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
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

