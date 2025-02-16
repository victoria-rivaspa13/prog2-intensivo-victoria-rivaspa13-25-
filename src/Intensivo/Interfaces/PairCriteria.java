package Intensivo.Interfaces;

public class PairCriteria implements Criteria {
    @Override
    public boolean evaluate (double value) {
        return value % 2 == 0;
    }
}

