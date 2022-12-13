
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int pembilang, penyebut, hasil;
        System.out.print("Masukkan pembilang >> ");
        pembilang = input.nextInt();
        System.out.print("Masukkan penyebut >> ");
        penyebut = input.nextInt();
        if(penyebut == 0)
            System.out.println("Cannot divide by 0");
        else
        {
            hasil = pembilang / penyebut;
            System.out.println(pembilang + " / " + penyebut + " = " + hasil);
        }
    }
}
