/*
 * Eta proga vivodit massiv nets tsisel o 1 do 99 tuda i obratno
 */

public class Task2 {

    public static void main(String[] args) {
        int i,n=49;
        int[] a;
        a=new int[50];
        for (i=0; i<=n; i++) {
            a[i]=2*(i+1)-1;
            System.out.print(a[i]+" ");
        }
        
        System.out.print("\n");
        
        for (i=n; i>=0; i--) {
            System.out.print(a[i]+" ");
        }
    }
    
}
