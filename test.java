import java.util.*;
public class test {

    static opponent op = new opponent();
    public static void main(String[] args) throws Exception {
        int wins = 0;

        

        Scanner scan = new Scanner(System.in);
        System.out.println("How many profiles would you like to create? ");
        int num = scan.nextInt() + 1;
        ArrayList<player> players = new ArrayList<>(num);
        for(int i = 1; i < num; i++){
            System.out.println("Generating user " + i);
            players.add(input.characterInput());
        }
        for (player x : players) {
            System.out.println(x);
        }
        while (play() != "Ai Wins"){
            System.out.println(play());
            wins += 1;
        } 
        


    }

    public static void lineOp(){
        Random line = new Random();
            int lineV = line.nextInt(0,4);
            if(lineV == 0){
                System.out.println(op.line1(player.getName()));
            }
            if(lineV == 1){
                System.out.println(op.line2(player.getAge()));
            }
            if(lineV == 2){
                System.out.println(op.line3());
            }
            if(lineV == 3){
                System.out.println(op.line4(player.getHeight()));
            }
            else{
                System.out.println(op.line5(player.getName()));
            }
    }
    
    //Play is our main method where 
    public static String play(){
        

        
        Scanner scan = new Scanner(System.in);
        String userInput = input.getInput();
        String aiInput = ai.Move();
        System.out.println("User: " + userInput);
        System.out.println("AI: " + aiInput);
        lineOp();
        if(userInput == aiInput){
            System.out.println("Tie Try again");
            play();
        }else if (userInput == "Scissors" && aiInput == "Rock"){
            return "AI Wins";
        }else if (userInput == "Rock" && aiInput == "Paper"){
            return("AI Wins");
        }else if (userInput == "Paper" && aiInput == "Scissors"){
            return "Ai Wins";
        }else if (userInput == "Scissors" && aiInput == "Paper"){
            return "User Wins";
        }else if (userInput == "Rock" && aiInput == "Scissors"){
            return "User Wins";
        }else if (userInput == "Paper" && aiInput == "Rock"){
            return("User Wins");
        }
        return("");
    }


    
}