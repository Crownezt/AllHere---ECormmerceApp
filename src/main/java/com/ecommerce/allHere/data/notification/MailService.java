package com.ecommerce.allHere.data.notification;


import com.ecommerce.allHere.data.dtos.EmailNotificationRequest;

public interface MailService {
    String sendHtmlMail(EmailNotificationRequest request);
}
