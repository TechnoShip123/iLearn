package iLearn;

@SuppressWarnings("ConstantConditions")
public class Arrays {

    public static void main(String[] args) {
        // Unlike an `int` which only stores one element, an array can store multiple, and the `new int[100]` means that we're creating an array with 100 slots.
        // Keep in mind that an array can only hold `int` values in this example, so no `String`, `Boolean`, etc.
        int [] values = new int[100];
        // Here, we assign the number 100 using `= 100;` and specify which slot it goes into in the `values[]` section, so for example here I assign `100` to slot `0`, which is the first
        // slot. Think of it like in Python, where a list starts as `0, 1, 2, 3...`. This also means that the last slot of the array is `99`, NOT `100`.
        values[0] = 100;
        values[99] = 199;
        // Just like Python, we can call a certain part of the array/list and print it, by using `System.out.println(myArray[<slot>])`
        System.out.println(values[0]);
        // If you try to call an empty array, Java will return it with a value of 0.
        System.out.println(values[70]);
        // Say we want an array that contains decimal values, we could do the same as above except start with `double []` and instead of `new int[]` we would do `new double[]`.
        double [] decArrays = new double[50];
        decArrays[0] = 3.14159265;
        decArrays[1] = 4;
        decArrays[2] = 5.0;
        System.out.println(decArrays[0]);
        // Just like that, we can change it to hold any types. For example, I could have one that holds Booleans.
        boolean [] boolArrays = new boolean[5];
        boolArrays[0] = true;
        boolArrays[4] = false;
        System.out.println(boolArrays[0]);
        // For strings however, things look a bit different.
        String [] words = new String[] {"My", "Name", "is", "TechnoShip123"};
        System.out.print(words[0]);
        System.out.print(" name is ");
        System.out.println(words[3]);
        // However, if we want to do it in a more `flexible` way, which I would recommend, you could do this.
        String[] myWords = new String[5];
        myWords[0] = "Yes, ";
        myWords[1] = "my";
        myWords[2] = "name";
        myWords[3] = "is";
        myWords[4] = "TechnoShip123";
        // Of course, we can reassign certain values as well.
        myWords[0] = "No, ";
        myWords[3] = "isn't";
        System.out.println(myWords[0]);


    }

    }
