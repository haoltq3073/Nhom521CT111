/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi40;


public class KiemChungVien extends NhanVien{
    private int soLoiPhatHien;
 
    public KiemChungVien() {
        super();
    }
 
    public KiemChungVien(int soLoiPhatHien) {
        super();
        this.soLoiPhatHien = soLoiPhatHien;
    }
 
    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }
 
    public void setSoLoiPhatHien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }
 
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap so loi phat hien: ");
        soLoiPhatHien = scanner.nextInt();
    }
 
    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.soLoiPhatHien * 50000;
        return this.luong;
    }
 
    @Override
    public String toString() {
        return super.toString() + "\n, so loi phat hien: " + this.soLoiPhatHien + 
            ", luongng: " + this.luong;
    }
}
