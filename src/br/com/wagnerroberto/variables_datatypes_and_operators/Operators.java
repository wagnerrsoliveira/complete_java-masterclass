package br.com.wagnerroberto.variables_datatypes_and_operators;

public class Operators {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = "+ result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult+" - 1 = "+ result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult+" * 10 = "+ result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult+" / 5 = "+ result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult+" % 3 = "+ result);

        previousResult = result;
        result = result +1 ;
        System.out.println("Result is now " + result);
        result++ ;
        System.out.println("Result is now " + result);
        result-- ;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10 ;
        System.out.println("Result is now " + result);
        result /= 10 ;
        System.out.println("Result is now " + result);
        result %= 2 ;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");

        int secondScore = 60;
        if (topScore > secondScore && topScore < 100)
            System.out.println("Greater than second score and less than 100");
    }
}
