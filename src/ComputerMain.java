import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComputerMain {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();

        computers.add(new Computer("Intel", 2000, 4000));
        computers.add(new Computer("AMD", 4000, 6000));
        computers.add(new Computer("AMD", 4000, 8000));
        computers.add(new Computer("AMD", 3000, 10000));

        Collections.sort(computers);
        System.out.println(computers);
    }


}
