package com.Mail.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Mail.MailServiceImpl.MailImpl;
import com.Mail.MilDetails.Details;
import com.Mail.MilDetails.StatusResponse;

@RestController
public class MailController {

	@Autowired
	private MailImpl impl;

	@PostMapping("/send")
	public ResponseEntity<?> sendMail(@RequestBody Details details) throws Exception {
		String status = impl.sendEmail(details);
		return new ResponseEntity<>(new StatusResponse(status), HttpStatus.OK);
	}
}
