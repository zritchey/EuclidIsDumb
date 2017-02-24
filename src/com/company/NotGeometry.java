package com.company;

/**
 * Created by zr162 on 2/23/17.
 */
public class NotGeometry {

   public static int recurseYouEuclid(int a,int b){
        if (a<b){
            return recurseYouEuclid(b,a);
        }
        int r=a%b;
        if (r==0){
            return b;
        }
        return recurseYouEuclid(b,r);
    }
    public static int iterateEuclid(int a , int b) {
        if(b>a){
            int temp=a;
            a=b;
            b=temp;
        }
        int r = a % b;
        int step = -1;
        while (r != 0) {
            step++;
            if (step != 0) {
                a = b;
                b = r;
            }
            r = a % b;
        }
        return b;
    }
}
