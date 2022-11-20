package soal2;

import java.util.Scanner;

public class Soal2 {
    public static void jawaban(){
        try {
            Scanner numInput = new Scanner(System.in);

            /*
            cek apakah user memilih jumlah array random atau default(10 element)
             */
            System.out.println("Masukkan 10 angka untuk melakukan sorting");
            System.out.println("=========================================");
            int[] arrBilangan = new int[10];
            int no = 1;
            for (int i = 0;i < 10;i++){
                    System.out.print("Masukan angka ke-"+ no +" =");
                    int angkaTemp = numInput.nextInt();
                    arrBilangan[i] = angkaTemp;
                    no++;
            }

            System.out.println("Pilih metode sorting yang anda inginkan");
            System.out.println("1.Selection Sort");
            System.out.println("2.Bubble Sort");

            selectMetodeSort(arrBilangan);
        }catch (Exception e){
            System.out.println("Data yang dimasukan salah");
            jawaban();
        }
    }
    public  static void selectMetodeSort(int[] arrBilangan){
        System.out.print("Ketik 1 atau 2 :");
        try {
            Scanner numInput = new Scanner(System.in);
            int cekMetode = numInput.nextInt();
            if (cekMetode == 1){
                System.out.println("Anda memilih Selection Sort");
                selection(arrBilangan);
            } else if (cekMetode == 2) {
                System.out.println("Anda memilih Bubble Sort");
                bubble(arrBilangan);
            }else{
                System.out.println("Salah memilih angka");
                selectMetodeSort(arrBilangan);
            }
        }catch (Exception e){
            System.out.println("Salah memilih angka");
            selectMetodeSort(arrBilangan);
        }
    }

    public static void selection(int[] arrBilangan){
        for (int lasIndex = arrBilangan.length-1;lasIndex >= 0;lasIndex--){
            int indexTerbesar = 0;
            for (int i = 1;i <= lasIndex;i++){
                if (arrBilangan[i] > arrBilangan[indexTerbesar]){
                    indexTerbesar = i;
                }
            }
            swapSelection(arrBilangan,indexTerbesar,lasIndex);


        }
        for (int i = 0;i < arrBilangan.length;i++){
            System.out.println(arrBilangan[i]);
        }
    }

    public static void swapSelection(int[] arrBilangan,int i,int j){
        int temp = arrBilangan[i];
        arrBilangan[i] = arrBilangan[j];
        arrBilangan[j] = temp;
    }

    public static void bubble(int[] arrBilangan){
        //bubble sort
        for (int lasIndex = arrBilangan.length-1;lasIndex >= 0;lasIndex--){
            for (int i = 0;i < lasIndex;i++){
                if (arrBilangan[i] > arrBilangan[i+1]){
                    swap(arrBilangan,i,i+1);
                }
            }
        }


        for (int i = 0;i < arrBilangan.length;i++){
            System.out.println(arrBilangan[i]);
        }
    }



    public static void swap(int[] arrBilangan,int i,int j){
        int temp = arrBilangan[i];
        arrBilangan[i] = arrBilangan[j];
        arrBilangan[j] = temp;
    }



}
