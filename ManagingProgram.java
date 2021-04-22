package Polymorphism;

public class ManagingProgram {
    
    public static void main(String[] args) {
        // Add choice to menu
        Menu menu = new Menu();
        Menu menu2 = new Menu();
        menu.add("Load data from file");
        menu.add("Add new 0-legged animals");
        menu.add("Add new bipedal and flightness animals");
        menu.add("Add new bipedal and flying animals");
        menu.add("Add new 4-legged animals");
        menu.add("Update animal information");
        menu.add("Delete animal");
        menu.add("Search animal");
        menu.add("Show animals in list");
        menu.add("Write data to file");
        menu.add("Exit");
        
        // Managing program
        int choice, choice2, choice3;
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
                case 2: list.add0Leg();
                        break;
                case 3: list.addBipedal();
                        break;
                case 4: list.addBipedalFlying();
                        break;
                case 5: list.add4Leg();
                        break;
                case 6: list.update();
                        break;
                case 7: list.remove();
                        break;
                case 8: do {
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
                        
                case 9: do {
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
                case 10:list.SaveToFile(fName);
                        break;
                case 11:System.out.println("---------- GOOD BYE ----------");
                        cont = false;
                        break;
            }
        } while (choice != 11);
    }
    
}
