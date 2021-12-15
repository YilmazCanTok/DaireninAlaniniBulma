import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.println("Dairenin Alanını Bulan Program");
        System.out.println("------------------------------------------");
        System.out.print("Dairenin açısı : ");
        int acı = scanner.nextInt();
        double pi = 3.14;
        System.out.print("Dairenin yarıçapı : ");
        int yarıcap = scanner.nextInt();
        System.out.println("------------------------------------------");
        System.out.println("Dairenin Alanı = 2*π*r*sin(a)");
        double alan = (acı*pi*yarıcap*yarıcap)/360;
        System.out.println("Dairenin Alanı : "+alan);
        System.out.println("******************************************");
    }
}
