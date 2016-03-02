/*
 * Эта прог-а заполняет матицу 7*4 случ. целыми числами [-5..5] и выводит индекс строки с наиб. произведением
    Автор Бредихин А.И.
*/

public class Task5 {
    
    public static void main(String[] args) {
        int [][] a;
        a=new int[7][4];
        int maxind, pr, maxpr, i,j;
        
        pr=1;
        maxpr=-1;
        maxind=0;
        
        for (i=0; i<7; i++) {
            for (j=0; j<4; j++) {
                a[i][j]=(int)(Math.random()*11)-5;
                pr=pr*a[i][j]; //proizv
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
            pr=Math.abs(pr);
            if (pr>maxpr) {
                maxpr=pr;
                maxind=i;
            }
            pr=1;
        }
        
        System.out.println("\n Макс. произв в строке "+maxind+" и оно равно по модулю "+maxpr);
        
        
    }
    
}
