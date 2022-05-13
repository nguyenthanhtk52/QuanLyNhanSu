/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanresources;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Department {

    private String id_bophan;
    private String bo_phan;
    private int so_luong_nhan_vien;
    
    public Department(){
    
    }
    public Department(String id_bophan, String bo_phan, int so_luong_nhan_vien) {
        this.id_bophan = id_bophan;
        this.bo_phan = bo_phan;
        this.so_luong_nhan_vien = so_luong_nhan_vien;
    }

    public int getSo_luong_nhan_vien() {
        return so_luong_nhan_vien;
    }

    public String getId_bophan() {
        return id_bophan;
    }

    public String getBo_phan() {
        return bo_phan;
    }

  

    public void setSo_luong_nhan_vien(int so_luong_nhan_vien) {
        this.so_luong_nhan_vien = so_luong_nhan_vien;
    }

    public void setId_bophan(String id_bophan) {
        this.id_bophan = id_bophan;
    }

    public void setBo_phan(String bo_phan) {
        this.bo_phan = bo_phan;
    }

   

    public String toString() {
        return "Ma bo phan: "+getId_bophan() + " "+"Bo phan: " + getBo_phan() + " "+"So luong nhan vien: " + getSo_luong_nhan_vien();
    }
}
