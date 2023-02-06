package com.praticando.api.email.dtos;

import lombok.Data;



@Data
public class EmailDto {
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    private String text;
}
