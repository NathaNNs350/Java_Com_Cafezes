import java.util.Objects;
import java.util.Scanner;
public class Problem_2 {
    public static void main(String[] args) {
        int tsv = 0;
        double tsr = 0;
        String op = null;
        Scanner sc = new Scanner(System.in);
        while(!Objects.equals(op, "FIM")){
            System.out.println("Digitar (FIM) Finaliza o Programa");
            System.out.println("Digite o nome do Funcionário");
            op = sc.nextLine();
            if(!Objects.equals(op, "FIM")){
                System.out.println("Digite seu Atual Salário");
                int sv = sc.nextInt();
                sc.nextLine();
                if (sv > 0 && sv <= 150) {
                    System.out.println("Funcionário: " + op + " | Salário Atual: " + sv + " | Salário Reajustado " + sv * 1.25);
                    tsr = tsr + sv * 1.25;
                } else if (sv > 150 && sv <= 300) {
                    System.out.println("Funcionário: " + op + " | Salário Atual: " + sv + " | Salário Reajustado " + sv * 1.20);
                    tsr = tsr + sv * 1.20;
                } else if (sv > 300 && sv <= 600) {
                    System.out.println("Funcionário: " + op + " | Salário Atual: " + sv + " | Salário Reajustado " + sv * 1.15);
                    tsr = tsr + sv * 1.15;
                } else if (sv > 600) {
                    System.out.println("Funcionário: " + op + " | Salário Atual: " + sv + " | Salário Reajustado " + sv * 1.10);
                    tsr = tsr + sv * 1.10;
                }
                tsv = tsv + sv;
            }else{
                System.out.println("Total de Salários antigos: " + tsv + "\nTotal de Salários Reajustados: " + tsr);
            }
        }
    }
}