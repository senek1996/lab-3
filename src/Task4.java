/*
 Эта прога выводит матрицу 5*8 из чисел [10..99]
 Автор: Бредихин А.И.
 */


public class Task4 {
      
    public static void main(String[] args) {
        int i,j,n=8,m=5;
        int[][] a;
        a=new int[9][6];
        for (i=1; i<=n; i++) {
            for (j=1; j<=m; j++) {
                a[i][j]=(int)(Math.random()*90)+10;
                System.out.print(a[i][j]+" ");
            }
           System.out.print("\n");
        }
    }
    
}
