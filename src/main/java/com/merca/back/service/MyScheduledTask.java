package com.merca.back.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MyScheduledTask {
    private final RestTemplate restTemplate;

    public MyScheduledTask(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        System.out.println("MyScheduledTask Bean initialized");
    }
@Scheduled(cron = "0 */14 * * * ?")
public void performTask() {
        String url = "https://mercalibre-back.onrender.com";
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("Response: " + response);
    }
}
