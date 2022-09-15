import org.testng.annotations.Test;

public class Register_test extends bastTest{
    @Test
    public void test01(){
        naviagteToRe()
                .getRegister()
                .getLoginp();
    }

}
