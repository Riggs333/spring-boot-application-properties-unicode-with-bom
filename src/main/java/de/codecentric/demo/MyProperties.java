package de.codecentric.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.net.URI;

@ConfigurationProperties(prefix = "de.codecentric")
@Validated
public class MyProperties {

    private static final String MY_HOST_DEFAULT = "https://www.codecentric.de";

    private @NotNull URI host = URI.create(MY_HOST_DEFAULT);

    public URI getHost() {
        return host;
    }

    public void setHost(URI host) {
        this.host = host;
    }
}
