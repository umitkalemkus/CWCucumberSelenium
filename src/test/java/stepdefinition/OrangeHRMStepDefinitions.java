package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OrangeHRMLoginPage;
import utilities.Driver;

import java.util.List;
import java.util.Map;

public class OrangeHRMStepDefinitions {
    @Given("kullanici HRMLogin sayfasina gider")
    public void kullaniciHRMLoginSayfasinaGider() {

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

    }

    @When("kullanici valid credentials girer")
    public void kullaniciCredentialsGirer(DataTable table) {


//         List metoduyla table i parcalama
//
//                List<List<String>> data =  table.asLists();
//
//        for (List<String> satir : data) {
//            for (String hucre : satir) {
//                System.out.print(hucre + " - ");
//            }
//            System.out.println();
//        }

//        String username = table.cell(1,0);
//        String password = table.cell(1,1);


//        int rowCount = table.height();
//        int colCount = table.width();
//
//        for(int i = 1; i < rowCount; i++){
//            for (int j = 0; j < colCount; j++){
//
//                System.out.println(table.cell(i,j));
//
//            }
//        }

        OrangeHRMLoginPage lp = new OrangeHRMLoginPage(Driver.getDriver());


        List<Map<String,String>> data =  table.asMaps(String.class, String.class);

        for (Map<String,String> maps : data) {
            String userId = maps.get("admin_id");
            String userPassword = maps.get("admin_pass");

            lp.typeUsername(userId);
            lp.typePassword(userPassword);
            lp.clickLogin();
            System.out.println(maps); // {admin_id=Admin, admin_pass=admin123}
        }

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));


    }



    @When("kullanici invalid credentials girer")
    public void kullaniciInvalidCredentialsGirer(DataTable table) {

        OrangeHRMLoginPage lp = new OrangeHRMLoginPage(Driver.getDriver());


        List<List<String>> data = table.asLists();


        for (int row = 1; row < table.height(); row++){ // Rowlari doner

            String username = table.cell(row,0);
            String password = table.cell(row, 1);
            String errorMessage = table.cell(row, 2);

            lp.typeUsername(username);
            lp.typePassword(password);
            lp.clickLogin();
            lp.verifyErrMessageContains(errorMessage);
        }


    }
}
