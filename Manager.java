/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanresources;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Manager extends Staff implements ICalculator{

    private String chuc_danh;

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo(); 
        System.out.print("Nhap vao chuc danh: ");
        chuc_danh = sc.nextLine();
    }

    @Override
    public void displayInformation() {
        //System.out.println("===== Thong tin manager =====");
        System.out.print("Ma nhan vien: " + super.getId()+". ");
        System.out.print("Ten nhan vien: " + super.getName()+". ");
        System.out.print("Tuoi nhan vien: " + super.getAge()+". ");
        System.out.print("He so luong: " + super.getHe_so_luong()+". ");
        System.out.print("Ngay vao lam: " + super.getNgay_vao_lam()+". ");
        System.out.print("Bo phan: " + super.getBo_phan()+". ");
        System.out.print("Chuc danh: " + getChuc_danh()+". ");
        System.out.print("Ngay nghi phep: " + super.getNgay_nghi_phep()+"\n");
        
        
    }

    @Override
    public int calculateSalary() {

        if (chuc_danh.toLowerCase().equalsIgnoreCase("Business Leader")) {
            return (int)(super.getHe_so_luong() * 5000000 + 8000000);
        }
        if (chuc_danh.toLowerCase().equalsIgnoreCase("Project Leader")) {
            return (int)(super.getHe_so_luong() * 5000000 + 5000000);
        }
        if (chuc_danh.toLowerCase().equalsIgnoreCase("Technical Leader")) {
            return (int)(super.getHe_so_luong() * 5000000 + 6000000);
        }
        return calculateSalary();
    }

    public Manager(String chuc_danh, String id, String name, int age, float he_so_luong, String ngay_vao_lam, String bo_phan, int ngay_nghi_phep) {
        super(id, name, age, he_so_luong, ngay_vao_lam, bo_phan, ngay_nghi_phep);
        this.chuc_danh = chuc_danh;
    }

  
    public String getChuc_danh() {
        return chuc_danh;
    }

    public void setChuc_danh(String chuc_danh) {
        this.chuc_danh = chuc_danh;
    }
    public Manager(){
    
    }
}
