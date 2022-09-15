import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearcheBox;

public class SearcheBox_test extends bastTest {
    @Test
    public void test01(){
        PageFactory.initElements(driver, SearcheBox.class).Searche("camera").getLeicaCamera();

    }
}
