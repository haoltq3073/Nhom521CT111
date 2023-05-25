/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thi40;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int luongTrungBinh = 0, tongLuong = 0;
        int x=0;
     
        Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so nhan vien trong cong ty: ");
        int soNhanVien = scanner.nextInt();
        NhanVien[] nhanVien = new NhanVien[soNhanVien];
        
      do{
          System.out.println("0.Nhap 0 de thoat");
          System.out.println("1.Nhap thong tin nhan vien");
          System.out.println("2.Xuat thong tin nhan vien");
          System.out.println("3.Danh sach nhan vien co muc luong trung binh thap hon muc cua cong ty");
          System.out.println("4.Danh sach nhan vien co muc luong trung binh cao hon muc cua cong ty");
          x= scanner.nextInt();
          switch(x){
              case 0:
                  
                  System.out.println("Da hoan thanh");
                  
              case 1: 
        
        System.out.println("Nhap thong tin cho nhan vien");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            System.out.print("Chon loai nhan vien (1 - lap trinh vien, 2 - kiem chung vien, 3 - cong nhan): ");
            int choose = scanner.nextInt();
        if (choose == 1) {
                nhanVien[i] = new LapTrinhVien();
            } else if (choose == 2) {
                nhanVien[i] = new KiemChungVien();
            }
            else if (choose==3){
            nhanVien[i] = new CongNhan();
            }
            nhanVien[i].nhap();
            nhanVien[i].tinhLuong();
        }
        break;
              case 2:
       System.out.println("Thong tin cua cac nhan vien trong cong ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].toString());
            
        }
        break;
              case 3:
            System.out.println("Danh sach nhan vien co luong thap hon muc luong trung binh cua "
            + "cac nhan vien trong cong ty.");
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += nhanVien[i].tinhLuong();
        }
        luongTrungBinh = tongLuong / soNhanVien;
         
        for (int i = 0; i < soNhanVien; i++) {
            if (nhanVien[i].tinhLuong() <= luongTrungBinh) {
                System.out.println(nhanVien[i].toString());
            }
        }
          break;
          
              case 4: 
       System.out.println("Danh sach nhan vien co luong cao hon muc luong trung binh cua "
            + "cac nhan vien trong cong ty.");
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += nhanVien[i].tinhLuong();
        }
        luongTrungBinh = tongLuong / soNhanVien;
         
        for (int i = 0; i < soNhanVien; i++) {
            if (nhanVien[i].tinhLuong() >= luongTrungBinh) {
                System.out.println(nhanVien[i].toString());
            }
        }
        
       
    
          
          }
                   
        }while(x!=0);
      

      }
} 

