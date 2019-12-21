/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.SanPham;

/**
 *
 * @author Administrator
 */
public interface SanPhamDao {
    
    //Lay danh sach sp dua theo mã chuyên mục
    public ArrayList<SanPham> getListProductByCategory(String ma_danh_muc);  
    
    //Hiển thị thông tin chi tiết sản phẩm
    public SanPham getChiTietSanPham(String ma_san_pham);
}
