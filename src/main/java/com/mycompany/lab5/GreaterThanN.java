package com.mycompany.lab5;
/**
 *
 * @author baileyanderson
 */
public class GreaterThanN 
{
    
public static void greaterThanN(int[] array, int n)
{   
    for(int i = 0; i < array.length; i++)
        if(array[i] > n)
            
    System.out.print(array[i] + " ");
}
public static void main(String[] args)
{
    int[] array = {1, 6, 9, 0, 12, 4, 7, 10};
    
    greaterThanN(array, 5);
}
}

