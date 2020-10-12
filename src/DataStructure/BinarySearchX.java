package DataStructure;

public class BinarySearchX {

    static int binSearchX(int [] a , int n , int key) {
        int first = 0;
        int last = n-1;
        int temp = 0;

        if(a[first] == key){
            return first;
        }


        do {
            int center = (last+first)/2;


            if( a[center] == key) {
                temp = center;

                last = center-1;
                if(a[last] == key) {
                    temp = last;
                }



            }else if ( a[center] < key) {
                first = center+1;
            }else{
                last = center-1;
            }

        }while(first <= last );


        return temp;
    }

    public static void main(String[] args) {

        int [] a = {1,1,7,1,1,7,7,8,8,9,9};
        int n = a.length;
        int key = 7;
        System.out.println(binSearchX(a,n,key));

        System.out.println("??");
    }
}