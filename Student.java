
import java.util.Scanner;
public class Student {
    private String hoTen, lop;
    private double diemToan, diemLy, diemHoa;
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên sinh viên: ");
        hoTen = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        lop = scanner.nextLine();
        System.out.println("Nhập điểm toán: ");
        diemToan = scanner.nextDouble();
        System.out.println("Nhập điểm lý: ");
        diemLy = scanner.nextDouble();
        System.out.println("Nhập điểm hóa: ");
        diemHoa = scanner.nextDouble();
    }
    public double tinhDiemTrungBinh(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public String xepLoaiHocLuc(double diemTB) {
        if (diemTB >= 8 && diemTB <= 10) {
            return "Giỏi";
        }
        if (diemTB >= 6.5 && diemTB < 8) {
            return "Khá";
        }
        if (diemTB >= 5.0 && diemTB < 6) {
            return "Trung bình";
        }
        if (diemTB >= 0.0 && diemTB < 5) {
            return "Yếu";
        }
        return "Nhập sai!";
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.nhap();
        System.out.println("Điểm trung bình 3 môn = " + student.tinhDiemTrungBinh(
                student.diemToan, student.diemLy, student.diemHoa));
        System.out.println(student.xepLoaiHocLuc(
                student.tinhDiemTrungBinh(student.diemToan, student.diemLy, student.diemHoa)));
    }
}
