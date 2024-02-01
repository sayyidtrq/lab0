import java.util.Scanner;
public class nilai {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan Nama Mahaiswa: ");String nama = input.nextLine();
        System.out.printf("Masukan Nilai Asli: ");double nilai = input.nextDouble();
        System.out.printf("Masukan Durasi: ");double durasi = input.nextDouble();
        double nilai_akhir = 0;
        if (durasi < 60){
             nilai_akhir = 1.2 * nilai;
        }
        else if(durasi >= 60 && durasi <= 70){
             nilai_akhir= nilai;
        }
        else if(durasi >= 70 && durasi <= 90){
             nilai_akhir = 0.75 * nilai;
        }
        else if(durasi >= 90 && durasi <= 100){
             nilai_akhir = 0.5 * nilai;
        }
        else {
             nilai_akhir = 0.2 * nilai;
        }
    
        System.out.printf("Nama Mahasiswa: %s\n", nama + "mendapatkan nilai:" + (int) nilai_akhir);

    }
}