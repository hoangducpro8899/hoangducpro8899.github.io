package Polymorphism;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AnimalList {
    private ArrayList<Animal> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public AnimalList(){
        super();
    }
    
    //Find if animal exist or not
    int find (String code) {
        for(int i=0 ; i<list.size() ; i++)
            if (code.equals(list.get(i).getId()))   //Get the id from the list -> Compare whether it is equal to the id entered or not
                return i;                           //Return the animal position
        return -1;
    }
    
    
    //Add to group of 0-legged animals
    public void add0Leg() {
        String newName, newId;
        String newColor, newCreep, newPoisonous;
        float newWeight;
        int newCate = 1;
        
        //Enter animal information
        int pos;
        System.out.println("\n----------Add new animal----------");
        
        do {
            System.out.print("Enter animal's ID: ");
            newId = sc.nextLine().toUpperCase();
            pos = find(newId);
            if (pos >= 0)
                System.out.println("Animal ID already exists");
        }while (pos >= 0 || newId.isEmpty());
        
        do {
            System.out.print("Enter animal's name: ");
            newName = sc.nextLine();
        } while (newName.isEmpty());
        
        do {
            System.out.print("Enter animal's weight: ");
            newWeight = sc.nextFloat();
            if (newWeight <= 0)
                System.out.println("Weight must more than 0");
        } while (newWeight <= 0);
        
        //Enter animal description
        System.out.println("*** Animal description ***");
        sc.nextLine();
        
        do {
            System.out.print("Enter animal's color: ");
            newColor = sc.nextLine();
        } while(newColor.isEmpty());
            
        do {
            System.out.print("Can this animal creep ?(yes/no) ");
            newCreep = sc.nextLine().toLowerCase();
            if (!newCreep.equalsIgnoreCase("Yes") && !newCreep.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
        } while (!newCreep.equalsIgnoreCase("Yes") && !newCreep.equalsIgnoreCase("No"));
                            
        do {
            System.out.print("Is this animal poisonous ?(yes/no) ");
            newPoisonous = sc.nextLine().toLowerCase();
            if (!newPoisonous.equalsIgnoreCase("Yes") && !newPoisonous.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
        } while (!newPoisonous.equalsIgnoreCase("Yes") && !newPoisonous.equalsIgnoreCase("No"));
            
        //Add animal to list
        list.add(new No_Legged(newId, newName, newWeight, newCate, newColor, newCreep, newPoisonous));
        System.out.println("--> Added successfully !!!\n");
    }
    
    
    //Add to group of Bipedal and Flightless animal
    public void addBipedal() {
        String newName, newId;
        String newSwing, newAppearance, newColor, newMovement;
        float newWeight;
        int newCate = 2;
        
        //Enter animal information
        int pos;
        System.out.println("\n----------Add new animal----------");
        
        do {
            System.out.print("Enter animal's ID: ");
            newId = sc.nextLine().toUpperCase();
            pos = find(newId);
            if (pos >= 0)
                System.out.println("Animal ID already exists");
        }while (pos >= 0 || newId.isEmpty());
        
        do {
            System.out.print("Enter animal's name: ");
            newName = sc.nextLine();
        } while (newName.isEmpty());
        
        do {
            System.out.print("Enter animal's weight: ");
            newWeight = sc.nextFloat();
            if (newWeight <= 0)
                System.out.println("Weight must more than 0");
        } while (newWeight <= 0);
            
        //Enter animal description
        System.out.println("*** Animal description ***");
        sc.nextLine();
        
        do {
            System.out.print("Enter animal's appearance: ");
            newAppearance = sc.nextLine();
        } while(newAppearance.isEmpty());
        
        do {
            System.out.print("Enter animal's color: ");
            newColor = sc.nextLine();
        } while(newColor.isEmpty());
        
        do {
            System.out.print("Enter animal's movement type: ");
            newMovement = sc.nextLine();
        } while(newMovement.isEmpty());
        
        do {
            System.out.print("Does this animal have Swings ?(yes/no) ");
            newSwing = sc.nextLine().toLowerCase();
            if (!newSwing.equalsIgnoreCase("Yes") && !newSwing.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
        } while (!newSwing.equalsIgnoreCase("Yes") && !newSwing.equalsIgnoreCase("No"));
            
        //Add animal to list
        list.add(new Bipedal_Flightless(newId, newName, newWeight, newCate, newAppearance, newColor, newMovement, newSwing));
        System.out.println("--> Added successfully !!!\n");
    }
    
    
    //Add to group of Bipedal and Flying animal
    public void addBipedalFlying() {
        String newName, newId;
        String newCharacter, newSwing, newFly;
        float newWeight;
        int newCate = 3;
        
        //Enter animal information
        int pos;
        System.out.println("\n----------Add new animal----------");
        
        do {
            System.out.print("Enter animal's ID: ");
            newId = sc.nextLine().toUpperCase();
            pos = find(newId);
            if (pos >= 0)
                System.out.println("Animal ID already exists");
        }while (pos >= 0 || newId.isEmpty());
        
        do {
            System.out.print("Enter animal's name: ");
            newName = sc.nextLine();
        } while (newName.isEmpty());
        
        do {
            System.out.print("Enter animal's weight: ");
            newWeight = sc.nextFloat();
            if (newWeight <= 0)
                System.out.println("--> Weight must more than 0");
        } while (newWeight <= 0);
            
        //Enter animal description
        System.out.println("*** Animal description ***");
        sc.nextLine();
        
        do {
            System.out.print("Enter animal's character: ");
            newCharacter = sc.nextLine();
        } while(newCharacter.isEmpty());
        
        do {
            System.out.print("Does this animal have Swings ?(yes/no) ");
            newSwing = sc.nextLine().toLowerCase();
            if (!newSwing.equalsIgnoreCase("Yes") && !newSwing.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
        } while (!newSwing.equalsIgnoreCase("Yes") && !newSwing.equalsIgnoreCase("No"));
        
        do {
            System.out.print("Does this animal can fly ?(yes/no) ");
            newFly = sc.nextLine().toLowerCase();
            if (!newFly.equalsIgnoreCase("Yes") && !newFly.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
        } while (!newFly.equalsIgnoreCase("Yes") && !newFly.equalsIgnoreCase("No"));
            
        //Add animal to list
        list.add(new Bipedal_Flying(newId, newName, newWeight, newCate, newCharacter, newSwing, newFly));
        System.out.println("--> Added successfully !!!\n");
    }
    
    
    //Add to group of 4-legged animals
    public void add4Leg() {
        String newName, newId;
        String newDanger, newFood, newRun, newGrowl;
        float newWeight;
        int newCate = 4;
        
        //Enter animal information
        int pos;
        System.out.println("\n----------Add new animal----------");
        
        do {
            System.out.print("Enter animal's ID: ");
            newId = sc.nextLine().toUpperCase();
            pos = find(newId);
            if (pos >= 0)
                System.out.println("Animal ID already exists");
            
        }while (pos >= 0 || newId.isEmpty());
        
        do {
            System.out.print("Enter animal's name: ");
            newName = sc.nextLine();
        } while (newName.isEmpty());
        
        do {
            System.out.print("Enter animal's weight: ");
            newWeight = sc.nextFloat();
            if (newWeight <= 0)
                System.out.println("Weight must more than 0");
        } while (newWeight <= 0);
            
        //Enter animal description
        System.out.println("*** Animal description ***");
        sc.nextLine();
        
        do {
            System.out.print("Enter animal's danger: ");
            newDanger = sc.nextLine();
        } while (newDanger.isEmpty());
        
        do {
            System.out.print("Enter animal's food: ");
            newFood = sc.nextLine();
        } while (newFood.isEmpty());
        
        do {
            System.out.print("Can this animal run ?(yes/no) ");
            newRun = sc.nextLine().toLowerCase();
            if (!newRun.equalsIgnoreCase("Yes") && !newRun.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
        } while (!newRun.equalsIgnoreCase("Yes") && !newRun.equalsIgnoreCase("No"));
        
        do {
            System.out.print("Can this animal growl ?(yes/no) ");
            newGrowl = sc.nextLine().toLowerCase();
            if (!newGrowl.equalsIgnoreCase("Yes") && !newGrowl.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
        } while (!newGrowl.equalsIgnoreCase("Yes") && !newGrowl.equalsIgnoreCase("No"));
            
        //Add animal to list
        list.add(new Four_Legged(newId, newName, newWeight, newCate, newDanger, newFood, newRun, newGrowl));
        System.out.println("--> Added successfully !!!\n");
    }
    
    //Update no legged animals
    public void update0Legged(int pos) {
        Animal pet = list.get(pos);
        No_Legged save = (No_Legged) pet;
        String newColor, newCreep, newPoisonous;
        sc.nextLine();
        
        System.out.print("Enter animal's color: ");
        newColor = sc.nextLine();
        if (newColor != null && !newColor.isEmpty())
            save.setColor(newColor);
        
        do {
            System.out.print("Can this animal creep ?(yes/no) ");
            newCreep = sc.nextLine().toLowerCase();
            if (!newCreep.equalsIgnoreCase("Yes") && !newCreep.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
            else
                save.setCreep(newCreep);
        } while (!newCreep.equalsIgnoreCase("Yes") && !newCreep.equalsIgnoreCase("No"));
                            
        do {
            System.out.print("Is this animal poisonous ?(yes/no) ");
            newPoisonous = sc.nextLine().toLowerCase();
            if (!newPoisonous.equalsIgnoreCase("Yes") && !newPoisonous.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
            else
                save.setPoisonous(newPoisonous);
        } while (!newPoisonous.equalsIgnoreCase("Yes") && !newPoisonous.equalsIgnoreCase("No"));
    }
    
    //Update bipedal and flightness animals
    public void updateBipedal(int pos) {
        Animal pet = list.get(pos);
        Bipedal_Flightless save = (Bipedal_Flightless) pet;
        String newAppearance, newColor, newMovement, newSwing;
        sc.nextLine();
        
        System.out.print("Enter animal's appearance: ");
        newAppearance = sc.nextLine();
        if (newAppearance != null && !newAppearance.isEmpty())
            save.setAppearance(newAppearance);
        
        System.out.print("Enter animal's color: ");
        newColor = sc.nextLine();
        if (newColor != null && !newColor.isEmpty())
            save.setColor(newColor);
        
        System.out.print("Enter animal's movement type: ");
        newMovement = sc.nextLine();
        if (newMovement != null && !newMovement.isEmpty())
            save.setMovement(newMovement);
                            
        do {
            System.out.print("Does this animal have Swings ?(yes/no) ");
            newSwing = sc.nextLine().toLowerCase();
            if (!newSwing.equalsIgnoreCase("Yes") && !newSwing.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
            else
                save.setSwing(newSwing);
        } while (!newSwing.equalsIgnoreCase("Yes") && !newSwing.equalsIgnoreCase("No"));
    }
    
    //Update bipedal and flying animals
    public void updateBipedalFlying(int pos) {
        Animal pet = list.get(pos);
        Bipedal_Flying save = (Bipedal_Flying) pet;
        String newCharacter, newSwing, newFly;
        sc.nextLine();
        
        System.out.print("Enter animal's character: ");
        newCharacter = sc.nextLine();
        if (newCharacter != null && !newCharacter.isEmpty())
            save.setCharacter(newCharacter);
        
        do {
            System.out.print("Does this animal have Swings ?(yes/no) ");
            newSwing = sc.nextLine().toLowerCase();
            if (!newSwing.equalsIgnoreCase("Yes") && !newSwing.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
            else
                save.setSwing(newSwing);
        } while (!newSwing.equalsIgnoreCase("Yes") && !newSwing.equalsIgnoreCase("No"));
                            
        do {
            System.out.print("Does this animal can fly ?(yes/no) ");
            newFly = sc.nextLine().toLowerCase();
            if (!newFly.equalsIgnoreCase("Yes") && !newFly.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
            else
                save.setFly(newFly);
        } while (!newFly.equalsIgnoreCase("Yes") && !newFly.equalsIgnoreCase("No"));
    }
    
    //Update four legged animals
    public void update4Legged(int pos) {
        Animal pet = list.get(pos);
        Four_Legged save = (Four_Legged) pet;
        String newDanger, newFood, newRun, newGrowl;
        sc.nextLine();
        
        System.out.print("Enter animal's danger: ");
        newDanger = sc.nextLine();
        if (newDanger != null && !newDanger.isEmpty())
            save.setDanger(newDanger);
        
        System.out.print("Enter animal's food: ");
        newFood = sc.nextLine();
        if (newFood != null && !newFood.isEmpty())
            save.setFood(newFood);
        
        do {
            System.out.print("Can this animal run ?(yes/no) ");
            newRun = sc.nextLine().toLowerCase();
            if (!newRun.equalsIgnoreCase("Yes") && !newRun.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
            else
                save.setRun(newRun);
        } while (!newRun.equalsIgnoreCase("Yes") && !newRun.equalsIgnoreCase("No"));
                            
        do {
            System.out.print("Can this animal growl ?(yes/no) ");
            newGrowl = sc.nextLine().toLowerCase();
            if (!newGrowl.equalsIgnoreCase("Yes") && !newGrowl.equalsIgnoreCase("No"))
                System.out.println("--> You must enter yes or no");
            else
                save.setGrowl(newGrowl);
        } while (!newGrowl.equalsIgnoreCase("Yes") && !newGrowl.equalsIgnoreCase("No"));
    }
    
    //Update animal information
    public void update() {
        if (list.size()==0) {
            System.out.println("--> The animal list is empty !!!\n");
            return;
        }
        
        String code;
        System.out.println("\n---------- UPDATE AN ANIMAL ----------");
        System.out.print("Enter ID of animal you want to update: ");
        code = sc.nextLine().toUpperCase();
        
        int pos = find(code);
        String newId, newName;
        Float newWeight;
        if (pos<0)
            System.out.println("--> Animal ID is not found !\n");
        else {
            list.get(pos).show();
            System.out.println("----- Enter New Information -----");
            System.out.print("Enter animal's name: ");
            newName = sc.nextLine();
            if (newName != null && !newName.isEmpty())
                list.get(pos).setName(newName);

            do {
                System.out.print("Enter animal's weight: ");
                newWeight = sc.nextFloat();
                if (newWeight <= 0)
                    System.out.println("--> Weight must more than 0");
            } while (newWeight <= 0);
            if (newWeight > 0)
                list.get(pos).setWeight(newWeight);
            
            if (list.get(pos).category == 1)
                update0Legged(pos);
            else if (list.get(pos).category == 2)
                updateBipedal(pos);
            else if (list.get(pos).category == 3)
                updateBipedalFlying(pos);
            else if (list.get(pos).category == 4)
                update4Legged(pos);
            
            System.out.println("\n--> Update successfully !!!");
            list.get(pos).show();
        }
    }
    
    
    //Delete animal by ID
    public void remove() {
        if (list.size()==0) {
            System.out.println("--> The animal list is empty !!!\n");
            return;
        }
        
        System.out.println("Press enter again to enter remove function !");
        sc.nextLine();
        String code;
        System.out.println("\n----- REMOVE AN ANIMAL -----");
        System.out.print("Enter ID of animal you want to remove: ");
        code = sc.nextLine().toUpperCase();
        
        int pos = find(code);
        int sure;
        if (pos<0)
            System.out.println("--> Animal ID is not found !");
        else {
            System.out.println("Are you sure you want to delete animal with ID " + code + " ?");
            System.out.print("Enter 0 to delete. Enter other number to cancel: ");
            sure = Integer.parseInt(sc.nextLine());
            if (sure == 0) {
                list.remove(pos);
                System.out.println("--> Removed successfully\n");
            }
            else
                System.out.println("--> Cancel deleted !!!\n");
        }
    }
    
    
    //Search animals by Name
    public void searchName() {
        String name;
        if (list.size()==0) {
            System.out.println("--> The animal list is empty !!!\n");
            return;
        }
        
        System.out.print("Enter name of animal you want to search: ");
        name = sc.nextLine();
        
        System.out.println("\n---------- LIST OF ANIMALS ----------");
        for (int i=0; i<list.size(); i++)
            if (name.equalsIgnoreCase(list.get(i).name)) {
                list.get(i).show();
            }
        
    }
    
    //Search animals by Weight
    public void searchWeight() {
        float weight;
        if (list.size()==0) {
            System.out.println("--> The animal list is empty !!!\n");
            return;
        }
        
        System.out.print("Enter weight of animal you want to search: ");
        weight = sc.nextFloat();
        
        System.out.println("\n---------- LIST OF ANIMALS ----------");
        for (int i=0; i<list.size(); i++)
            if (weight == list.get(i).weight) {
                list.get(i).show();
            }
    }
    
    
    //Show animals in list by type
    public void printType() {
        int type;
        if (list.size()==0) {
            System.out.println("--> The animal list is empty !!!\n");
            return;
        }
        
        do {
            System.out.print("Enter type of animal you want to show: ");
            type = sc.nextInt();
            if (type <= 1 || type >= 4) {
                System.out.println("No-Legged animals: Enter 1");
                System.out.println("Bipedal-Flightness animals: Enter 2");
                System.out.println("Bipedal-Flying animals: Enter 3");
                System.out.println("Four-Legged animals: Enter 4\n");
            }
        } while (type < 1 || type > 4);
        
        System.out.println("\n---------- LIST OF ANIMALS ----------");
        for (int i=0; i<list.size(); i++)
            if (type == list.get(i).category) {
                list.get(i).show();
            }
    }
    
    //Show all animals in list
    public void printAll() {
        if (list.size()==0) {
            System.out.println("--> The animal list is empty !!!\n");
            return;
        }
        
        System.out.println("\n---------- LIST OF ANIMALS ----------");
        for (int i=0; i<list.size(); i++)
            list.get(i).show();
        System.out.println("");
    }
    
    
    //Load information from file
    public void readFile(String fName) {
        //Read from file and load to UserList
        try {
            list.clear();
            File f = new File(fName);
            if (!f.exists()) return;
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details;
            
            while ((details=bf.readLine())!= null) {
                StringTokenizer stk = new StringTokenizer(details,", ");
                String newId = stk.nextToken();
                String newName = stk.nextToken();
                float newWeight = Float.parseFloat(stk.nextToken()) ;
                int newCate = Integer.parseInt(stk.nextToken());
                
                if (newCate == 1) {
                    String newColor = stk.nextToken();
                    String newCreep = stk.nextToken();
                    String newPoisonous = stk.nextToken();
                    list.add(new No_Legged(newId, newName, newWeight, newCate, newColor, newCreep, newPoisonous));
                } else if (newCate == 2) {
                    String newAppearance = stk.nextToken();
                    String newColor = stk.nextToken();
                    String newMovement = stk.nextToken();
                    String newSwing = stk.nextToken();
                    list.add(new Bipedal_Flightless(newId, newName, newWeight, newCate, newAppearance, newColor, newMovement, newSwing));
                } else if (newCate == 3) {
                    String newCharacter = stk.nextToken();
                    String newSwing = stk.nextToken();
                    String newFly = stk.nextToken();
                    list.add(new Bipedal_Flying(newId, newName, newWeight, newCate, newCharacter, newSwing, newFly));
                } else if (newCate == 4) {
                    String newDanger = stk.nextToken();
                    String newFood = stk.nextToken();
                    String newRun = stk.nextToken();
                    String newGrowl = stk.nextToken();
                    list.add(new Four_Legged(newId, newName, newWeight, newCate, newDanger, newFood, newRun, newGrowl));
                }
            }
            bf.close();;
            fr.close();
        } catch(Exception e) {
           System.out.println("ERROR: " + e);
        }
    }
    
    
    //Save to file
    public void SaveToFile(String fName) {
        if (list.size()==0) {
            System.out.println("--> The animal list is empty !!!\n");
            return;
        }
          
        try {
            File f = new File("SE140619.txt");
            FileWriter fw = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i=0; i<list.size(); i++) {
                if (list.get(i).category == 1) {
                    Animal pet = list.get(i);
                    No_Legged save1 = (No_Legged) pet;
                    bw.write(list.get(i).id + ", " + list.get(i).name + ", " + list.get(i).weight + ", " + list.get(i).category + ", " + 
                            save1.getColor() + ", " + save1.getCreep() + ", " + save1.getPoisonous() + "\n");
                }
                else if (list.get(i).category == 2) {
                    Animal pet = list.get(i);
                    Bipedal_Flightless save2 = (Bipedal_Flightless) pet;
                    bw.write(list.get(i).id + ", " + list.get(i).name + ", " + list.get(i).weight + ", " + list.get(i).category + ", " + 
                            save2.getAppearance() + ", " + save2.getColor() + ", " + save2.getMovement() + ", " + save2.getSwing() + "\n");
                }
                else if (list.get(i).category == 3) {
                    Animal pet = list.get(i);
                    Bipedal_Flying save3 = (Bipedal_Flying) pet;
                    bw.write(list.get(i).id + ", " + list.get(i).name + ", " + list.get(i).weight + ", " + list.get(i).category + ", " + 
                            save3.getCharacter() + ", " + save3.getSwing() + ", " + save3.getFly() + "\n");
                }
                else if (list.get(i).category == 4) {
                    Animal pet = list.get(i);
                    Four_Legged save4 = (Four_Legged) pet;
                    bw.write(list.get(i).id + ", " + list.get(i).name + ", " + list.get(i).weight + ", " + list.get(i).category + ", " + 
                            save4.getDanger() + ", " + save4.getFood() + ", " + save4.getRun() + ", " + save4.getGrowl() + "\n");
                }
            }
            bw.close();
            fw.close();
            
            System.out.println("--> Save to file successfull !!!\n");
        } catch(Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
    
}
