package 백준.그리디;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class MettingRoom{
    int start;
    int end;

    public MettingRoom(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class 회의실배정 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MettingRoom [] arr = new MettingRoom[sc.nextInt()];

        for(int i=0; i<arr.length; i++){
            int startTime = sc.nextInt();
            int endTime = sc.nextInt();
            arr[i] = new MettingRoom(startTime, endTime);
        }


        Arrays.sort(arr, new Comparator<MettingRoom>() {
            @Override
            public int compare(MettingRoom o1, MettingRoom o2) {
                int r = o1.end- o2.end;
                if(r == 0) {
                    r =o1.start-o2.start;
                }
                return r;
            }
        });


        int count =1;
        int first = 0;
        for(int i=1; i<arr.length; i++) {
            if(arr[first].end <= arr[i].start) {
                arr[first].end = arr[i].end;
                first = i;
                count++;
            }
        }

        System.out.println(count);

    }

}
