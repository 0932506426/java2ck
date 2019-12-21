/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.TaiKhoan;

/**
 *
 * @author Administrator
 */
public interface TaiKhoanDao {
    // Kiểm tra tên tài khoản tồn tại chưa
    public boolean kiemTraTaiKhoan(String ten_dang_nhap);
    //thêm tài khoaanr
    public void themTaiKhoan(TaiKhoan tk);
    //Kiểm tra đăng nhập
    public boolean kiemTraDangNhap(String ten_dang_nhap, String mat_khau);
}
