package org.ezboardhiring.restservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;

@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties("logserver")
public class LogserverProperties {
    @NotEmpty
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
