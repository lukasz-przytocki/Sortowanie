import java.util.Comparator;

public class SpeedComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        if(c1.getCpuSpeed()>c2.getCpuSpeed()){
            return 1;
        }else if (c1.getCpuSpeed()==c2.getCpuSpeed())
        return 0;
        else {
            return -1;
        }

    }
}
