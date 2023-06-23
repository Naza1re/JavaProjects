package Logic;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList<>();
        ArrayList randomNumber = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int MyNumber;

        int number = NumberCalculation.generateUniqueFourDigitNumber();
        System.out.println();
        int x8 = number/1000;
        int x7 = number%1000/100;
        int x6 = number%100/10;
        int x5 = number%10;
        randomNumber.add(x8);
        randomNumber.add(x7);
        randomNumber.add(x6);
        randomNumber.add(x5);

        System.out.println(randomNumber);



            do{

            System.out.println("Введите число ");
            MyNumber = in.nextInt();

            int x4 = MyNumber/1000;
            int x3 = MyNumber%1000/100;
            int x2 = MyNumber%100/10;
            int x1 = MyNumber%10;
            numbers.add(x4);
            numbers.add(x3);
            numbers.add(x2);
            numbers.add(x1);
            System.out.println(numbers);
            System.out.println(NumberCalculation.correctPosition(numbers, randomNumber));
            System.out.println(NumberCalculation.containsNumbers(numbers, randomNumber));

            if (NumberCalculation.correctPosition(numbers,randomNumber)==4) {
                System.out.println("Вы выйграли ");
                break;
            }
                numbers.clear();
        }while (true);


    }
}