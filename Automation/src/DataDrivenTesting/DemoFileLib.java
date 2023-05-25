package DataDrivenTesting;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class DemoFileLib {
	public static void main(String[] args) throws IOException {
		FileLib f= new FileLib();
		String url = f.getProperty("url");
		System.out.println(url);
		System.out.println(f.getProperty("username"));
		System.out.println(f.getProperty("password"));
		System.out.println(f.getExcelData("CreateCustomer", 1, 1));
		f.setExcelData("CreateCustomer", 1, 2,"pass");

	}

}