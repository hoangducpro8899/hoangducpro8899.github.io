package Polymorphism;

public class Bipedal_Flightless extends Animal {
    //Declare variables
    final private int leg = 2;
    private String apearance, color, movement;
    private String swing;

    //Constructors
    public Bipedal_Flightless() {
    }

    public Bipedal_Flightless(String id, String name, float weight, int category, String apearance, String color, String movement, String swing) {
        super(id, name, weight, category);
        this.swing = swing;
        this.apearance = apearance;
        this.color = color;
        this.movement = movement;
    }

    //Getters and Setters
    public String getApearance() {
        return apearance;
    }

    public void setApearance(String apearance) {
        this.apearance = apearance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }
    
    public String getSwing() {
        return swing;
    }

    public void setSwing(String swing) {
        this.swing = swing;
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
                            "; Swing: " + swing + "; Appearance: " + apearance + "; Color: " + color + "; Movement: " + movement);
    }

    @Override
    public void contribute() {
        System.out.println("Good Bye!");
    }
    
}
