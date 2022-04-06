import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input, a, b, c, user;
        String NIK, nama;
        Scanner myBidang = new Scanner(System.in);
        System.out.println("Form Pendaftaran PT. Jaya");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        input = myBidang.nextInt();
        if (input == 1) {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Input NIK: ");
            NIK = myObj.nextLine();
            System.out.print("Input Nama: ");
            nama = myObj.nextLine();
            System.out.print("Input Nilai tes Tulis: ");
            a = myObj.nextInt();
            System.out.print("Input Nilai Tes Coding: ");
            b = myObj.nextInt();
            System.out.print("Input Nilai Wawancara: ");
            c = myObj.nextInt();
            AndroidDevelopment andro = new AndroidDevelopment(NIK, nama, a, b, c);
            andro.setNilai(a, b, c);
            andro.perhitunganNilai();
            user = subMenu();
            while (user != 3) {
                switch (user) {
                    case 1:
                        System.out.println("Form Edit : ");
                        System.out.print("Input Nilai tes Tulis: ");
                        a = myBidang.nextInt();
                        System.out.print("Input Nilai Tes Coding: ");
                        b = myBidang.nextInt();
                        System.out.print("Input Nilai Wawancara: ");
                        c = myBidang.nextInt();
                        andro.setNilai(a, b, c);
                        andro.perhitunganNilai();
                        break;
                    case 2:
                        andro.status();
                        break;
                    default:
                        System.out.println("Not Valid");
                        break;
                }
                if (user != 3) {
                    user = subMenu();
                }
            }
        } else {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Input NIK: ");
            NIK = myObj.nextLine();
            System.out.print("Input Nama: ");
            nama = myObj.nextLine();
            System.out.print("Input Nilai tes Tulis: ");
            a = myObj.nextInt();
            System.out.print("Input Nilai Tes Coding: ");
            b = myObj.nextInt();
            System.out.print("Input Nilai Wawancara: ");
            c = myObj.nextInt();
            WebDevelopment web = new WebDevelopment(NIK, nama, a, b, c);
            web.setNilai(a, b, c);
            web.perhitunganNilai();
            user = subMenu();
            while (user != 3) {
                switch (user) {
                    case 1:
                        System.out.println("Form Edit : ");
                        System.out.print("Input Nilai tes Tulis: ");
                        a = myBidang.nextInt();
                        System.out.print("Input Nilai Tes Coding: ");
                        b = myBidang.nextInt();
                        System.out.print("Input Nilai Wawancara: ");
                        c = myBidang.nextInt();
                        web.setNilai(a, b, c);
                        web.perhitunganNilai();
                        break;
                    case 2:
                        web.status();
                        break;
                    default:
                        System.out.println("Not Valid");
                        break;
                }
                if (user != 3) {
                    user = subMenu();
                }
            }
        }
    }

    public static int subMenu() {
        int input;
        Scanner myBidang = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Edit");
        System.out.println("2. Tampil");
        System.out.println("3. Exit");
        System.out.print("Pilih  : ");
        input = myBidang.nextInt();
        return input;
    }
}