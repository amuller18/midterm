public class player {
    private static String name;
    private static int age;
    private static String political;
    private static int height;
    private String cPlayer;

    //This is our argument constructor for creating a player object
    public player(String name, int age, String species, int height){
        this.name = name;
        this.age = age;
        this.political = species;
        this.height = height; 
    }

    //Below are the setter and getter methods for all variables in this class. We also have the toString method below
    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public String toString(){
        return("Your character is: " + getName() + "\n Your age is: " + getAge() + "\n Your political affiliation is: " + getPolitical() + "\n Your height is: " + getHeight());
    }
}