package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import pages.LoggedInPage;
import pages.MainPage;
import pages.SignInPage;
import support.Web;

public class PocAutomacao {

    private WebDriver driver;
    final String EMAIL = "wel@teste.com";
    final String PASSWORD = "123456";

    @Before
    public void accessWebSite(){
        driver = Web.createChrome();
    }

    @Dado("que ele tenha clicado no botão sign in")
    public void que_ele_tenha_clicado_no_botão_sign_in() {
        new MainPage(driver)
                .clickOnSignInButton();
    }

    @Quando("inserir um e-mail e senha válido")
    public void inserir_um_e_mail_e_senha_válido() {
        new SignInPage(driver)
                .insertAValidEmailAndPassword(EMAIL, PASSWORD);
    }

    @Quando("pressionar o botão de logar")
    public void pressionar_o_botão_de_logar() {
        new SignInPage(driver)
                .clickOnSignInButton();
    }

    @Então("deve ser logado com sucesso")
    public void deve_ser_logado_com_sucesso() {
        new LoggedInPage(driver)
                .checkElementVisibility();
    }

    @After
    public void driverQuit(){
        driver.quit();
    }


}
