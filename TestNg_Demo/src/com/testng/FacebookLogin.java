package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookLogin {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	@Test
	public void Test1() {
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void Test2() throws InterruptedException {
		driver.findElement(By.cssSelector("#email")).sendKeys("konadeepthi009@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Deepthi@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#mount_0_0_Ap > div > div:nth-child(1) > div > div.bdao358l.om3e55n1.g4tp4svg > div > div > div > div.alzwoclg.cqf1kptm.p1t2w4gn.fawcizw8.om3e55n1.g4tp4svg > div.bdao358l.jez8cy9q.t5n4vrf6.o9w3sbdw.sr926ui1.jl2a5g8c.alzwoclg.cgu29s5g.fawcizw8.om3e55n1.g4tp4svg.qkxw7tbt > div.bdao358l.om3e55n1.alzwoclg.cqf1kptm.gvxzyvdx.aeinzg81.jez8cy9q.fawcizw8.sl4bvocy.mm98tyaj.b0ur3jhr > div > div.r7ybg2qv.qbc87b33.jk4gexc9.alzwoclg.cqf1kptm.lq84ybu9.g4tp4svg.ly56v2vv.h67akvdo.ir1gxh3s.sqler345.by1hb0a5.thmcm15y.cgu29s5g.i15ihif8.dnr7xe2t.id4k59z1.jfw19y2w.b95sz57d.mm05nxu8.izce65as.om3e55n1.qbfhvn0q > div.alzwoclg.cqf1kptm.cgu29s5g.om3e55n1 > div.th51lws0 > div > div.r6ydv39a > div:nth-child(2) > a > div.s9ok87oh.bf1zulr9.s9ljgwtm.lxqftegz.frfouenu.r7bn319e.bonavkto.djs4p424.bdao358l.alzwoclg.cgu29s5g.i15ihif8.sl27f92c.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.aeinzg81.srn514ro.rl78xhln.om3e55n1.g4tp4svg.i85zmo3j.jl2a5g8c.b0eko5f3.fwlpnqze.il7dmu95 > div.s9ok87oh.bf1zulr9.s9ljgwtm.lxqftegz.frfouenu.r7bn319e.bonavkto.djs4p424.bdao358l.alzwoclg.cgu29s5g.i15ihif8.sl27f92c.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.dnr7xe2t.aeinzg81.srn514ro.oxkhqvkx.rl78xhln.nch0832m.g4tp4svg.i85zmo3j.k88nbmki.jl2a5g8c.om3e55n1 > div.o9w3sbdw.s9ok87oh.bf1zulr9.s9ljgwtm.lxqftegz.frfouenu.r7bn319e.bonavkto.djs4p424.bdao358l.alzwoclg.cqf1kptm.cgu29s5g.i15ihif8.sl27f92c.m8h3af8h.l7ghb35v.kjdc1dyq.kmwttqpk.dnr7xe2t.aeinzg81.oxkhqvkx.nch0832m.om3e55n1.g4tp4svg.jg3vgc78.s1m0hq7j.rj2hsocd > div > div > div > span > span")).click();
	}
	}
		
