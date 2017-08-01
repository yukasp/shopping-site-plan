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
	        String productName = request.getParameter("productName");
	        //セッション変数を取得
	        HttpSession session = request.getSession();
	        Product product = new Product();//プロダクトオブジェクトインスタンス化
	        product.setName(productName);//インスタンスにproductNameを入れる。押されたsubmitのvalueがsetされる
	        session.setAttribute("Product", product);//セッションスコープに値をセット

	        /*if(null != product) {//このコードでは商品が増えた時それぶんだけif文を書かなきゃ行けないから大変。
	        	product.setName(ringo);
	        }
	        else if(null != banana) {
	        	product.setName(banana);
	        }*/





	        // 購入確認画面に移動
	        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/shopping-cart.jsp");
	        dispatcher.forward(request, response);
	    }


	}