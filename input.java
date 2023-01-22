import java.util.*;
public class input {
    //This is our input class, we use to to get the users input for the rock paper scissors game
    public static String getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a your input. \n 1 for Rock \n 2 for Paper \n 3 for Scissors");
        int input = scan.nextInt();
        String out = convert(input);
        return(out);
    }
    //This is our conversion class, this was a class that takes an int input and returns a String output of what move they chose
    public static String convert(int x){
        String output = "";
        if(x == 1){
            output = "Rock";
        }
        if(x == 2){
            output = "Paper";
        }
        if(x == 3){
            output = "Scissors";
        }
        return(output);
    }
    //This class is used to initialize a character and get all relevent information about that character
    public static player characterInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.next();
        System.out.println("Please enter your age: ");
        String age = scan.next();
        System.out.println("Please enter your height: ");
        int height = scan.nextInt();
        System.out.println("Please enter your political affiliation: ");
        String politics = scan.next();
        player p = new player(name, height, politics, height);
        return(p);
    }
}