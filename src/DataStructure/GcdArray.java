package DataStructure;

import java.util.Arrays;

public class GcdArray {
    static int gcdArray(int[] a) {

        Arrays.sort(a);

        int gcdValue  = a[0];

        for(int i=1; i<a.length; i++){
            gcdValue = gcd(gcdValue,a[i]);
        }

        return gcdValue;

    }

    static int gcd(int x , int y){
        if(y ==0) {
            return x;

        }else {
            return gcd(y, x%y);
        }
    }

    public static void main(String[] args) {
        int [] a = { 6,12,18,36};

        System.out.println(gcdArray(a));
    }

}
