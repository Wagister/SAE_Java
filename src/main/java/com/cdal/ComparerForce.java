package main.java.com.cdal;
import java.util.Comparator;

public class ComparerForce implements Comparator<Participant> {

    @Override
    public int compare(Participant o1, Participant o2) {
        int val1 = o1.getForce();
        int val2 = o2.getForce();
        return val2 - val1;
    }
}