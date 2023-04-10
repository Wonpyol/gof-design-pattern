package com.study.structural_patterns.facade._02_after;

import com.study.structural_patterns.facade._02_after.facade.EmailSender;
import com.study.structural_patterns.facade._02_after.subclass.EmailMessage;
import com.study.structural_patterns.facade._02_after.subclass.EmailSettings;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("wonansan@naver.com");
        emailMessage.setTo("wonpyol@gmail.com");
        emailMessage.setCc("일남");
        emailMessage.setSubject("오징어게임");
        emailMessage.setText("밖은 더 지옥이더라고..");

        emailSender.sendEmail(emailMessage);
    }
}
