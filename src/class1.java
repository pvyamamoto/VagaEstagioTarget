import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 0;
        int num = 0;
        int[] v = new int[31];

        v[0] = 0;

        for(int i = 1; i < 31; i++){
            v[i] = a + b;
            c = b;
            b = a + b;
            a = c;
        }

        System.out.println("Insira um numero:");
        num = sc.nextInt();

        for(int i = 0; i < 31; i++){
            if(num == v[i]){
                System.out.println("O numero faz parte da sequencia");
                break;
            }
        }
    }
}