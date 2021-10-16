/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ntp.ı;

import java.util.Scanner;
//Sca

public class NTPI {

    public static void main(String[] args) {

        /*System.out.println("Sayı gir paşa");
    Scanner variable1 = new Scanner(System.in);
    String number=variable1.next();

    System.out.println("variable: "+number); */
        //Sayı tek mi çift mi?
        System.out.println("Programa hoşgeldiniz :)");
        System.out.println("***Yükleniyor***");
        System.out.println("Lütfen test sayısını giriniz(pozitif tam sayı):");

        Scanner test = new Scanner(System.in);
        float number = test.nextFloat();

        if (number - (int) number != 0) {
            System.out.println("Lütfen tam sayı giriniz");
        } else if (number < 0) {
            System.out.println("Hata! Girmiş olduğunuz sayı negatiftir! Tekrar deneyiniz.");
        } else if (number % 2 == 0) {
            System.out.println("Sonuç: Girmiş olduğunuz sayı ÇİFTtir");
        } else {

            System.out.println("Sonuç: Girmiş olduğunuz sayı TEK'tir");
        }

    }

}
