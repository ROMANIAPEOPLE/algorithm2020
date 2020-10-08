package DataStructure;

public class primeNumber {
    public static void main(String[] args) {
        boolean [] primeNumber = new boolean[101];

        primeNumber[0] = true;
        primeNumber[1] = true;

        for(int i=2; i<primeNumber.length; i++){
            for(int j=i*i; j<primeNumber.length; j+=i) {
                primeNumber[j] = true;
            }
        }

        for(int i=0; i<primeNumber.length; i++){
            if(!primeNumber[i]) {
                System.out.println(i);
            }
        }

    }
}
