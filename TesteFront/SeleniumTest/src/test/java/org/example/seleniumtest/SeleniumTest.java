package org.example.seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {
    public static void main(String[] args) {
// Configurar o caminho do driver (ajuste para o sistema operacional)
        System.setProperty("webdriver.chrome.driver",
                "C:\\Drivers/chromedriver.exe");
// Instanciar o WebDriver
        WebDriver driver = new ChromeDriver();
// Navegar para o Google
        driver.get("https://www.google.com");
// Imprimir o título da página
        System.out.println("O título da página é: " + driver.getTitle());
// Fechar o navegador
        driver.quit();
    }
}
