/*
 * package stepdefinitions;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
 * io.cucumber.java.en.When; import org.junit.Assert;
 * 
 * public class Steps1 {
 * 
 * WebDriver driver;
 * 
 * @Given("^user is already on login pages$") public void
 * user_is_already_on_login_page() {
 * System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
 * driver=new ChromeDriver(); driver.get("https://www.shine.com/"); }
 * 
 * @When("^title of page is shine$") public void title_of_page_is_shine() {
 * String atitle = driver.getTitle(); System.out.println(atitle); Assert.
 * assertEquals("Jobs 2020 - Search Jobs in India, Latest Job Vacancies, Recruitment - Shine.com"
 * ,atitle); }
 * 
 * @Then("^click on login link$") public void click_on_login_link() {
 * driver.findElement(By.
 * xpath("//a[@class='cls_register_signin_homepage cls_login_header cls_call_dialogbox']"
 * )).click(); }
 * 
 * @Then("^user enters \"(.*)\" and \"(.*)\"$") public void
 * user_enters_user_name_and_password(String username, String password) {
 * driver.findElement(By.xpath("//input[@id='id_email_login']")).sendKeys(
 * username);
 * driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys(password)
 * ;
 * 
 * }
 * 
 * @Then("^user pinch on login button$") public void
 * user_clicks_on_login_button() {
 * driver.findElement(By.xpath("//button[@name='login_popup']")).click();
 * 
 * }
 * 
 * @Then("^user is on home page$") public void user_is_on_home_page() { String
 * atitle = driver.getTitle(); System.out.println(atitle); Assert.
 * assertEquals("Jobs 2020 - Search Jobs in India, Latest Job Vacancies, Recruitment - Shine.com"
 * ,atitle); }
 * 
 * }
 * 
 * 
 */