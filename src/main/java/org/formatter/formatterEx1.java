package org.formatter;

import java.text.DecimalFormat;

public class formatterEx1 {
    public static void main(String[] args) {
        double number = 123456789.012;

        String[] patterns = {
                "0", // 10진수, 값이 없을때는 0
                "#", // 10진수
                "0.0", // 소수점
                "#.#",
                "00000000.0000",
                "########.####",
                "#,###.#" // 몇개가 올지 모르니 오는 대로 다 찍어줘 같은건 안돼!
        };

        for(String pattern : patterns) {
            DecimalFormat df = new DecimalFormat(pattern);
            System.out.println(df.format(number));
        }
    }
}
