import java.util.*;

public class ComputerMain {
    final static String NAME = "name";
    final static String CPU = "cpu";
    final static String RAM = "ram";


    public static void main(String[] args) {


        List<Computer> computers = new ArrayList<>();

        computers.add(new Computer("Intel", 2000, 4000));
        computers.add(new Computer("AMD", 4000, 6000));
        computers.add(new Computer("AMD", 4000, 8000));
        computers.add(new Computer("AMD", 3000, 10000));

//        Collections.sort(computers);
        System.out.println(computers);
        comparationMethod(userIntercom(), computers);
        System.out.println(computers);

    }

    static String userIntercom(){
        String userSelection;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose sorting method: name, cup, ram");
        userSelection=scan.nextLine();
        return userSelection;
    }

    static void comparationMethod(String userSelection, List comp){
        SpeedComparator speedComparator = new SpeedComparator();
        MemoryComparator memoryComparator = new MemoryComparator();
        switch (userSelection){
            case NAME:
                 Collections.sort(comp);
                break;
            case CPU:
                comp.sort(speedComparator);
                break;
            case RAM:
                comp.sort(memoryComparator);
                break;
             default:
                 System.out.println("No valid selection");




        }
    }


}
