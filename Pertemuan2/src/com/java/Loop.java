package com.java;

public class Loop {

    public static void main(String args[]) {
        
                // WHILE
        System.out.println("=====WHILE=====");
        int a = 1;
        while (a <= 12) {
        /*Loop akan berjalan selama nilai a kurang dari atau sama dengan 12. 
        Kondisi ini akan dievaluasi pada setiap pengulangan, dan jika benar pernyataan di dalam loop akan dieksekusi.*/
            System.out.println(a + " Bulan"); 
            //Pada setiap pengulangan, nilai variabel a akan dicetak bersama dengan string " Bulan".
            a++;
            /*Ini adalah increment operator yang menambahkan 1 ke nilai a setelah setiap pengulangan, 
              sehingga pada pengulangan berikutnya, nilai a akan bertambah. */
        }
        
        
                // DO/WHILE
        System.out.println("=====DO/WHILE=====");
        int b = 1;
        do {
        // do akan dieksekusi terlebih dahulu, bahkan sebelum memeriksa kondisi.
            System.out.println(b + " Hari");
            b++;
        } while (b <= 7);
        /*Setelah progrm do dieksekusi, kondisi ini akan diperiksa. Jika benar, loop akan dijalankan lagi jika salah 
        loop akan berhenti.*/
        
                // FOR
        System.out.println("=====FOR=====");
        for(int i = 1; i <= 4; i++) {
        // (int i = 1) nilai awal dari integer i adalah 1
        // (i <= 4) kondisi agar loop berjalan adalah nilai i kurang atau sama dengan 4
        // (i++) akan menambahkan 1 pada setiap pengulangan 
            System.out.println(i + " Jam");
            // mencetak nilai i dengan menambahkan jam pada setia pengulangan 
        }
    }
}
