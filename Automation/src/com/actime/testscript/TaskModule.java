package com.actime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test
	public void createTask() {
		Reporter.log("CreateTask",true);
	}
	@Test

	public void modifyTask() {
		Reporter.log("ModifyTask",true);
	}
		@Test

	public void deleteTask() {
		Reporter.log("DeleteTask",true);
	}

}
