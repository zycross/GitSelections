package selections;

import java.util.Scanner;

public class Days {
    public static void main(String[]args){
        //create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 6, inclusive:");
        int num = input.nextInt();
        switch(num){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
//                break;
            case 3:
                System.out.println("Wednesday");
//                break;
            case 4:
                System.out.println("Thursday");
//                break;
            case 5:
                System.out.println("Friday");
//                break;
            case 6:
                System.out.println("Saturday");
//                break;
            default:
                System.out.println("Invalid input");
        }
    }
    
}
