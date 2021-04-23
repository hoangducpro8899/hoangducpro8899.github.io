package Polymorphism;

public class ManagingProgram {
    
    public static void main(String[] args) {
        // Add choice to menu
        Menu menu = new Menu();
        Menu menu2 = new Menu();
        menu.add("Load data from file");
        menu.add("Add new animal");
        menu.add("Update animal information");
        menu.add("Delete animal");
        menu.add("Search animal");
        menu.add("Show animals in list");
        menu.add("Write data to file");
        menu.add("Exit");
        
        // Managing program
        int choice, choice1, choice2, choice3;
        AnimalList list = new AnimalList();
        String fName = "SE140619.txt";
        do {
            System.out.println("-<>-<>-<>- ANIMAL MANAGER -<>-<>-<>-");
            choice = menu.getChoice();
            boolean cont = true;
            // User choice
            switch(choice) {
                case 1: list.readFile(fName);
                        list.printAll();
                        break;
                case 2: do {
                            menu2.remove(menu2);
                            System.out.println("\n----- Add animal menu -----");
                            menu2.add("Add new 0-legged animals");
                            menu2.add("Add new bipedal and flightness animals");
                            menu2.add("Add new bipedal and flying animals");
                            menu2.add("Add new 4-legged animals");
                            menu2.add("Exit add menu");
                            choice1 = menu2.getChoice();
                            switch(choice1) {
                                case 1: list.add0Leg();
                                        break;
                                case 2: list.addBipedal();
                                        break;
                                case 3: list.addBipedalFlying();
                                        break;
                                case 4: list.add4Leg();
                                        break;
                            }
                        } while (choice1 != 5);
                        System.out.println("");
                        break;
                case 3: list.update();
                        break;
                case 4: list.remove();
                        break;
                case 5: do {
                            menu2.removeAll(menu2);
                            System.out.println("\n-----Search Menu-----");
                            menu2.add("Search animals by Name");
                            menu2.add("Search animals by Weight");
                            menu2.add("Exit search menu");
                            choice2 = menu2.getChoice();
                            switch(choice2) {
                                case 1: list.searchName();
                                        break;
                                case 2: list.searchWeight();
                                        break;
                            }
                        } while (choice2 != 3);
                        System.out.println("");
                        break;
                        
                case 6: do {
                            menu2.removeAll(menu2);
                            System.out.println("\n-----Show Animal List-----");
                            menu2.add("Show animals by type");
                            menu2.add("Show all animals in list");
                            menu2.add("Exit show menu");
                            choice3 = menu2.getChoice();
                            switch(choice3) {
                                case 1: list.printType();
                                        break;
                                case 2: list.printAll();
                                        break;
                            }
                        } while (choice3 != 3);
                        System.out.println("");
                        break;
                case 7:list.SaveToFile(fName);
                        break;
                case 8:System.out.println("---------- GOOD BYE ----------");
                        cont = false;
                        break;
            }
        } while (choice != 8);
    }
    
}
