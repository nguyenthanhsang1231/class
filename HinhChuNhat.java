import java.util.Scanner;

public class HinhChuNhat {
    public int chieuDai;
    public int chieuRong;
    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public HinhChuNhat() {

    }

    public int getChieuDai() {
        return chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
    int tinhDienTich() {
        return chieuDai * chieuRong;
    }
    int tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }
}
class Main2 {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai : ");
        hinhChuNhat.setChieuDai(scanner.nextInt());
        System.out.println("nhap chieu rong : ");
        hinhChuNhat.setChieuRong(scanner.nextInt());
        System.out.println("ket qua dien tich : " + hinhChuNhat.tinhDienTich());
        System.out.println("ket qua chu vi : " + hinhChuNhat.tinhChuVi());
    }
}


