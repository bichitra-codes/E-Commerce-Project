package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;
import lombok.SneakyThrows;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;    // it is used to send the email
	
	@SneakyThrows
	public boolean sendEmail(String to, String subject, String body) {
		
		MimeMessage mimeMessage = mailSender.createMimeMessage();  // it  create a email object
		
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);  // it helps us fill details easily
		
		helper.setTo(to);             // it is used send email to user
		helper.setSubject(subject);   // set subject
		helper.setText(body,true);    // true = HTML email
		
		try {
			mailSender.send(mimeMessage);   // here if email send then return true otherwise it print the error end return false
			return true;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}

// here in line 20 and 22 both method emil sending can throw checked Exception so to avid these java provide @SneakyThrows
// @SneakyThrows = Lombok secretly generates code that throws the checked exceptions without forcing you to declare them.
