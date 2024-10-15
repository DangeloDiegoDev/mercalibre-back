package com.merca;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MyScheduledTask {

    private final RestTemplate restTemplate = new RestTemplate();

    @Scheduled(cron = "0 */14 * * * ?")
    public void performTask() {
        String url = "https://mercalibre-back.onrender.com";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("Response: " + response);
    }
}
