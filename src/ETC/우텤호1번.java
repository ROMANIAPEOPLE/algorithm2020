package ETC;

public class 우텤호1번 {

    public static void main(String[] args) {
        String [] grades = {"B+","A0","C+"};
        int [] weight = {6,7,8};
        int threshold = 200;

        System.out.println(solution(grades,weight,threshold));
    }

    public static int solution(String [] grades, int [] weights, int threshold){
        int sum=0;
        int [] gradeArr = {10,9,8,7,6,5,4,3,0};
        String [] gradeAll = {"A+","A0","B+","B0","C+","C0","D+","D0","F"};

        for(int i=0; i<grades.length; i++){
            for(int j=0; j<gradeAll.length; j++){
                if(grades[i] == gradeAll[j]) {
                    sum+=weights[i] * gradeArr[j];
                }
            }
        }
        sum -=threshold;






        return sum;
    }

}
