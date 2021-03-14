package com.softserve.eugene.task_7;

public class NumericalSequenceValidator {
    public boolean sequenceLengthValidator(int number) {
            if (number <= 0) {
                System.err.println("Sequence length must be > 0");
                return false;
            }
            return true;
    }

    public boolean minimalSquareValidator(int number) {
            if (number < 0) {
                System.err.println("Minimal square must be >= 0");
                return false;
            }
            return true;
    }
}
