package test.java.ua.nure.verkhohliad;

import main.java.ua.nure.verkhohliad.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.fail;

/**
 * Author Ihor
 * created 11.10.2017.
 */

public class UserTest {
    private User user;
    private Date dateOfBirth;
    private static final int YEAR = 1998;
    private static final int MONTH = Calendar.NOVEMBER;
    private static final int DAY = 6;

    @Before
    public void setUp() throws Exception {
        user = new User();
        Calendar calendar = Calendar.getInstance();
        calendar.set(YEAR, MONTH, DAY);
        dateOfBirth = calendar.getTime();
    }

    @Test
    public void getFullName() {
        user.setFirstName("Ihor");
        user.setLastName("Verkhohliad");
        Assert.assertEquals("Verkhohliad, Ihor", user.getFullName());
    }

    @Test
    public void getFullNameWithoutFirstName() {
        user.setLastName("Verkhohliad");
        try {
            user.getFullName();
            fail("IllegalStateException expecting");
        } catch (IllegalStateException e) {
            System.out.println(e);
        }
    }

    @Test
    public void getAge() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int currentYear = calendar.get(Calendar.YEAR);
        user.setDateOfBirth(dateOfBirth);
        Assert.assertEquals(currentYear - YEAR, user.getAge());
    }
}
