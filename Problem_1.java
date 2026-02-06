import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Valor de A");
        int a = sc.nextInt();
        System.out.println("Digite o Valor de B");
        int b = sc.nextInt();
        if(a != 0 || b != 0){
            if(a < b){
                while(a < b){
                    if (a % 2 != 0) {
                        System.out.println(a);
                    }
                    a=a+1;
                }
            }else{
                while(a > b){
                    if (a % 2 != 0) {
                        System.out.println(a);
                    }
                    a=a-1;
                }
            }
        }
    }
}