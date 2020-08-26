import java.util.Scanner;

public class FullDate {
    public static void main(String[] args){
//Write a program that asks a user for month , day, and year as a number and then print out the date in full date format.
//
//Dont' forget your pseudocode/flowchart and your sample test data.
//Ask the user
//e.g.
//Enter month (mm): 11
//
//Enter day (dd): 15
//
//Enter year (yy): 20
//
//It is November 15, 2020.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month (mm):");
        int month = input.nextInt(); //2\n (when you hit enter, you provided \n)

        System.out.println("Enter day (dd):");
        int day = input.nextInt();

        System.out.println("Enter year (yy):");
        int year = input.nextInt();
// Scanner buffer

        switch (month){
            case 1:
                System.out.println("It is January, " + day + " " +(2000 + year) + ".");
                break;
            case 2:
                System.out.println("It is February, " + day + " " + (2000 + year) + ".");
                break;
            case 3:
                System.out.println("It is March, " + day + " " + (2000 + year) + ".");
                break;
            case 4:
                System.out.println("It is April, " + day + " " + (2000 + year) + ".");
                break;
            case 5:
                System.out.println("It is May, " + day + " " + (2000 + year) + ".");
                break;
            case 6:
                System.out.println("It is June, " + day + " " + (2000 + year) + ".");
                break;
            case 7:
                System.out.println("It is July, " + day + " " + (2000 + year) + ".");
                break;
            case 8:
                System.out.println("It is August, " + day + " " + (2000 + year) + ".");
                break;
            case 9:
                System.out.println("It is September, " + day + " " + (2000 + year) + ".");
                break;
            case 10:
                System.out.println("It is October, " + day + " " + (2000 + year) + ".");
                break;
            case 11:
                System.out.println("It is November, " + day + " " + (2000 + year) + ".");
                break;
            case 12:
                System.out.println("It is December, " + day + " " + (2000 + year) + ".");
                break;
            default:
                System.out.println("This is invalid month's name.");
                break;
        }

    }
}