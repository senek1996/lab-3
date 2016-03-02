/*
 * Эта прога выводит массив четных чисел от 2 до 20 в строку и в столбик
   Автор: Бредихин А.И.
*/

public class Task1 {
    
    public static void main(String[] args) {
    final int n=9;    
    int i;
    int[] a;
    a=new int[10];
    
        for (i=0; i<=n; i++) {
            a[i]=2*(i+1);
            System.out.print(a[i]+" ");
        }
    
        for (i=0; i<=n; i++) {
            System.out.print("\n"+a[i]);
        }
    }
    
}
