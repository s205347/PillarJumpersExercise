package com.company;

public class Main {

    public static void main(String[] args) {
        int mostJumps = 3;
        int currentStep = 1;
        int numberOfJumps = 0;
        int currentMaxJump = 0;
        int sum = 0;

        int[] heightOfPillar = {1, 3, 3, 4, 7, 8, 10};
        for (int i = 1; i < heightOfPillar.length; i++) {
            int difference = heightOfPillar[i] - heightOfPillar[i - 1];
            if (difference > currentMaxJump) {
                currentMaxJump = difference;
            }
        }
        System.out.println("Now we know that the absolute minimum jump strength S should be " + currentMaxJump + " in order to jump from every pillar to another");

        while (numberOfJumps < mostJumps) {
            if (sum < currentMaxJump && currentStep < heightOfPillar[heightOfPillar.length-1]) {
                for (int i = currentStep; i < heightOfPillar.length; i++) {
                    int difference2 = heightOfPillar[i] - heightOfPillar[i - 1];
                    sum = sum + difference2;
                    currentStep = heightOfPillar[i];
                }
            }
            numberOfJumps++;
        }

            System.out.println("To check whether or not we have landed on the last pillar, this is the pillar we have landed at: " + currentStep);
            System.out.println("Check if the number of jumps is no more than 3. Here is the count of jumps made: " + numberOfJumps);
        }
    }







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