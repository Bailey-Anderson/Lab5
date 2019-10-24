/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

/**
 *
 * @author baileyanderson
 */
public class TestData {
    
     public static void main(String[] args) 
    {
      int[] inputValues = {65, 78, 94, 96, 87};
      
      System.out.println("Total of all test scores: " + getTotal(inputValues));
      
      System.out.println("Average test score: " + getAverage(inputValues));
      
      System.out.println("Highest test score: " + getHighest(inputValues));
      
      System.out.println("Lowest test score: " + getLowest(inputValues));
    }
    
    public static int getTotal(int[] inputValues) 
    {
        int getTotal = 0;
        
        for (int i = 0; i < inputValues.length; i++) 
        {
            getTotal += inputValues[i];
        }
        
        return getTotal;
    }
    
    public static double getAverage(int[] inputValues) 
    {
        double getAverage;
        
        getAverage = (getTotal(inputValues)) / inputValues.length;
        
        return getAverage;
    }
    
    public static int getHighest(int[] inputValues)
    {
        int getHighest = inputValues[0];
        
        for (int i = 1; i < inputValues.length; i++)
        {
            if (inputValues[i] > getHighest)
            {
                getHighest = inputValues[i];
            }
        }
        
        return getHighest;
    }
    
    public static int getLowest(int[] inputValues)
    {
        int getLowest = inputValues[0];
        
        for (int i = 1; i < inputValues.length; i++)
        {
            if (inputValues[i] < getLowest)
            {
                getLowest = inputValues[i];
            }
        }
        
        return getLowest;
    }
            
}
