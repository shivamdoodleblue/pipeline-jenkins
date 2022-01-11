package shivam.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ControllerTest {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	void test() {
		logger.info("Test case passed");
		Assertions.assertEquals("c", "c", "testcase passed");
	}

}
