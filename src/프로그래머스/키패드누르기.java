package 프로그래머스;

public class 키패드누르기 {
    public  String solution(int [] n, String hand) {
        StringBuilder builder = new StringBuilder();
        int leftLocation = 10;
        int rightLocation = 12;

        for(int i=0; i<n.length; i++) {
            if(n[i] == 0) {
                n[i] = 11;
            }

            if(n[i] == 1 || n[i] == 4 || n[i] == 7) {
                builder.append("L");
                leftLocation = n[i];
            }
            else if(n[i] == 3 || n[i] == 6 || n[i] == 9){
                builder.append("R");
                rightLocation = n[i];
            }
            else { // 2, 5 , 8 , 0

                int left = getValue(leftLocation, n[i]);
                int right = getValue(rightLocation, n[i]);

                if(left > right) {
                    builder.append("R");
                    rightLocation= n[i];
                }else if(left < right) {
                    builder.append("L");
                    leftLocation = n[i];
                }else {
                    if(hand.equals("right")) {
                        rightLocation = n[i];
                        builder.append("R");
                    }
                    else {
                        leftLocation = n[i];
                        builder.append("L");
                    }
                }
            }


        }

        return builder.toString();



    }
    static int getValue(int handLocation, int value) {

        int handX = (handLocation-1)/3;
        int handY = (handLocation-1)%3;

        int valueX = (value-1)/3;
        int valueY= (value-1)%3;

        return Math.abs(handX-valueX)+ Math.abs(handY-valueY);

    }




        public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        키패드누르기 k = new 키패드누르기();
        System.out.println(k.solution(arr,hand));
    }
}

