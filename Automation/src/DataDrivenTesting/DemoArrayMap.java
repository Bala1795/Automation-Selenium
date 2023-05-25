package DataDrivenTesting;

import java.util.ArrayList;
import java.util.HashMap;

public class DemoArrayMap {
	public static void main(String[] args) {
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("https://demo.actitime.com");
		lst.add("admin");
		lst.add("admin@actitime.com");	// if email is added in future lst.add("manager");
		System.out.println(lst.get(2)); // it will print email instead of password- manager
		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("url", "https://demo.actitime.com");//Key,Value pair
		hs.put("username","admin");
		hs.put("email", "admin@actitime.com");
		hs.put("password","manager");
		System.out.println(hs.get("password")); /*whether mail is added or not in future, 
		it will print same output*/
	}

}
