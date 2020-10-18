/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * KELAS     : IF2 
 * NIM       : 10119043 
 * DESKRIPSI : Program ini berisi program untuk memasukan nilai dari keyboard
 */
public class PBOIF210119043Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda " + nama);
    }
    
}
