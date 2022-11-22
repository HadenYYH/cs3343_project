package Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import Program.Accounts;

class test_login {


	@Test
	void test015() {
		Accounts accounts = Accounts.getInstance();
		accounts.register("23456789", "Alex", "alex@my.cityu.edu.hk", "12345Ab*", "12345Ab*");
		assertEquals("Login Successfully!", accounts.login("23456789", "12345Ab*"));
		accounts.remove("23456789");
	}
	
	@Test
	void test016() {
		Accounts accounts = Accounts.getInstance();
		accounts.register("23456789", "Alex", "alex@my.cityu.edu.hk", "12345Ab*", "12345Ab*");
		assertEquals("Wrong SID or password", accounts.login("23456781", "12345Ab*"));
		accounts.remove("23456789");
	}
	
	@Test
	void test017() {
		Accounts accounts = Accounts.getInstance();
		accounts.register("23456789", "Alex", "alex	@my.cityu.edu.hk", "12345Ab*", "12345Ab*");
		assertEquals("Wrong SID or password", accounts.login("23456789", "12345Ac*"));
		accounts.remove("23456789");
	}
	
	@Test
	void test018() {
		Accounts accounts = Accounts.getInstance();
		accounts.register("23456789", "Alex", "alex@my.cityu.edu.hk", "12345Ab*", "12345Ab*");
		assertEquals("Invalid SID", accounts.login("234567891", "12345Ac*"));
		accounts.remove("23456789");
	}


}
