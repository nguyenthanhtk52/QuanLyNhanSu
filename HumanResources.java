/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package humanresources;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class HumanResources {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Staff> staffs = new ArrayList<>();
    private static ArrayList<Department> dep = new ArrayList<>();
    public static Employee employee = new Employee();
    public static Manager manager = new Manager();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        int luachon = 0;
        do {
            showMenu();
            System.out.print("===Chon menu====");
            luachon = scanner.nextInt();
            switch (luachon) {
                case 1:
                    DanhSachNhanVien();
                    break;
                case 2:
                    BoPhan();
                    break;
                case 3:
                    NhanVienBoPhan();
                    break;
                case 4:
                    ThemNhanVien();
                    break;
                case 5:
                    timKiem();
                    break;
                case 6:
                    bangLuong();
                    break;
                case 7:
                    SapXepGiamDan();
                    SapXepTangDan();
                    break;
                case 8:
                    System.out.print("Goodbye !!!");
                    break;
                default:
                    System.err.println("ban nhap sai");
                    break;
            }
            System.out.println(luachon);
            if (luachon == 8) {
                flag = false;
            }
        } while (flag == true);

    }

    public static void showMenu() {

        System.out.println("===============Human Resources Manager===============");
        System.out.println("1.Danh sach nhan vien: ");
        System.out.println("2.Bo phan cua cong ty: ");
        System.out.println("3.Nhan vien cua moi bo phan: ");
        System.out.println("4.Them nhan vien moi: ");
        System.out.println("5.Tim kiem nhan vien: ");
        System.out.println("6.Bang luong nhan vien: ");
        System.out.println("7.Luong nhan vien tang dan");
        System.out.println("8.Goodbye !:");
    }

    public static void DanhSachNhanVien() {

        System.out.println("=====Thong tin nhan vien=====");
        for (int i = 0; i < staffs.size(); i++) {
            staffs.get(i).displayInformation();
        }
    }

    public static void BoPhan() {
        Department department1 = new Department("bp12", "lap trinh", 40);
        Department department2 = new Department("bp11", "ke toan", 30);
        Department department3 = new Department("bp13", "nhan su", 20);
        dep.add(department1);
        dep.add(department2);
        dep.add(department3);
        //System.out.println(dep.toString());
        System.out.println("=====Thong tin bo phan=====");
        for (Department department : dep) {
            System.out.println(department.toString());
        }
    }

    public static void NhanVienBoPhan() {
        String bo_phan = "";

        for (int i = 0; i < dep.size(); i++) {
            System.out.println("Nhan vien bo phan: " + dep.get(i).getBo_phan());
            for (int j = 0; j < staffs.size(); j++) {
                if (staffs.get(j).getBo_phan().equals(dep.get(i).getBo_phan())) {
                    staffs.get(j).displayInformation();
                }
            }
        }
    }

    public static void ThemNhanVien() {
        int chon = 0;
        System.out.println("So nha vien can nhap : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Chon (1) them nhan vien, chon (2) them quan ly: ");
            chon = scanner.nextInt();
            if (chon == 1) {
                employee.inputInfo(); //them nhan vien
                staffs.add(employee);
            } else {
                manager.inputInfo();//them manager
                staffs.add(manager);
            }

        }

    }

    public static void timKiem() {

        System.out.print("Nhap ID hoac ten nhan vien: ");
        Scanner sc = new Scanner(System.in); //ở đây lại bị nhảy lệnh ko cho nhập.phải tạo scanner mới.
        String tim_kiem = sc.nextLine();
        int count = 0;
        for (Staff staff : staffs) {

            if (staff.getId().equalsIgnoreCase(tim_kiem) || staff.getName().equalsIgnoreCase(tim_kiem)) {
                staff.displayInformation();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong ton tai nhan vien can tim");
        }

    }

    public static void bangLuong() {
        System.out.println("Bang luong nhan vien: ");
        for (Staff staff : staffs) {
            if (staff instanceof Employee) {
                Employee emp = (Employee) staff;
                // emp.displayInformation();
                System.out.println("Ma nhan vien: " + emp.getId() + "Nhan vien: " + emp.getName() + "Luong thang : " + emp.calculateSalary());
            } else if (staff instanceof Manager) {
                Manager mag = (Manager) staff;
                //mag.displayInformation();
                System.out.println("Ma nhan vien:" + mag.getId() + "Nhan vien:" + mag.getName() + "Luong thang : " + mag.calculateSalary());
            }
        }
    }

    public static void SapXepGiamDan() {
        Collections.sort(staffs, new Comparator<Staff>() {
            @Override
            public int compare(Staff s1, Staff s2) {
                if (((ICalculator) s1).calculateSalary() < ((ICalculator) s2).calculateSalary()) {
                    return 1;
                } else {
                    if (((ICalculator) s1).calculateSalary() == ((ICalculator) s2).calculateSalary()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });

        System.out.println("Danh sách sắp xếp theo thứ tự luong giảm dần là: ");
        for (int i = 0; i < staffs.size(); i++) {
            
            System.out.println("Tên: " + staffs.get(i).getName() + " Luong: " + ((ICalculator) staffs.get(i)).calculateSalary());
        }

    }

    public static void SapXepTangDan() {
        Collections.sort(staffs, new Comparator<Staff>() {
            @Override
            public int compare(Staff s1, Staff s2) {
                if (((ICalculator) s1).calculateSalary() > ((ICalculator) s2).calculateSalary()) {
                    return 1;
                } else {
                    if (((ICalculator) s1).calculateSalary() == ((ICalculator) s2).calculateSalary()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });

        System.out.println("Danh sách sắp xếp theo thứ tự luong tang dần: ");
        for (int i = 0; i < staffs.size(); i++) {
            System.out.println("Tên: " + staffs.get(i).getName() + " Luong: " + ((ICalculator) staffs.get(i)).calculateSalary());
        }

    }

}
