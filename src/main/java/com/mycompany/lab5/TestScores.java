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
public class TestScores 
{
    private double[] scoreArray;
    
     public static void main(String[] args)
    {  
        double[] testScores = {98, 78, 66, 81, 85};
        
        System.out.println("Average of test scores: " + getAverage(testScores));
           
    }

    public TestScores(double[] test) throws IllegalArgumentException
    {
        scoreArray = new double[test.length];

        for (int i = 0; i < test.length; i++)
        {
            if (test[i] < 0 || test[i] > 100)

                throw new IllegalArgumentException("Test scores must have a value less than 100 and greater than 0.");

            else
                scoreArray[i] = test[i];
        }
    }
    
    public static double getTotal(double[] testScores) 
    {
        int getTotal = 0;
        
        for (int i = 0; i < testScores.length; i++) 
        {
            getTotal += testScores[i];
        }
        
        return getTotal;
    }

    public static double getAverage(double[] testScores) 
    {
        double getAverage;
        
        getAverage = (getTotal(testScores)) / testScores.length;
        
        return getAverage;
    }
}

