import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {
        int n;
        int []a= new int[100];
        Scanner ip=new Scanner(System.in);
        System.out.print("Nhap so sv :");
        do{
            System.out.print("\n so sv = ");
            n=ip.nextInt();
            if(n<=2||n>=71)
                System.out.print("nhap lai so sv !");
        }while (n<=2||n>=71);
        System.out.print("Nhap diem cua sv ");
        for(int i=1; i<=n; i++)
        do{
            System.out.print("\n  Sv "+i+" = ");
            i=ip.nextInt();
            if (i<0||i>10)
                System.out.print("\n nhap lai diem cua SV ");           
        }while (i<0||i>10);   
        int dem =0;
        for(int i=0;i<n;i++)
            if(i<4) 
                dem++;
        System.out.print("\n So sv co diem F: " +dem);
    }
}