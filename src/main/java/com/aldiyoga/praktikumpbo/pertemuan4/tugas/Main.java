package com.aldiyoga.praktikumpbo.pertemuan4.tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" === HANTU ===  ");
        System.out.println("   1. Pocong   ");
        System.out.println("   2. Kuntilanak   ");
        System.out.println("   3. Kuyang       ");
        System.out.println("   4. Keluar       ");
        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();
        System.out.println();
        Pocong pc = new Pocong();
        Hantu hu = new Hantu();
        Kuyang ky = new Kuyang();
        
        pc.nama = "Pocong";
        pc.jml = 2;
        pc.keadaan = "Malam";
        pc.ciriCiri = "Loncat-Loncat";
        
        hu.nama = "Kuntilanak";
        hu.keadaan ="Malam";
        hu.jml = 1;
        
        ky.nama = "Kuyang";
        ky.jml = 3;
        ky.keadaan = "Malam";
        ky.ciriCiri = "Terbang mencari mangsa";
        
        switch(pilihan){
            case 1:
               pc.disclaimer();
               pc.showInfo();
               pc.funFact();
               pc.extraInfo(); 
            break;
            
            case 2:
                hu.disclaimer();
                hu.showInfo();
            break;
            
            case 3:
               ky.disclaimer();
               ky.showInfo();
               ky.funFact();
               ky.extraInfo(); 
            break;
            
            case 4:
                System.out.println("Silahkan Keluar");
            break;
        }
    }
}

