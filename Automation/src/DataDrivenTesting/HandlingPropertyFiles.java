package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFiles {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/commondata.property"); // create an object of properties class
		Properties p = new Properties(); //load the file so that getProperty method will come to know where the file is
		p.load(fis); // read or get the data from the property file by passing the key 
		String url = p.getProperty("url");
		String email = p.getProperty("email");
		String pw = p.getProperty("password");
		String un = p.getProperty("username"); 
		System.out.println(url);
		System.out.println(pw);
		System.out.println(un);
		System.out.println(email);


		
		
	}


	}
	

