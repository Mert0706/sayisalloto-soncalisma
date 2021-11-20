package com.bilgeadam.sayisallotoson;

public class CokluSartOrnek {

    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2 = 35;

        int sayi3 = 41;

        // veya (or) operatörü ||
        // ve operatörü && ve sartında hepsini sağlaması gereklidir.
        if (sayi3==sayi1 || sayi3==sayi2){
            System.out.println("Tekrarlanan Sayı Var !");
        }


        while (sayi3 != sayi1 && sayi3 != sayi2){
            System.out.println("Sayi3 Diğerlerine Eşit Değil!");
            sayi3 = sayi1;
        }

    }


}
