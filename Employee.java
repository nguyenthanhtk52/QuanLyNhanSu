/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanresources;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Employee extends Staff implements ICalculator {

    private float gio_lam_them;

    public Employee() {
    }

    public Employee(String id, String name, int age, float he_so_luong, String ngay_vao_lam, String bo_phan, int ngay_nghi_phep) {
        super(id, name, age, he_so_luong, ngay_vao_lam, bo_phan, ngay_nghi_phep);
    }

    public float getGio_lam_them() {
        return gio_lam_them;
    }

    public void setGio_lam_them(float gio_lam_them) {
        this.gio_lam_them = gio_lam_them;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Gio lam them: ");
        gio_lam_them = scanner.nextFloat();
    }

    @Override
    public int calculateSalary() {

        return (int)(super.getHe_so_luong() * 3000000 + getGio_lam_them() * 200000);
    }

    @Override
    public void displayInformation() {

       // 
        System.out.print("Ma nhan vien: " + super.getId()+". ");
        System.out.print("Ten nhan vien: " + super.getName()+". ");
        System.out.print("Tuoi nhan vien: " + super.getAge()+". ");
        System.out.print("He so luong: " + super.getHe_so_luong()+". ");
        System.out.print("Ngay vao lam: " + super.getNgay_vao_lam()+". ");
        System.out.print("Bo phan: " + super.getBo_phan()+". ");
        System.out.print("Ngay nghi phep: " + super.getNgay_nghi_phep()+ "\n");
       // System.out.println("Luong thang: " + calculateSalary()+" ");
        
    }

}
