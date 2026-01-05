package pw;

import java.nio.file.Path;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.ConnectOptions;
import com.microsoft.playwright.BrowserType.ConnectOverCDPOptions;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.BrowserType.LaunchPersistentContextOptions;
import com.microsoft.playwright.Page;

public class Basicpgm {
	public static void main(String[] args)throws Exception
	{
		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
				Page page=browser.newPage();
				page.navigate("https://www.facebook.com/");
				Thread.sleep(10000);
				page.pause();
				
				System.out.println("Opened");
				/*;
				String title=page.title();
				String url=page.url();
				System.out.println(title);
				System.out.println(url);*/
			
				//playwright.close();
			
		
	}

}
