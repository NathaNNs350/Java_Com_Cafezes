import java.util.Scanner;
public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sn = sc.nextInt();
        String bin = "";
        while(sn > 0){
            if(sn % 2 != 0){
                bin = 1 + bin;
            }else{
                bin = 0 + bin;
            }
            sn = sn / 2;
        }
        System.out.println(bin);
    }
}
