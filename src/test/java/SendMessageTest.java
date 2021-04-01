import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SendMessageTest extends TestBase {

    String username = "Test";
    String password = "12qw!@QW";
    String search = "Alona Deveraux";
    UserPage userPage;

    @Before
    public void login() {
        userPage = new LoginPage(driver).doLogin(username, password);
    }

    @Test
    public void testSendMessage() {
        userPage.goToSearchPage().doSearch(search);
    }

    @After
    public void logout() {

    }
}

