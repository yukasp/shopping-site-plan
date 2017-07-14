package servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;

@WebServlet("/BuyItem")
public class BuyItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

	        //リクエストパラメータを取得
	        request.setCharacterEncoding("UTF-8");
	        String ringo = request.getParameter("ringo");
	        //String banana = request.getParameter("banana");

	        HttpSession session = request.getSession();
	        Product product = new Product();
	        product.setName(ringo);
		    session.setAttribute("Product", product);

	       //session.setAttribute("Product", banana);


	        // 購入確認画面に移動
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/shopping-cart.jsp");
	        dispatcher.forward(request, response);
	    }


	}