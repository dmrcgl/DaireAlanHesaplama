package com.daire;

import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {

        int r ;
        double maö ;
        double pi = 3.14 ;
        double alan ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Yarı Çap Giriniz : ");
        r = sc.nextInt();

        System.out.println("Lütfen Merkez Açı Ölçüsü Giriniz : ");
        maö = sc.nextInt();

        alan = (pi* (r * r) * maö ) / 360 ;

        System.out.println("Daire Diliminin Alanı :" + alan);
    }
}
