package ETC;

public class 우테코4 {
    public static void main(String[] args) {
        int[][] board = {{2,3},
                {4,1}};

        System.out.println(solution(2,board));


    }

    public static int solution(int n, int[][] board) {

        int search = 1;
        int movePoint = n*n;
        int[] nowLocation = new int[]{0, 0};
        while (search <= n * n) {
            int[] findLocation = getLocation(board, search); // 지워야할 위치의 좌표
            movePoint += getMove(nowLocation, findLocation, n);
            search++;
            nowLocation = findLocation;
        }
        return movePoint;
    }

    private static int getMove(int[] nowLocation, int[] findLocation, int n) {
        int x1 = Math.abs(nowLocation[0] - findLocation[0]);
        int x2 = Math.min(nowLocation[0] + n - findLocation[0], n - nowLocation[0] + findLocation[0]);
        int y1 = Math.abs(nowLocation[1] - findLocation[1]);
        int y2 = Math.min(nowLocation[1] + n - findLocation[1], n - nowLocation[1] + findLocation[1]);

        return Math.min(x1, x2) + Math.min(y1, y2);
    }

    public static int[] getLocation(int[][] board, int search) {
        int len = board.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == search) {
                    return new int[]{j, i};
                }


            }
        }
        return new int[]{0, 0};

    }
}
