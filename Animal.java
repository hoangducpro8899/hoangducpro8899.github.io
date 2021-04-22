package Polymorphism;

public abstract class Animal implements AnimalAction {
    //Declare variables
    String id, name;
    float weight;
    int category;

    //Constructors
    public Animal() {
    }

    public Animal(String id, String name, float weight, int category) {
        this.name = name;
        this.id = id;
        this.weight = weight;
        this.category = category;
    }

    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
    
    //Display animal information
    public void showAnimal() {
        System.out.println("Name: " + name + "; Id: " + id + "; Weight: " + weight + "; Category: " + category);
    }
    
    //Create data for writting to file
    public String storeAnimal() {
        return id + ", " + name + ", " + weight + ", " + category + ", ";
    }
    
}

