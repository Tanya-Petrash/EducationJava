package hw01;

public class hw01 {
    public static void main(String[] args) {
        // Вывести на консоль количество максимальных чисел среди этих четырех
        int firstnumber = 85;
        int secondnumber = 3;
        int thirdnumber = 5;
        int fourthnumber = 1000;

        if (firstnumber  > secondnumber && firstnumber > thirdnumber && firstnumber >fourthnumber) {
            System.out.print(firstnumber);
        } else if (secondnumber > firstnumber && secondnumber > thirdnumber && secondnumber > fourthnumber) {
            System.out.print(secondnumber);
        } else if (thirdnumber > firstnumber && thirdnumber > secondnumber && thirdnumber > fourthnumber) {
            System.out.print(thirdnumber);
        } else if (fourthnumber > firstnumber && fourthnumber > secondnumber && fourthnumber > thirdnumber) {
            System.out.print(fourthnumber);
        } else {
            System.out.print("Mistake");
        }
        // Ctrl Alt L выровнять
    }
}

