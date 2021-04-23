package Testjava;

import java.util.Random;

// cellullar Automatic
public class test{
    public static void main(String[] args) {
        int[][] map = new int[10][100];
        Random ran = new Random();
        
        for(int i = 0 ; i < 10 ; i ++){
            for(int j = 0 ; j < 100 ; j++){
                map[i][j]=ran.nextInt(2);
                System.out.print(map[i][j]==0?"O":"8");
            }
            System.out.println();
        }
    }
}

