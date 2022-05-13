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
public abstract class Staff {

    private String id;
    private String name;
    private int age;
    private float he_so_luong;
    private String ngay_vao_lam;
    private String bo_phan;
    private int ngay_nghi_phep;

    public Staff(){
    
    }
    public Staff(String id, String name, int age, float he_so_luong, String ngay_vao_lam, String bo_phan, int ngay_nghi_phep) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.he_so_luong = he_so_luong;
        this.ngay_vao_lam = ngay_vao_lam;
        this.bo_phan = bo_phan;
        this.ngay_nghi_phep = ngay_nghi_phep;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHe_so_luong() {
        return he_so_luong;
    }

    public String getNgay_vao_lam() {
        return ngay_vao_lam;
    }

    public String getBo_phan() {
        return bo_phan;
    }

    public int getNgay_nghi_phep() {
        return ngay_nghi_phep;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHe_so_luong(float he_so_luong) {
        this.he_so_luong = he_so_luong;
    }

    public void setNgay_vao_lam(String ngay_vao_lam) {
        this.ngay_vao_lam = ngay_vao_lam;
    }

    public void setBo_phan(String bo_phan) {
        this.bo_phan = bo_phan;
    }

    public void setNgay_nghi_phep(int ngay_nghi_phep) {
        this.ngay_nghi_phep = ngay_nghi_phep;
    }
    
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        id = sc.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        name = sc.nextLine();
        System.out.print("Bo phan: ");
        bo_phan = sc.nextLine();
        //khi nhập bị nhảy dòng ko cho nhập nên chia nhập chuỗi trên và số ở dưới
        System.out.print("Ngay vao lam: ");
        ngay_vao_lam = sc.nextLine();
        System.out.print("Nhap he so luong: ");
        he_so_luong = sc.nextFloat();
        System.out.print("Nhap tuoi nhan vien: ");
        age = sc.nextInt();
        System.out.print("So ngay nghi phep: ");
        ngay_nghi_phep = sc.nextInt();
         
        
    }

    public abstract void displayInformation();
    
    
}
