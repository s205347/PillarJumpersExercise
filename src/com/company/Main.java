package com.company;

import java.util.Scanner;

public class Main {
    static int mostJumps;
    static int numberOfPillars;
    static int currentStep = 1;
    static int numberOfJumps = 0;
    static int currentMaxJump = 0;
    static int sum = 0;
    public static void main(String[] args) {
       func();
        System.out.println("To check whether or not we have landed on the last pillar, this is the pillar we have landed at: " + currentStep);
        System.out.println("Check if the number of jumps is no more than 3. Here is the count of jumps made: " + numberOfJumps);
    }

    public static int func(){

    Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of pillars from 1 to 100.000");
    numberOfPillars = scan.nextInt();
        System.out.println("Please enter the number of maximum jumps from 1 to 1.000.000.000");
    mostJumps = scan.nextInt();

    int[] heightOfPillar = new int[numberOfPillars];
        System.out.println("Now enter the heights of the pillars");
        for (int i=1; i<numberOfPillars; i++){
        heightOfPillar[i] = scan.nextInt();
    }

        for (int i = 1; i < heightOfPillar.length; i++) {
        int difference = heightOfPillar[i] - heightOfPillar[i - 1];
        if (difference > currentMaxJump) {
            currentMaxJump = difference;
        }
    }

        while (numberOfJumps < mostJumps && currentStep < heightOfPillar[heightOfPillar.length-1]) {
        for (int i = currentStep; i < heightOfPillar.length; i++) {
            int difference2 = heightOfPillar[i] - heightOfPillar[i - 1];
            sum = sum + difference2;
            currentStep = heightOfPillar[i];
            if (sum > currentMaxJump) {
                numberOfJumps++;
            }
        }
    }
        return numberOfJumps;
    }
}




//System.out.println("Now we know that the absolute minimum jump strength S should be " + currentMaxJump + " in order to jump from every pillar to another");


          //  if (heightOfPillar[i] >= heightOfPillar[i - 1] && heightOfPillar[i] <= heightOfPillar[i] + currentMaxJump) {
            //        currentStep = heightOfPillar[i];
             //       numberOfJumps++;
                //System.out.println(currentStep);
                //System.out.println(numberOfJumps);
              //  System.out.println(difference2);

//}


            // currentHeight = i;


/* for (int i = 1; i < heightOfPillar.length; i++) {
        int difference2 = heightOfPillar[i] - heightOfPillar[i - 1];
        if (heightOfPillar[i] >= heightOfPillar[i - 1] && heightOfPillar[i] <= heightOfPillar[i] + currentMaxJump) {
        currentStep = heightOfPillar[i];
        numberOfJumps++;
        //System.out.println(currentStep);
        //System.out.println(numberOfJumps);
        System.out.println(difference2);
        }
        }*/

  /*
        for (int i = 1; i < heightOfPillar.length; i++) {
            if (heightOfPillar[i] > heightOfPillar[i - 1] && heightOfPillar[i + 1] <= heightOfPillar[i] + currentMaxJump) {
                numberOfJumps++;
                currentStep = heightOfPillar[i];
                //System.out.println(numberOfJumps);
                System.out.println(numberOfJumps);
            }
        }*/


 /*while (numberOfJumps < mostJumps) {
        if (sum < currentMaxJump && currentStep < heightOfPillar[heightOfPillar.length-1]) {
        for (int i = currentStep; i < heightOfPillar.length; i++) {
        int difference2 = heightOfPillar[i] - heightOfPillar[i - 1];
        sum = sum + difference2;
        currentStep = heightOfPillar[i];
        }
        }
        numberOfJumps++;
        }*/

/*
while (numberOfJumps < mostJumps) {
        if (sum < currentMaxJump && currentStep < heightOfPillar[heightOfPillar.length-1]) {
        for (int i = currentStep; i < heightOfPillar.length; i++) {
        int difference2 = heightOfPillar[i] - heightOfPillar[i - 1];
        sum = sum + difference2;
        currentStep = heightOfPillar[i];
        }
        }
        numberOfJumps++;
        }*/

 /*while (numberOfJumps < mostJumps && currentStep < heightOfPillar[heightOfPillar.length-1]) {
                for (int i = currentStep; i < heightOfPillar.length; i++) {
                    int difference2 = heightOfPillar[i] - heightOfPillar[i - 1];
                    sum = sum + difference2;
                    currentStep = heightOfPillar[i];
                    if (sum > currentMaxJump) {
                        numberOfJumps++;
                }
            }
        }*/