package org.ezboardhiring.restservice.clients;

import org.ezboardhiring.restservice.LogserverProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class LoggingClient {
    private LogserverProperties logserverProps;

    @Autowired
    public void setLogserverProps(LogserverProperties logserverProps) {
        this.logserverProps = logserverProps;
    }

    @Autowired
    RestTemplate restTemplate;

    @Async
    public void log(String msg) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(msg, headers);

        restTemplate.exchange(logserverProps.getHost()+"/log", HttpMethod.POST, entity, String.class);

    }
}
