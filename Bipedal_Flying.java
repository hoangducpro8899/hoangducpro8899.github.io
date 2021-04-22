package Polymorphism;

public class Bipedal_Flying extends Animal {
    //Declare variables
    final private int leg = 2;
    private String character;
    private String swing, fly;

    //Constructors
    public Bipedal_Flying() {
    }

    public Bipedal_Flying(String id, String name, float weight, int category, String character, String swing, String fly) {
        super(id, name, weight, category);
        this.character = character;
        this.swing = swing;
        this.fly = fly;
    }
    
    //Getters and Setters
    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {    
        this.character = character;
    }

    public String getSwing() {
        return swing;
    }

    public void setSwing(String swing) {
        this.swing = swing;
    }

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
    
    //Display to screen
    public void show() {
        System.out.println("Name: " + name + "; Id: " + id + "; Weight: " + weight + "; Category: " + category + "; Number of leg: " + leg + 
                            "; Character: " + character + "; Swing: " + swing + "; Fly: " + fly);
    }

    @Override
    public void contribute() {
        System.out.println("Good Bye!");
    }
    
}
