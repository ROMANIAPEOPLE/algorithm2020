package 코드구현력기르기;

import java.util.*;
import java.util.stream.Collectors;

class Contents implements Comparator<Contents> {

    public static Map<Character, Double> ranks;

    char read;
    char rank;
    int col;
    int row;

    public Contents(char read, int col, int row) {
        this.read = read;
        this.col = col;
        this.row = row;
    }

    public Contents() {

    }

    public char getRead() {
        return read;
    }

    public void setRead(char read) {
        this.read = read;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public int compare(Contents c1, Contents c2) {
        double score = ranks.get(c1.getRank());
        double score2 = ranks.get(c2.getRank());

        if (score == score2) {
            if (c1.getRow() == c2.getRow()) {
                return c1.getCol() - c2.getCol();
            }
            return c1.getRow() - c2.getRow();
        }

        if (score > score2) {
            return -1;
        }
        return 1;
    }
}

public class 모든컨텐츠 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char value = 'A';
        Contents.ranks = new HashMap<>();

        //1. 등급별 평점 저장
        for (int i = 0; i < 5; i++) {
            Contents.ranks.put(value, sc.nextDouble());
            value++;
        }

        //2. 콘텐츠 저장
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Contents> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String read = sc.next();
            for (int j = 0; j < M; j++) {
                list.add(new Contents(read.charAt(j), i, j));
            }
        }

        for (int i = 0; i < N; i++) {
            String rank = sc.next();
            for (int j = 0; j < M; j++) {
                list.get(i * M + j).setRank(rank.charAt(j));
            }
        }

        List<Contents> listY = list.stream()
                .filter(contents -> contents.getRead() == 'Y')
                .sorted(new Contents())
                .collect(Collectors.toList());

        List<Contents> listO = list.stream()
                .filter(contents -> contents.getRead() == 'O')
                .sorted(new Contents())
                .collect(Collectors.toList());


        for(int i=0; i< listY.size(); i++) {
            System.out.print(listY.get(i).getRank());
            System.out.print(Contents.ranks.get(listY.get(i).getRank()));
            System.out.print( listY.get(i).getCol());
            System.out.print( listY.get(i).getRow());
            System.out.println();
        }
        for(int i=0; i< listO.size(); i++) {
            System.out.print(listO.get(i).getRank());
            System.out.print(Contents.ranks.get(listO.get(i).getRank()));
            System.out.print( listO.get(i).getCol());
            System.out.print( listO.get(i).getRow());
            System.out.println();
        }


    }
}
