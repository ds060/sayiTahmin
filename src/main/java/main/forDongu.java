package main;

import java.util.Scanner;
import java.util.Random;


public class forDongu {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("sayı tahmin oyununa hoşgeldiniz!");
        System.out.println("Lütfen 1-100 arasında bir sayı giriniz:");
        int tahmin= input.nextInt();
        int sayi= rnd.nextInt(101);
        int tekrar=1;
        while(tahmin!=sayi){
            if (tahmin<0 || tahmin>100){
                System.out.println("1 ile 100 arasında bir değer giriniz!");
                tahmin=input.nextInt();}
                else if (tahmin<sayi){
                System.out.println("daha büyük bir sayı giriniz");
                tahmin=input.nextInt();
                }
                else {
                System.out.println("daha küçük bir sayı giriniz");
                tahmin=input.nextInt(); }
                tekrar++;
                        }
        System.out.println("Tebrikler," +tekrar+ ". tahminde kazandınız!");

    }
    }

