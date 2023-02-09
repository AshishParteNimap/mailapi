package com.Mail.MailServiceImpl;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.Mail.MailService.MailService;
import com.Mail.MilDetails.Details;

@Service
public class MailImpl implements MailService {

	@Autowired
	JavaMailSender javaMailSender;

	@Override
	public String sendEmail(Details details) {

		String body = details.getMailBody();
		body = body.replace("$name", details.getName());

		try {
			MimeMessage message = javaMailSender.createMimeMessage();

			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setTo(details.getSendTo());
			helper.setText(body, true);
			helper.setFrom(new InternetAddress(details.getSender()));
			helper.setSubject(details.getSubject());
			helper.setReplyTo(details.getReturnEmail());
			this.javaMailSender.send(message);
			return "mail sent";
		} catch (Exception e) {
			return "canot send mail" + e;
		}
	}

}
