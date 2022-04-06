public class WebDevelopment extends Penilaian {
    String NIK, nama;
    int tulis, coding, wawancara;

    public WebDevelopment(String NIK, String nama, int a, int b, int c) {
        setNIK(NIK);
        setnama(nama);
        setNilai(a, b, c);
    }

    // setter
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setNilai(int a, int b, int c) {
        this.tulis = a;
        this.coding = b;
        this.wawancara = c;
    }

    // getter
    public String getNIK() {
        return NIK;
    }

    public String getNama() {
        return nama;
    }

    public int getNilai() {
        return tulis + coding + wawancara;
    }

    @Override
    public void perhitunganNilai() {
        total = 0.4 * tulis + 0.35 * coding + 0.25 * wawancara;
    }

    @Override
    public void status() {
        if (total >= 85) {
            status = true;
        } else {
            status = false;
        }
        System.out.println("Nilai Akhir : " + total);
        if (status) {
            System.out.println("Keterangan : LOLOS");
            System.out.println("Selamat Kepada " + nama + "telah diterima sebagai Web Developer");
        } else {
            System.out.println("Keterangan : GAGAL");
            System.out.println("Maaf Kepada " + nama + "telah ditolak sebagai Web Developer");
        }
    }
}
