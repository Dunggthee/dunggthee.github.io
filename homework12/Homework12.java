package homework12;

public class Homework12 {

    public static void main(String[] args) {
        for(int i=2;i<=9;i++){
            System.out.println("\nBảng cửu chương " +i);
            for(int j=1;j<=9;j++){
                System.out.println(i + "x" + j + " = " + (i * j));
            }
        }
    }
}