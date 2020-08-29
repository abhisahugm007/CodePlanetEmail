package com.CodePlanetEmail.Controller;

import java.util.Properties;

import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;

public class sendMail {

	Session session=null;
	public sendMail(HttpServletRequest req) 
	{
	 Properties p= new Properties();
		p.put("mail.smtp.host", "smtp.gmail.com");
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.starttls.enable", "true");
		p.put("mail.smtp.EnableSSL.enable", "true");
		p.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		p.put("mail.smtp.socketFactory.fallback", "false");
		p.put("mail.smtp.port", "465");
		p.put("mail.smtp.socketFactory.port", "465");
		Session session1=Session.getInstance(p, new SimpleAuthenticator(req.getParameter("SenderUsername"),req.getParameter("password")));
	}
}
