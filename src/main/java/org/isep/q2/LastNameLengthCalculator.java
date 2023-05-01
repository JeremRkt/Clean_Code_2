package org.isep.q2;

public class LastNameLengthCalculator implements LengthCalculator{
    @Override
    public int calculate(String string) {
        return string.length();
    }
}
