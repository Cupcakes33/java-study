package org.array;

import java.util.*;

public class Bingo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BingoBoardParams bingoBoardParams = new BingoBoardParams();

        System.out.println("빙고 게임에 오신것을 환영합니다.");
        System.out.print("빙고판의 사이즈를 입력해주세요(예: 5 -> 5x5) : ");
        int tmp = scanner.nextInt();
        bingoBoardParams.setSize(tmp);

        System.out.print("빙고의 시작 숫자를 입력해주세요(예: 50 -> 50 ~ size*size) : ");
        int tmp2 = scanner.nextInt();
        bingoBoardParams.setStartNum(tmp2);

        int[][] bingo = generateBingoBoard(bingoBoardParams);

        int tmp3;
        do {
            printTwoDepthArr(bingo);
            System.out.println();
            System.out.print("숫자를 입력하세요 : ");
            tmp3 = scanner.nextInt();
            markBingoBoard(bingo, tmp3);
        } while (!isBingo(bingo));


    }

    static int[][] generateBingoBoard(BingoBoardParams bingoBoardParams){
        int size = bingoBoardParams.getSize();
        int length = size * size;
        int cnt = 0;
        int startNum = bingoBoardParams.getStartNum();

        int[] tmpArr = new int[length];
        for(int i=0; i<tmpArr.length; i++){
            tmpArr[i] = startNum;
            startNum++;
        }
        int[] shuffledArr = shuffle(tmpArr);

        int[][] bingoBoard = new int[size][size];

        for(int i = 0; i<size; i++){
            for(int j=0; j<size;j++){
                bingoBoard[i][j] = shuffledArr[cnt];
                cnt++;
            }
        }

        return bingoBoard;
    }

    static int[] shuffle(int[] intArr){
        ArrayList<Integer> list = new ArrayList<>(Arrays.stream(intArr).boxed().toList());
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    static void printTwoDepthArr(int[][] arr){
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    static void markBingoBoard(int[][] bingoBoard, int num){
        int bingoBoardSize = bingoBoard.length;
        for (int i = 0; i< bingoBoardSize; i++) {
            for(int j = 0; j< bingoBoardSize; j++) {
                if(bingoBoard[i][j] == num){
                    bingoBoard[i][j] = 0;
                }
            }
        }
    }

    static boolean isBingo(int[][] bingoBoard){
        int bingoBoardSize = bingoBoard.length;

        // 1. 가로 빙고
        for (int i = 0; i < bingoBoardSize; i++) {
            int rowCount = 0;
            for (int j = 0; j < bingoBoardSize; j++) {
                if (bingoBoard[i][j] == 0) {
                    rowCount++;
                }
            }
            if (rowCount == bingoBoardSize) {
                return true;
            }
        }

        // 2.세로 빙고
        for (int j = 0; j < bingoBoardSize; j++) {
            int colCount = 0;
            for (int i = 0; i < bingoBoardSize; i++) {
                if (bingoBoard[i][j] == 0) {
                    colCount++;
                }
            }
            if (colCount == bingoBoardSize) {
                return true;
            }
        }

        // 3. 대각선 빙고 (왼쪽 위 -> 오른쪽 아래)
        int diag1Count = 0;
        for (int i = 0; i < bingoBoardSize; i++) {
            if (bingoBoard[i][i] == 0) {
                diag1Count++;
            }
        }
        if (diag1Count == bingoBoardSize) {
            return true;
        }

        // 4. 대각선 빙고 (오른쪽 위 -> 왼쪽 아래)
        int diag2Count = 0;
        for (int i = 0; i < bingoBoardSize; i++) {
            if (bingoBoard[i][bingoBoardSize - 1 - i] == 0) {
                diag2Count++;
            }
        }
        if (diag2Count == bingoBoardSize) {
            return true;
        }

        return false;

    }




}

class BingoBoardParams {
    private int size;
    private int startNum;


    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public int getStartNum() {
        return startNum;
    }

    public void setStartNum(int startNum) {
        this.startNum = startNum;
    }
}
