import java.util.Scanner;

public class class2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String plvr;
        int count = 0;

        System.out.println("Digite uma string:");
        plvr = sc.nextLine();

        for(int i = 0; i < plvr.length(); i++){
            if(plvr.charAt(i) == 'A' || plvr.charAt(i) == 'a'){
                count++;
            }
        }
        if(count > 0){
            System.out.println("A frase contem a letra A " + count +" vezes");
        }else
            System.out.println("A frase nao contem a letra A");
    }
}
