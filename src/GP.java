import java.util.Scanner;


public class GP {


    int i;
    int size = 15;
    long[] gp = new long[size];
    int userStartingNumber;
    int commonRatio;
    int userChoice;
    int userChoice2;
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    String answer;


    public void create() {
//user's input
        System.out.println("\nWhat will be the starting term of the series?");
        userStartingNumber = scanner.nextInt();
        System.out.println("\nWhat will be the common ratio?");
        commonRatio = scanner.nextInt();
        if (userStartingNumber != 0 && commonRatio != 0) {
            for (i = 0; i < gp.length; i++) {

                gp[i] = userStartingNumber * (int) Math.pow(commonRatio, i);
//print all numbers in array
                System.out.println("The " + (i + 1) + " number of array is: " + gp[i]);
            }
        } else {
            System.out.println("\nThe  starting term and the common ratio must be no-zero numbers");
        }
    }

    public void findTerm() {
        System.out.println("\nWhat term do you want to find?  ");
        int userTerm = scanner.nextInt();
        if (userTerm <= gp.length) {
            System.out.println("\nThe " + userTerm + " term is: " + gp[userTerm - 1]);
        } else {
            System.out.println("You need to add more spaces to array ");
        }
    }

    public void getSize() {
        System.out.println("\nThe size of the geometric progression is " + gp.length);
    }

    public void add() {
        System.out.println("\nDo you need additional spaces in array(yes/no)?");
        answer = scanner2.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            long[] bigger = new long[gp.length * 2];
            for (i = 0; i < gp.length; i++) {
                bigger[i] = gp[i];
            }
            gp = bigger;
        }
        for (i = 0; i < gp.length; i++) {
            gp[i] = userStartingNumber * (int) Math.pow(commonRatio, i);
        }
        for (i = 0; i < gp.length; i++) {
            System.out.println("The " + (i + 1) + " number of the array is: " + gp[i]);
        }

    }


/*  public void update(){
    System.out.println("\nDo you want to update the data(yes/no)?");
    answer = scanner2.nextLine();
    if (answer.equalsIgnoreCase("yes")) {
    for (i = 0; i < gp.length; i++) {
     gp[i] = userStartingNumber * (int) Math.pow(commonRatio, i);}
     for (i = 0; i < gp.length; i++) {
     System.out.println("The " + (i + 1) + " number of array is: " + gp[i]);
      }
    } else {
            System.out.println("Thank you for using the program");
        }
 }*/

    public void deleteValue() {
        System.out.println("\n What number do you want to delete from the geometric progression array");
        userChoice = scanner.nextInt();
        long[] less = new long[gp.length - 1];
        int indexLess = 0;
        for (i = 0; i < gp.length; i++) {
            if (gp[i] != userChoice) {
                less[indexLess] = gp[i];
                indexLess++;
            } else {
                System.out.println("Please, choose the number from the geometric progression!");
            }
        }
        gp = less;
        for (i = 0; i < gp.length; i++) {
            System.out.println("The " + (i + 1) + " term of the array is: " + gp[i]);

        }
    }

    public void changeValue() {
        System.out.println("\nDo you want to change any number from the geometric progression array?(yes/no)");
        answer = scanner2.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("\nWhat term do you want to change?");
            userChoice = scanner.nextInt();
            System.out.println("\nPrint the new value");
            userChoice2 = scanner.nextInt();
            if (userChoice <= gp.length && userChoice2 != 0) {
                gp[userChoice] = userChoice2;
                for (i = 0; i < gp.length; i++) {
                    System.out.println("The " + (i + 1) + " term of the array is: " + gp[i]);
                }
            } else {
                System.out.println("Choose the term inside the array, and the new value must be no-zero number");
            }
        }
    }
}





