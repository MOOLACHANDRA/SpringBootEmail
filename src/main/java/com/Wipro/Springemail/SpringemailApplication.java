package com.Wipro.Springemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.Wipro.Springemail.service.EmailSenderService;

@SpringBootApplication
public class SpringemailApplication {
	
	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(SpringemailApplication.class, args);
		
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendmail() {
		emailSenderService.sendEmail("chandramoola1117@gmail.com", "This is a body", "This is a subject");
	}
	

}
