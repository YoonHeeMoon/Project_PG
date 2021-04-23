package Test-java;

import java.util.Random;

// cellullar Automatic
public static class test{
    public static void main(String[] args) {
        int[][] map = new int[50][50];
        Random ran = new Random();
        
        for(int i = 0 ; i < 50 ; i ++){
            for(int j = 0 ; j < 50 ; j++){
                System.out.println(ran.nextInt(1));
                
                map[i][j]=0;
            }
        }
    }
}

