package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.DataNotFoundException;
import model.LoginDao;
import model.User;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
	}

	//index.jspへのサーブレット
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");

		getServletContext()
		.getRequestDispatcher("/index.jsp")
		.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		request.setCharacterEncoding("UTF-8");


				//リクエストパラメータの取得
				String id = request.getParameter("id");
				String pass = request.getParameter("pass");

				try {

					//パラメータを渡す
					LoginDao loginDao = new LoginDao();
					User user = loginDao.findUserByIdAndPass(id,pass);

					//セッションを取得
					//User情報をセッションスコープに保存
					HttpSession session=request.getSession();
					    session.setAttribute("isLogin", user);

					//mainサーブレットにフォワード
					getServletContext()
					.getRequestDispatcher("/index.jsp")
					.forward(request, response);

				}
				catch(SQLException e) {
					//解決不能な問題
					//ログイン失敗ページに飛ばす
					getServletContext()
					.getRequestDispatcher("/WEB-INF/jsp/loginErr.jsp")
					.forward(request, response);

				}
				catch(DataNotFoundException e) {
					request.setAttribute("error", "ユーザーIDかパスワードが間違っています");
					request.getRequestDispatcher("/index.jsp").forward(request, response);

				}

	}
}

