package org.variable;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;

        // 유니코드 65 = A
        System.out.printf("%c=%d(%#X) %n",ch, code, code);

        char hch = '가';
        // 유니코드 44032 = 가
        System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch);
    }
}
