package com.arms.juneyub;

public class Chappter3_Operator {
    public void homework1() {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A' 65 의 문자코드는
        System.out.print(" 1 + x << 33 → " );
        System.out.println(1 + x << 33);
        System.out.print(" y >= 5 || x < 0 && x > 2 → " );
        System.out.println(y >= 5 || x < 0 && x > 2);
        System.out.print(" y += 10 - x++ → " );
        System.out.println(y += 10 - x++);
        System.out.print(" x+=2 → " );
        System.out.println(x+=2);
        System.out.print(" !('A' <= c && c <='Z') → " );
        System.out.println( !('A' <= c && c <='Z') );
        System.out.print(" 'C'-c → " );
        System.out.println('C'-c);
        System.out.print(" '5'-'0' → " );
        System.out.println('5'-'0');
        System.out.print(" c+1 → " );
        System.out.println(c+1);
        System.out.print(" ++c → " );
        System.out.println(++c);
        System.out.print(" c++ → " );
        System.out.println(c++);
        System.out.print(" c → " );
        System.out.println(c);
    }

    public void homework2() {
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        char ch = 'A';
        ch = (char) (ch + 2);
        float f = 3f / 2;
        long l = 3000 * 3000 * 3000L;
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = (float)d==f2;
        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }

    public void homework3() {
        char ch = 'z';
        boolean b = ( ('a' <= ch &&  ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9') );
        System.out.println(b);
    }

    public void homework4() {
        char ch = 'A';
        char lowerCase = ( 'A' <= ch && ch <= 'Z' ) ? (char)(ch+32) : ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
