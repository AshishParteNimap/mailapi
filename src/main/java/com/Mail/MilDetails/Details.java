package com.Mail.MilDetails;

public class Details {

	private String name;

	private String sender;
	private String sendTo;
	private String subject;
	private String mailBody = "<h1>Hello, Dear $name</h1><p>Greetings from Godrej properties</p>"
			+ "<p>Best regards,</p><p>$name</p>";

	private String returnEmail;

	public Details() {
		super();

	}

	public Details(String name, String sender, String sendTo, String mailBody, String subject, String returnEmail) {
		super();
		this.name = name;
		this.sender = sender;
		this.sendTo = sendTo;
		this.subject = subject;
		this.mailBody = mailBody;
		this.returnEmail = returnEmail;
	}

	public String getSendTo() {
		return sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public String getMailBody() {
		return mailBody;
	}

	public void setMailBody(String mailBody) {
		this.mailBody = mailBody;
	}

	public String getReturnEmail() {
		return returnEmail;
	}

	public void setReturnEmail(String returnEmail) {
		this.returnEmail = returnEmail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
