/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.DanhMuc;

/**
 *
 * @author Administrator
 */
public interface DanhMucDAO {
    
    //load danh sach danh muc cha
    public ArrayList<DanhMuc> getListDanhMucCha();
    //Load danh sach muc con
    public ArrayList<DanhMuc> getListDanhMucCon(String ma_danh_muc);
}
