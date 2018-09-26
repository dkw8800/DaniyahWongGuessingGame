package com.Daniyah;

import java.util.Scanner;

public class DWongLib {

    public static void allObjectives()
    {
        System.out.println("Choose which game! 1 for Objective 1 or 2 for Objective 2 or 3 for Objective 3!");
        Scanner gamechoice = new Scanner(System.in);
        int choice = gamechoice.nextInt();
        if(choice == 1)
        {
            DWongLib.initialObjective1();
        }
        else if(choice == 2)
        {
            DWongLib.initialObjective2();
        }
        else if(choice == 3)
        {
            DWongLib.initialObjective3();
        }
        else
        {
            System.out.println("CHOOSE 1 OR 2 OR 3");
        }
    }


    public static void initialObjective1()
    {
        int guessnumber = 0;
        int answer = (int)(10.0*Math.random());
        int game = 0;

        System.out.println("Enter your name!");
        Scanner username = new Scanner(System.in);
        String use = username.nextLine();

        while(game == 0) {
            System.out.println("Enter a number to guess!");
            Scanner user = new Scanner(System.in);
            int useranswer = user.nextInt();
            guessnumber++;
            if (answer == useranswer) {
                System.out.println("Correct " + use + "! The number of guesses you ended with is" + guessnumber);
                game = 1;
            }
        }
    }



    public static void initialObjective2()
    {
        int guessnumber = 0;
        int game = 0;

        System.out.println("Enter your name!");
        Scanner username = new Scanner(System.in);
        String use = username.nextLine();
        int number = 50;
        int lowlimit = 1;
        int highlimit = 100;

        while(game == 0) {
            System.out.println("This is my guess! What is my status?");
            System.out.println(number);
            Scanner user = new Scanner(System.in);
            String useranswer = user.nextLine();
            guessnumber++;

            System.out.println(lowlimit);
            System.out.println(highlimit);

            if (useranswer.compareTo("correct")==0) {
                System.out.println("I guessed correctly, " + use + "! The number of guesses I ended with is " + guessnumber);
                game = 1;
            }
            else if(useranswer.compareTo("too high")==0)
            {
                System.out.println("Too high, " + use + "?");
                highlimit = number;
                number = (highlimit+lowlimit)/2;
            }
            else
            {
                System.out.println("Too low, " + use + "?");
                lowlimit = number;
                number = (highlimit+lowlimit)/2;
            }
        }
    }



    public static void initialObjective3()
    {
        int guessnumber = 0;
        int answer = (int)(101.0*Math.random());
        int game = 0;

        System.out.println("Enter your name!");
        Scanner username = new Scanner(System.in);
        String use = username.nextLine();

        while(game == 0) {
            System.out.println("Enter a number to guess!");
            Scanner user = new Scanner(System.in);
            int useranswer = user.nextInt();
            guessnumber++;
            if (answer == useranswer) {
                System.out.println("Correct " + use + "! The number of guesses you ended with is" + guessnumber);
                game = 1;
            }
            else if(answer < useranswer)
            {
                System.out.println("Too high, " + use + "!");
            }
            else
            {
                System.out.println("Too low, " + use + "!");
            }
        }
    }


}
