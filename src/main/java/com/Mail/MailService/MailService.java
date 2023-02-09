package com.Mail.MailService;

import javax.mail.MessagingException;

import com.Mail.MilDetails.Details;

public interface MailService {

	public String sendEmail(Details details) throws MessagingException, Exception;
}
