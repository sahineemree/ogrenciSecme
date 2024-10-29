import java.util.*;

public class ogrenciSecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Seçmek istediğiniz öğrenci sayısını giriniz : ");
        int n = input.nextInt();

        for (int j = 0 ;  j < n ; j++){
            int random = (int) (2023100 + Math.random() * 301);
            System.out.println((j+1) + ". öğrenci " + random + " numaralı öğrenci. Tebrikler!!");
        }
    }
}