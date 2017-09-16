package com.test.pluto.testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)

@Suite.SuiteClasses({
		TestAlgorithm1.class,
		TestMockedMapController.class
})

public class TestSuite{
}

