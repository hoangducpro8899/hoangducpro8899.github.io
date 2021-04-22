package Polymorphism;

public class Four_Legged extends Animal {
    //Declare variables
    final private int leg = 4;
    private String danger, food;
    private String run, growl;

    //Constructors
    public Four_Legged() {
    }

    public Four_Legged(String danger, String food, String run, String growl) {
        this.danger = danger;
        this.food = food;
        this.run = run;
        this.growl = growl;
    }

    public Four_Legged(String id, String name, float weight, int category, String danger, String food, String run, String growl) {
        super(id, name, weight, category);
        this.danger = danger;
        this.food = food;
        this.run = run;
        this.growl = growl;
    }
    
    public String getDanger() {
        return danger;
    }

    public void setDanger(String danger) {
        this.danger = danger;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getGrowl() {
        return growl;
    }

    public void setGrowl(String growl) {
        this.growl = growl;
    }

    public int getCategory() {
        return category;
    }

    //Getters and Setters
    public void setCategory(int category) {    
        this.category = category;
    }

    //Display to screen
    public void show() {
        System.out.println("Name: " + name + "; Id: " + id + "; Weight: " + weight + "; Category: " + category + "; Number of leg: " + leg + "; Danger: " + danger + "; Food: " + food + "; Run: " + run + "; Growl: " + growl);
    }
    
    @Override
    public void contribute() {
        System.out.println("Good Bye!");
    }
    
}

