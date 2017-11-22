package main.java.ua.nure.verkhohliad.web;

import main.java.ua.nure.verkhohliad.User;
import main.java.ua.nure.verkhohliad.DAOFactory;
import main.java.ua.nure.verkhohliad.db.DatabaseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends EditServlet {

    @Override
    protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }

    @Override
    protected void passToDB(User user) throws DatabaseException {
        DAOFactory.getInstance().getUserDAO().create(user);
    }
}
