/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SanPhamDaoImpl;
import java.io.IOException;
import static java.lang.Compiler.command;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.GioHang;
import model.SanPham;

/**
 *
 * @author Administrator
 */
public class GioHangServlet extends HttpServlet {

    private SanPhamDaoImpl SanPhamDao = new SanPhamDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        GioHang cart = (GioHang) session.getAttribute("cart");
        String msp = request.getParameter("ma_san_pham");
        String command = request.getParameter("command");
        ArrayList<Long> listBuy = null;
        String url = "/cart.jsp";
        try {
            listBuy = (ArrayList<Long>) session.getAttribute("cartID");
            long idBuy = 0;
            if (request.getParameter("cartID") != null) {
                idBuy = Long.parseLong(request.getParameter("cartID"));
            }
            SanPham sp = SanPhamDao.getChiTietSanPham(msp);
            switch (command) {
                case "insert":
                    if (listBuy == null) {
                        listBuy = new ArrayList<>();
                        session.setAttribute("cartID", listBuy);
                    }
                    if (listBuy.indexOf(idBuy) == -1) {
                        cart.addToCart(sp, 1);
                        listBuy.add(idBuy);
                    }
                    url = "/cart.jsp";
                    break;
                case "plus":
                    if (listBuy == null) {
                        listBuy = new ArrayList<>();
                        session.setAttribute("cart", listBuy);
                    }
                    if (listBuy.indexOf(idBuy) == -1) {
                        cart.addToCart(sp, 1);
                        listBuy.add(idBuy);
                    }
                    url = "/cart.jsp";
                    break;
                case "sub":
                    if (listBuy == null) {
                        listBuy = new ArrayList<>();
                        session.setAttribute("cart", listBuy);
                    }
                    if (listBuy.indexOf(idBuy) == -1) {
                        cart.subToCart(sp, 1);
                        listBuy.add(idBuy);
                    }
                    url = "/cart.jsp";
                    break;
                case "remove":
                    cart.removeToCart(sp);
                    url = "/cart.jsp";
                    break;
                default:
                    break;
            }
            RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
        }
    }
}
