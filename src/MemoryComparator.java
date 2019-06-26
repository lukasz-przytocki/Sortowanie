import java.util.Comparator;

public class MemoryComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        if (c1.getRamMem() > c2.getRamMem()) {
            return 1;

        } else if (c1.getRamMem() == c2.getRamMem())

            return 0;
        else {


            return -1;
        }
    }
}

