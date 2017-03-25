package de.dennis.gittest;

import static org.junit.Assert.*;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		Assert.assertThat(App.streamIntegerSysout(),CoreMatchers.hasItems(1,2,3));
	}

}
