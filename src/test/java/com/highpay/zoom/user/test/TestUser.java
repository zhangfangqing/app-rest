package com.highpay.zoom.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.highpay.zoom.dubbo.user.inter.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/spring/applicationContext*.xml")
public class TestUser extends AbstractJUnit4SpringContextTests{
	@Autowired
	private IUserService userService;
	
	@Test
	public void testUser(){
		System.err.println(userService.getUsers());
	}

}
