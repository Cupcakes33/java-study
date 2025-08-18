package org.formatter;

import java.text.DecimalFormat;

public class formatterEx2 {
    public static void main(String[] args) {
        double num = 1234567.0123;

        String str1 = String.valueOf(num);

        String integerPartStr;
        String fractionalPartStr = "";

        int decimalPointIndex = str1.indexOf(".");

        if (decimalPointIndex != -1) {
            integerPartStr = str1.substring(0, decimalPointIndex);
            fractionalPartStr = str1.substring(decimalPointIndex + 1);
        } else {
            integerPartStr = str1;
        }

        long integerPart =  Long.parseLong(integerPartStr);
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedIntegerPart = decimalFormat.format(integerPart);

        String result = formattedIntegerPart + "." + fractionalPartStr;
        System.out.println(result);
    }


}
