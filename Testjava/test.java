import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[][] map = new int[10][100];
        Random ran = new Random();
        cell c = new cell();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                map[i][j] = ran.nextInt(100);
                if(map[i][j]>45){
                    map[i][j]=0;
                }else{
                    map[i][j]=1;
                }
                System.out.print(map[i][j] == 0 ? " " : "#");
            }
            System.out.println();
        }
        System.out.println("#Gen1");
        map = c.cell(map);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(map[i][j] == 0 ? " " : "#");
            }
            System.out.println();
        }
        System.out.println("#Gen2");
        map = c.cell(map);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(map[i][j] == 0 ? " " : "#");
            }
            System.out.println();
        }
        System.out.println("#Gen3");
        map = c.cell(map);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(map[i][j] == 0 ? " " : "#");
            }
            System.out.println();
        }
    }
}