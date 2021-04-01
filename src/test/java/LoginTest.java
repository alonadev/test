import org.junit.After;
import org.junit.Test;

public class LoginTest extends TestBase {

    String username = "Test";
    String password = "12qw!@QW";

    @Test
    public void testLogin() {
        UserPage userPage = new LoginPage(driver).doLogin(username, password);

    }

    @After
    public void logout() {

    }
}
