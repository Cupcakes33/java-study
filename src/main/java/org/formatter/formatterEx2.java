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
    // 위 구현은 두 가지 큰 문제점이 있다. 재앙에 가까운 수준.
    // String.valueOf(num) 은 내부적으로 특정 크기 이상의 숫자를 E 표기법으로 변환한다.
    // 기준이 되는 숫자는 10의 7제곱. 고작 1천만 수준.
    // 만약 그 이상의 숫자가 대입되면 1.23456789012345E8 이런식으로 변환하기 때문에 모든 구현이 틀어진다.
    // 실행에 버그는 없지만 논리적으로 모순된 구현.
    // 가장 근본적인 해결책은 BigDecimal 클래스를 사용하는 것.


}
