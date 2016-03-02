/*
 * Эта прога выводит массив из 15 чисел от 0 до 9 и считает кол-во четных эл-ов.
   Автор: Бредихин А.И.
 */

public class Task3 {
    
    public static void main(String[] args) {
        int i,n=15, kolvo=0;
        int[] a;
        a=new int[16];
        for (i=1; i<=n; i++) {
            a[i]=(int)(Math.random()*10);
            if (a[i]%2==0) {kolvo++;}
            System.out.print(a[i]+" ");
        }
        System.out.print("\nЧетных чисел: "+kolvo);
    }
    
}
