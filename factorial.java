import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan utama (n): ");
        int n = input.nextInt();
        System.out.print("Masukkan pemangkatan (m): ");
        int m = input.nextInt();

        // Factorial
        int hasil_fact = 1;
        int temp_n = n;
        while (temp_n >= 1) {
            hasil_fact = hasil_fact * temp_n;
            temp_n = temp_n - 1;
        }

        // Pangkat
        int hasil_pangkat = 1;
        for (int i = 0; i < m; i++) {
            hasil_pangkat = hasil_pangkat * n;
        }

        System.out.println("n factorial = " + hasil_fact);
        System.out.println("n pangkat m = " + hasil_pangkat);
    }
}