package DataStructure;

public class lmcArray {

    static int gcd(int a, int b) {
        if(b==0) {
            return a;
        }else {
            return gcd(b, a%b);
        }
    }


    static int lcm(int a, int b ){
      return (a*b) / gcd(a,b);
    }

    static int solution(int [] a) {
        int lcmValue = a[0];

        for(int i=1; i<a.length; i++){
            lcmValue = lcm(lcmValue, a[i]);
        }
        return lcmValue;
    }


    public static void main(String[] args) {
        int [] a = {2,6,8,14};

        System.out.println(solution(a));

    }


}
