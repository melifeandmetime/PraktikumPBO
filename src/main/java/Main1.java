
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int pembilang, penyebut, hasil;
        System.out.print("Masukkan pembilang >> ");
        pembilang = input.nextInt();
        System.out.print("Masukkan penyebut >> ");
        penyebut = input.nextInt();
        hasil = pembilang / penyebut;
        System.out.println(pembilang + " / " + penyebut + " = " + hasil);
    }  
}
