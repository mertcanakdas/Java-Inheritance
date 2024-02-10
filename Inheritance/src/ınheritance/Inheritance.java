
package ınheritance;

import java.util.Scanner;

public class Inheritance {


    public static void main(String[] args) {
       // Scanner ınput = new Scanner(System.in);
        calisan ali = new calisan();
        ali.boy = 1.82;
        ali.cinsiyet = "Erkek";
        ali.göz = "Ela";
        ali.isim = "Ali XXX";
        ali.kilo = 63.8;
        ali.sac = "Siyah";
        ali.yas = 22; 
        ali.gelir = 100;
        System.out.println(ali.gelir);
        ali.zam(31);
        System.out.println(ali.gelir);
        
        
        System.out.println(ali.isim+" "+ali.cinsiyet+" "+ali.göz+" "+ali.sac+" "+ali.boy+" "+ali.kilo+" "+ali.yas+" ");
       /* System.out.println("insanın boyunu giriniz:");
        ali.boy = ınput.nextDouble();
        
        System.out.println("insanın cinsiyetini giriniz:");
        ali.cinsiyet = ınput.next();
        
        System.out.println("insanın gözünü giriniz:");
        ali.göz = ınput.next();
        
        System.out.println("insanın adını giriniz:");
        ali.isim = ınput.next();
        
        System.out.println("insanın kilosunu giriniz:");
        ali.kilo = ınput.nextDouble();
        
        System.out.println("insanın saçını giriniz:");
        ali.sac = ınput.next();
        
        System.out.println("insanın yasını giriniz:");
        ali.yas = ınput.nextInt();
        
        System.out.println(ali.isim+" "+ali.cinsiyet+" "+ali.göz+" "+ali.sac+" "+ali.boy+" "+ali.kilo+" "+ali.yas);
        */
    }
    
}
