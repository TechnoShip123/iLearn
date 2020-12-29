package iLearn;


@SuppressWarnings("unused")
public class Variables {

    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) {
        // To tell Java that we're setting a variable that holds a number, we use `int <varName>;`
        int num;
        // To assign a number to that variable, we would do `<varName> = <number>;`
        num = 64209;
        // To do both of those at once, we use `int <varName> = <number>;`
        int x = 2;
        int y = 4;
        // We print the variable that we made by using the same `println()` function from before, except this time we don't put `""`, just the variable name.
        System.out.println(num);
        System.out.println(x);
        System.out.println(y);
        // You can always change what a variable contains later on in the code, use the normal `<varName> = <content>`. Make sure not to add defining things like `int` or you get an error.
        x = 6;
        System.out.println(x);
        // This time we're telling Java to add two variables, x and y, and print the result, which is 10.
        System.out.println(x + y);
        // Just like Python, you assign a string to a variable. In Java, it's defined by using `String <varName>` or `String <varName> = "Content"`
        // NOTE: While Python takes both double and single quotes, Java only takes double quotes.
        String str;
        str = "Hi there!";
        System.out.println(str);
        // Wonder why I'm using `println()`? Well, in Java `println()` will print and move the cursor to a new line, whereas `print()` will print it and do the next command on the same line.
        String Date = "12/28/2020";
        String javaOpinion = "Fun!";
        System.out.println("Hi there,");
        System.out.print("As of ");
        System.out.print(Date);
        System.out.println(", I am currently learning Java!");
        System.out.print("As of right now I think that it's ");
        System.out.println(javaOpinion);
        // You can also add words to an existing string variable using `+`. However, it does not automatically add spaces, you could work around that by adding one at the end of the string.
        String happy_face = ":D";
        System.out.println(str + " Nice to meet you! " + happy_face);
        // If you were to try and use a `-` instead of a `+`, you would get an error saying that it isn't a supported data type. That's because it would only work on integers and int vars.
        System.out.println("x is currently " + x + ", let's try modifying the printed value by telling Java to print what `x` is + 28, and - 2:");
        System.out.print("x + 28 = ");
        System.out.println(x + 28);
        System.out.print("x - 2 = ");
        System.out.println(x - 2);
        // You can also have multiple commands on one line, as long as you have the `;`, telling Java that the command ends there and a new one is beginning.
        System.out.println("While this command isn't printing two strings on one line,"); System.out.println("the two commands themselves were written on one line, separated by a `;`");


        // Java has limits on the content of variables, for example, increasing the length of the following `longVar` variable would result in a `Out of Range` error, unless you add
        // an uppercase `L` to the end of your variable, and change the type from `int` to `long` telling Java that it's a long number.
        int longVar = 1000000000;
        // Adding one more zero to the end wouldn't work, unless I add an `L` to the end and change the type to a `long` variable:
        long longerVar = 10000000000000000L;
        // You can also set a small `int` to a `long`, and you don't need to add the `L`, however it isn't very efficient:
        long short_but_longVar = 70;
        System.out.println(short_but_longVar);
        short_but_longVar = 70L;
        System.out.println(short_but_longVar);
        // Similar to `long` for long numbers, there is a type called `short` for short numbers, which can hold from at least the number `-32768`, up to the number `32767`.
        // If I added `1` and made it `32768`, Java would raise an error and complain that you gave it an `int` instead of a `short`, because an `int` is the next type after a `short`.
        short long_and_shortVar = 32767;
        // A `short` can hold from `-32768` to `32767`, any higher/lower and it becomes an error, once again complaining that it should be an `int` instead of a `short`.
        short small_shortVar = -32768;
        // The smallest type is a `byte`, which can hold from `-128` to `127`, any higher or lower and it will complain that it should be a `short` or `int` instead of a `byte`.
        byte tiny_numberVar = -128;
        byte pos_tiny_numberVar = 127;
        // Another data type is a `double`, which holds decimals.
        double decimalVar = 196.1234567890;
        // We also have the classic `Boolean`, which holds either true` or `false`. While in Python it was `True` and `False`, in Java it's `true` and `false`, so watch your casing.
        boolean truthChecker = true;
        System.out.print("Truth Checker is ");
        System.out.println(truthChecker);
        // Finally we have the `var` type, which can only hold up to a single character. When defining a `char`, you must use single quotes, because double quotes signify a `String`
        // whereas single quotes signify a `char`.
        char charVar = '9';
    }

}
