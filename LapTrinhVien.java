/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi40;
import java.util.Scanner;
public class LapTrinhVien extends NhanVien {
       Scanner scanner = new Scanner(System.in);
       private int soGioLamThem;

    public LapTrinhVien(int soGioLamThem) {
        super();
        this.soGioLamThem = soGioLamThem;
    }
    public LapTrinhVien() {
        super();
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap so gio lam them: ");
        soGioLamThem = scanner.nextInt();
    }
    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soGioLamThem * 200000;
        return this.luong;
    }
    @Override
    public String toString() {
        return super.toString() + "\n, so gio lam them: " + this.soGioLamThem + 
            ", luong: " + this.luong;
    }
       
    
}
