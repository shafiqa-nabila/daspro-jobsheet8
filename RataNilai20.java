import java.util.Scanner;
public class RataNilai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nilaiMhs, totalNilai, rataNilai;
        int i, j;

        i = 1;
        while(i <= 5) {
            System.out.println("Input Nilai Mahasiswa ke-" + i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " : ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata Rata Nilai Mahasiswa ke-" + i + " : " + rataNilai);
            i++;
    }
}
}


