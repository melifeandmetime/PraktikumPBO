package com.aldiyoga.praktikumpbo.pertemuan4.kendaraan;

public class Bis extends Kendaraan{
    int dayaAngkut;
    
    public void belok(String arah){
        System.out.println("Bis " + nama + " belok ke " + arah + "!");
    }
    
    public void belok(){
        System.out.println("Error : Mohon masukkan arah!");
    }
    
    public void extraInfo(){
        System.out.println("Daya Angkut Bis : " + dayaAngkut + " org");
    }
}
