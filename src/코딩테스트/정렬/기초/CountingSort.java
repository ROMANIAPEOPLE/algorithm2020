package 코딩테스트.정렬.기초;

public class CountingSort {
    public static final int MAX_VALUE = 9;
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int [] temp = new int[MAX_VALUE+1];

        int len = arr.length;
        for(int i=0; i<len; i++){
            temp[arr[i]] +=1;
        }


        for(int i=0; i<=MAX_VALUE; i++){
            System.out.println();
            for(int j=0; j<temp[i]; j++){
                System.out.print(i+ " ");
            }
        }

    }
}
