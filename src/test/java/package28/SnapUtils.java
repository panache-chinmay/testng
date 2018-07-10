package package28;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class SnapUtils {
	
	
	public  static void takeScreenshotonFail(WebDriver driver ,String filename  ) {
		
		TakesScreenshot takeSnap =  (TakesScreenshot) driver;
		File snap =takeSnap.getScreenshotAs(OutputType.FILE);
		File des= new File("snaps/"+filename+".png");
		try {
			Files.move(snap, des);
			System.out.println("Snap Captured: "+des.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
