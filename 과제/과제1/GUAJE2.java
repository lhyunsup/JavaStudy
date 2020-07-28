import java.util.Scanner;

public class GUAJE2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner (System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int sum = 0;

        if (a <= b) {
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

        else{
            for (int i = b; i <= a; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
