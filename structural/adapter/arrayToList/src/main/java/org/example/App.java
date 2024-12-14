package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer[] arrayOfIntegers = new Integer[]{1, 2, 3, 4, 5};
        // Convert the array to a list using Arrays.asList() method
        List<Integer> listOfIntegers = Arrays.asList(arrayOfIntegers);

        System.out.println("Arrays.ToString(arrayOfIntegers): " + Arrays.toString(arrayOfIntegers));
        System.out.println("listOfIntegers.toString(): " + listOfIntegers.toString());
    }
}
