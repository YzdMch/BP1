package com.java;

import java.util.Scanner;

public class Conditional {

    public static void main(String args[]) {
        
           // Conditional Statement
        System.out.println("=====CONDITIONAL STATEMENT=====");
        
        {       // IF
        System.out.println("==IF==");
        
        int a = 11;
        //disini nilai awal a adalah 11
        if (a > 10) {
            System.out.println("10 lebih kecil dari " + a); }
        /* code diatas akan dieksekusi dengan pesan "10 lebih besar dari 11"
           karena integer a lebih dari 10 dan sesuai dengan kondisi IF */
        
        a = 9;
        //disini nilai a diganti menjadi lebih kecil dari 10
        if (a > 10) {
            System.out.println("10 lebih Kecil dari " + a); }
         // dan jika nilai a kurang dari 10 maka tidak akan dieksekusi 
        }
         
        {       // IF ELSE
        System.out.println("==IF ELSE==");
        boolean lapar;
        // disini kita punya nilai boolean lapar
        Scanner kamuLapar = new Scanner(System.in);
        // dan ini adalah kode untuk mendeklarasi input True/False dari kondisi lapar
            System.out.print("Apakah anda lapar?? ");
            lapar = kamuLapar.nextBoolean();
            // ini adalah tempat untuk memasukan nilai True/False
            
        if (lapar == true) {
            System.out.println("Kamu harus makan soto di warkop angop dan pesan minum juga");
        } else {
            System.out.println("Kamu boleh tidur aja, kesehatanmu lohhh");
        }
        /*  Untuk kode diatas jika kita memasukkan nilai boolean true maka perintah if akan di eksekusi
            dan jika nilai boolean yang di input false maka yang di eksekusi adalah perintah else 
            dan kita tadi menambahkan code untuk input nilai true or false nya
        */
        }
        
        //SWITCH
        System.out.println("==SWITCH==");
        
        int bulan = 4;
        
        switch (bulan) {
        //Switch akan mengevaluasi nilai dari variabel bulan. Dalam hal ini, nilainya adalah 4.
        /*Setiap case memeriksa apakah nilai bulan cocok dengan nilai yang ditentukan. Jika cocok, 
          kode di dalam case tersebut akan dieksekusi.*/
        /*Setiap break menghentikan eksekusi lebih lanjut dari switch. Jika tidak ada break,
          eksekusi akan "menjatuh" ke case berikutnya (disebut fall-through). */
        // Kode default berfungsi unntuk misalnya jika nilai bulan tidak sesuai dengan 1-12
            case 1:
                System.out.println("Januari");
                break;
            case 2:
                System.out.println("Februari");
                break;
            case 3:
                System.out.println("Maret");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mei");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agustus");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("Desember");
                break;
            default:
                System.out.println("Bulan tidak valid");
                break;

        }
        
        
    }
}
