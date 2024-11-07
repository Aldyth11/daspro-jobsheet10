import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    int baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    int kolom = sc.nextInt();
                    sc.nextLine(); 

                    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                        penonton[baris][kolom] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                    } else {
                        System.out.println("Posisi baris atau kolom tidak valid.");
                        break;
                    }
                   

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String namaPenonton = penonton[i][j];
                            if (namaPenonton != "***") {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + namaPenonton);
                            } else {
                                System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": (kosong)");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }
        }
    }
}
