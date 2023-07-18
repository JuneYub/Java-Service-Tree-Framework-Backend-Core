package com.arms.juneyub;

public class Chappter4_ControlStatement {
    public void homework1() {
        int i = 0;
        while(i <= 10) {
            int j = 0;
            while(j <= 10) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }

    public void homework2() {
        int value = (int)( Math.random()*6+1 );
        System.out.println("value:"+value);
    }

    public void homework3() {
        String str = "12345";
        int sum = 0;
        for(int i=0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        System.out.println("sum="+sum);

    }
}
