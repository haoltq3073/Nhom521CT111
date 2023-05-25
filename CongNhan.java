/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi40;

public class CongNhan extends NhanVien{
    private int soSP;

    public CongNhan(int soSP) {
        super();
        this.soSP = soSP;
    }

    public CongNhan() {
          super();
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }
    public String VuotChuan(){
    if (this.soSP>500){
        return "Tot";
    }else {
        return "Binh thuong";
    }
      
    }
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap so sp: ");
        soSP = scanner.nextInt();
    }
     @Override
    public int tinhLuong() {
        if(this.soSP<=500){
        this.luong = this.soSP * 200000;}
        else if (this.soSP>500){
        this.luong=this.soSP *300000;
        }
        return this.luong;
    }
    
     @Override
    public String toString() {
        return super.toString() + "\n, so sp lam duoc: " + this.soSP + 
            ", luong: " + this.luong + ", Ket qua: "+ this.VuotChuan();
    }
    
    
    
    
    
}
