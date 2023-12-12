package com.ecommerce.allHere.data.dtos;

import java.util.ArrayList;
import java.util.List;

public class EmailNotificationRequest {
    private Sender sender;
    private List<Recipient> to = new ArrayList<>();
    private String subject;
    private String content;
}
