package Polymorphism;

public class No_Legged extends Animal{
    //Declare variables
    final private int leg = 0;
    private String color, creep, poisonous;

    //Constructors
    public No_Legged() {
    }

    public No_Legged(String color, String creep, String poisonous) {
        this.color = color;
        this.creep = creep;
        this.poisonous = poisonous;
    }
    
    public No_Legged(String id, String name, float weight, int category, String color, String creep, String poisonous) {
        super(id, name, weight, category);
        this.color = color;
        this.creep = creep;
        this.poisonous = poisonous;
    }
    
    //Getters and Setters
    public int getCategory() {
       return category;
    }
    
    public void setCategory(int hello) {
        this.category = category;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCreep() {
        return creep;
    }

    public void setCreep(String creep) {
        this.creep = creep;
    }

    public String getPoisonous() {
        return poisonous;
    }

    public void setPoisonous(String poisonous) {
        this.poisonous = poisonous;
    }

    //Display to screen
    public void show() {
        System.out.println("Name: " + name + "; Id: " + id + "; Weight: " + weight + "; Category: " + category + "; Number of leg: " + leg + "; Color: " + color + "; Creep: " + creep + "; Poisonous: " + poisonous);
    }

    @Override
    public void contribute() {
        System.out.println("Good Bye!");
    }

}
