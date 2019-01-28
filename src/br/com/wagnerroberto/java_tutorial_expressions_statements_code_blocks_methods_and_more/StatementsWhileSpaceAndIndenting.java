package br.com.wagnerroberto.java_tutorial_expressions_statements_code_blocks_methods_and_more;

public class StatementsWhileSpaceAndIndenting {
    public static void main(String[] args) {

        int myVariable = 50;

        if (myVariable == 50) {
            System.out.println("Printed");
        }

        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one");

    }
}
