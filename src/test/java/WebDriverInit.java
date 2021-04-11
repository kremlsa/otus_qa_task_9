import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


/*
java -jar selenium-server-standalone-3.141.59.jar -role hub -port 4
http://192.168.0.124:4444/grid/console
java -jar selenium-server-standalone-3.141.59.jar -role node -browser browserName=chrome,version=89.0,webdriver.chrome.driver=c:/chromedriver/chromedriver.exe,maxInstances=5
.\cm_windows_amd64.exe selenoid start --vnc  --browsers "chrome:89.0;firefox:87.0" --args "-session-attempt-timeout 5m -service-startup-timeout 5m" -l 10
.\cm_windows_amd64.exe selenoid-ui start --port 8081
 */
public class WebDriverInit {
    public static RemoteWebDriver initDriver() {
        URL url;
        try {
            url = new URL("http://127.0.0.1:4444/wd/hub/");
        } catch (MalformedURLException me) {
            me.printStackTrace();
            throw new RuntimeException(me);
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("89.0");
        capabilities.setPlatform(Platform.ANY);
        return new RemoteWebDriver(url, capabilities);
    }
}
