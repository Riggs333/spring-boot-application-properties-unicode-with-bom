package de.codecentric.demo;

import org.assertj.core.api.WithAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests implements WithAssertions {

    @Autowired
    MyProperties myProperties;

	@Test
	public void expectPropertyDefaultValue() {
        assertThat(myProperties.getHost()).isEqualTo(URI.create("https://www.codecentric.de"));
	}

}

