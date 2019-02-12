
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author i14018
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double pinjaman ;
        double sukuBunga;
        int tenor;
        double biayaAdmin;
        
        System.out.print("Masukan nilai pinjaman: ");
        pinjaman = sc.nextDouble();
        //pinjaman = 320000000;
        System.out.print("Masukan nilai suku bunga: ");
        sukuBunga = sc.nextDouble();
        //sukuBunga = 16.8;
        System.out.print("Masukan nilai tenor: ");
        tenor = sc.nextInt();
        //tenor=12;
        System.out.print("Masukan nilai biaya admin: ");
        biayaAdmin = sc.nextDouble();
        //biayaAdmin=100000;
        
        System.out.println("");
        System.out.println("");
        KreditEfektif KE = new KreditEfektif(pinjaman,sukuBunga,tenor,biayaAdmin);
        System.out.println(KE.simulasi());
    }
}
