package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.PomFramework;

public class TestFramework extends BaseTest {

	@Test
	public void yahoo() throws IOException, InterruptedException
	{
		 PomFramework f=new PomFramework(driver);
		f.enterdetails();
	}

}