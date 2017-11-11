package test.java.ua.nure.verkhohliad.db;

import com.mockobjects.dynamic.Mock;
import main.java.ua.nure.verkhohliad.db.DAOFactory;
import main.java.ua.nure.verkhohliad.db.UserDAO;

/**
 * Author Ihor
 * created 06.11.2017.
 */
public class MockDAOFactory extends DAOFactory {
    private Mock mockUserDAO;

    public MockDAOFactory() {
        mockUserDAO = new Mock(UserDAO.class);
    }

    public Mock getMockUserDAO() {
        return mockUserDAO;
    }

    @Override
    public UserDAO getUserDAO() {
        return (UserDAO) mockUserDAO.proxy();
    }
}
