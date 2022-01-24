package com.pattern.arrangeactassert;

public class Cash {
    private int amount;

    public Cash(int amount) {
        this.amount = amount;
    }
    void plus(int addend){
        amount += addend;
    }
    boolean minus(int subtrahend) {
        if (amount >= subtrahend) {
            amount -= subtrahend;
            return true;
        } else {
            return false;
        }
    }

    int count() {
        return amount;
    }
}
