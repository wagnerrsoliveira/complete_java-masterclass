package br.com.wagnerroberto.variables_datatypes_and_operators;

public class CharBoolean {
    public static void main(String[] args) {
        //width of 16(2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: "+myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        //width of 16(2 bytes)
        char registeredChar = '\u00AE';
        System.out.println("The registered char is "+registeredChar);
    }
}
