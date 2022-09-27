package pages;

import org.testng.annotations.Test;

import hw_20_URL.Base;
import io.netty.channel.MessageSizeEstimator.Handle;

public class HomePageTest extends Base {

	@Test
	public void clickLogo() {
		homePage.logoDisplayed();
	}
}
