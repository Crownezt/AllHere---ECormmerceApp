package com.ecommerce.allHere.data.notification;


import com.ecommerce.allHere.config.mail.MailConfig;
import com.ecommerce.allHere.data.dtos.EmailNotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
@Slf4j
public class MailServiceImpl implements MailService{

    private final MailConfig mailConfig;


    @Override
    public String sendHtmlMail(EmailNotificationRequest request)  {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("api-key", mailConfig.getApiKey());
//        log.info("req->{}", request);
        HttpEntity<EmailNotificationRequest> requestEntity = new HttpEntity<>(request, headers);

        ResponseEntity<String> response =
                restTemplate.postForEntity(mailConfig.getMailUrl(), requestEntity, String.class);

        return response.getBody();
    }
}