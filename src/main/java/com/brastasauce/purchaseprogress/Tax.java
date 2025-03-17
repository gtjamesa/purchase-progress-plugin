package com.brastasauce.purchaseprogress;

public class Tax
{
    private final static int TAX_RATE = 1;
    private final static int TAX_VALUE_CAP = 5000000;

    public static int calcTax(int value)
    {
        return Math.min((int) Math.floor(value * (TAX_RATE / 100)), TAX_VALUE_CAP);
    }
}
