public class cell {
   static int[][] cell(int[][] map) {
      int n = map.length;
      int m = map[0].length;
      int d[][] = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 0 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
      int[][] tmp = new int[n][m];
      for (int i = 0; i < map.length; i++) {
         for (int j = 0; j < map[i].length; j++) {
            int st = 0;
            for (int k = 0; k < 9; k++) {
               if (i + d[k][0] < n && i + d[k][0] >= 0 && j + d[k][1] < m && j + d[k][1] >= 0) {
                  if (map[i + d[k][0]][j + d[k][1]] == 0) {
                     st++;
                  }
               }
            }
            if (st < 5) {
               tmp[i][j] = 1;
            } else {
               tmp[i][j] = 0;
            }
         }
      }
      return tmp;
   }
}