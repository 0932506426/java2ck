/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.DanhMucDAOImpl;
import dao.SanPhamDaoImpl;
import dao.TaiKhoanDaoImpl;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        DanhMucDAOImpl dm = new DanhMucDAOImpl();
        SanPhamDaoImpl sp = new SanPhamDaoImpl();
        //System.out.println(dm.getListDanhMucCon("1001").size());
        //System.out.println(sp.getChiTietSanPham("1002").getTen_san_pham());
        TaiKhoanDaoImpl tk = new TaiKhoanDaoImpl();
        System.out.println(tk.kiemTraTaiKhoan("admin@gmail.com"));
    }
}
