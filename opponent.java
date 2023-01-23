import java.util.Random;

public class opponent {
    private static String Name;
    private static int Age;
    private static String Species;
    private static boolean Wealthy;

    
    private String names[] = {"Jeremy", "Steve", "Jerome", "Burger"};
    private String DifSpecies[] = {"Dog", "Narwal", "Man" , "Elephant"};

    Random ran = new Random();
//This class choses a random opponent
public opponent(){
    int rand = ran.nextInt(0,3);
    Name = names[rand];

    int rand1 = ran.nextInt(0,200);
    Age = rand1;

    int rand2 = ran.nextInt(0,3);
    Species = DifSpecies[rand2];

    int rand3 = ran.nextInt(0,1);
    if(rand3 == 0){
        Wealthy = false;
    } else {
        Wealthy = true;
    }

}
//This class returns one of the insults
public static String line1(String n){
    return "I see that your name is " + n + " That is embarrassing";
}
//This class returns an age insult
public static String line2(int a){
    if (a >= Age){
        return "You are so old, you walked into an antique shop and they sold you.";
    } else {
        return "It is impossible to underestimate you.";
    }
}
// this class returns a poor insult
public static String line3(){
    return "Your so poor I wouldnt be suprised if you created a gmail account just so you could eat the spam.";
}
// this class returns a height insult
public static String line4(int h){
    if ( h < 180){
        return "You're so short, when it rains you are always the last one to know.";
    } else {
        return "What’s the difference between a clown and a tall person? Their shoe store.";
    }
}
// this class returns a political insult
public static String line5( String p){
    if (p == "Republican"){
        return "If Abraham Lincoln could see what’s happened to the Republican Party, he would be the oldest man alive.";
    } else {
        return "How do you confuse a Liberal? You don't. They're born that way.";
    }

}



}
