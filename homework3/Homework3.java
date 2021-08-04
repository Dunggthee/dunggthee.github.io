package homework3;
import java.util.Scanner;
public class Homework3 { 
    public static void main(String[] args)  { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Chiều cao tam giác: "); 
        int chieucao = sc.nextInt(); 
        for (int i = 1; i <= chieucao; i++) { 
            for (int j = chieucao; j >= i; j--) { 
                System.out.print(" "); 
            } 
            for (int j = 1; j <= i; j++) { 
                System.out.print(" "+j); 
            } 
            System.out.println(); 
        } 
    } 
} 