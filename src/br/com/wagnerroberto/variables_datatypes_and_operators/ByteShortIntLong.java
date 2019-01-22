package br.com.wagnerroberto.variables_datatypes_and_operators;

public class ByteShortIntLong {

    public static void main(Strings[] args) {

	    //1. Create a byte variable and set it to any valid byte number.
        byte byteNumber = 127;
        //2. Create a short variable and set it to any valid short number.
        short shortNumber = 32_767;
        //3. Create a int variable and set it to any valid int number.
        int intNumber = 2_147_483_647;
        //4. Create a variable of type long, and make it equal to
        //   50000 + 10 times the sum of the byte, plus the short plus the int;
        long longNumber = 50_000L + 10L * (byteNumber+shortNumber+intNumber);
        System.out.println(longNumber);


    }
}
