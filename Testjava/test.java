package Testjava;

import java.util.Random;

// cellullar Automatic
public class test{
    public static void main(String[] args) {
        int[][] map = new int[10][100];
        Random ran = new Random();
        
        for(int i = 0 ; i < 10 ; i ++){
            for(int j = 0 ; j < 100 ; j++){
                System.out.print(ran.nextInt(2));
                map[i][j]=0;
            }
            System.out.println();
        }
    }
}

