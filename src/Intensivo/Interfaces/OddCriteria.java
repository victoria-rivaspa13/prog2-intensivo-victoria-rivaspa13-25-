package Intensivo.Interfaces;

public class OddCriteria implements Criteria {

    @Override
    public boolean evaluate(double value) {
        return value % 2 != 0;
    }
}
