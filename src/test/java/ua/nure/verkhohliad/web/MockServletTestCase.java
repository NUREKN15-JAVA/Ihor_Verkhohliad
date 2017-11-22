package main.java.ua.nure.verkhohliad.web;

import com.mockobjects.dynamic.Mock;
import com.mockrunner.servlet.BasicServletTestCaseAdapter;
import main.java.ua.nure.verkhohliad.db.DAOFactory;
import main.java.ua.nure.verkhohliad.db.MockDAOFactory;

import java.util.Properties;

public abstract class MockServletTestCase extends BasicServletTestCaseAdapter {

    protected Mock mockUserDao;

    public void setUp() throws Exception {
        super.setUp();
        Properties properties = new Properties();
        properties.setProperty("dao.factory", MockDAOFactory.class.getName());
        DAOFactory.init(properties);
        setMockUserDao(((MockDAOFactory)DAOFactory.getInstance()).getMockUserDao());
    }

    public void tearDown() throws Exception {
        mockUserDao.verify();
        super.tearDown();
    }

    public Mock getMockUserDao() {
        return mockUserDao;
    }

    public void setMockUserDao(Mock mockUserDao) {
        this.mockUserDao = mockUserDao;
    }
}
