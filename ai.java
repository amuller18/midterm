import java.util.Random;
public class ai {
    //This class generates a move for the computer to use against the user
    public static String Move(){
        Random ran = new Random();
        int val = 0;

        val = ran.nextInt(1, 3);

        if (val == 1){
            return "Scissors";
        }
        if (val == 2){
            return "Paper";
        }
        else{
            return "Rock";
        }


    }
}
