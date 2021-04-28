import java.util.Random;

// cellullar Automatic
public class test{
    public static void main(String[] args) {
        int[][] map = new int[10][100];
        Random ran = new Random();
        
        for(int i = 0 ; i < 10 ; i ++){
            for(int j = 0 ; j < 100 ; j++){
                map[i][j]=ran.nextInt(2);
                System.out.print(map[i][j]==0?" ":"#");
            }
            System.out.println();
        }
    }
    static int[][] cell(int[][] map){
        int n = map.length;
        int m = map[0].length;
        int d[][] = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};
        int[][] tmp = new int[n][m];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                    int st = 0;
                    if(i-1)
                }
            }
        }
        return map;

    }
}

