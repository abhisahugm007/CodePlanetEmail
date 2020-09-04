package com.CodePlanetEmail.Controller;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CodePlanetEmailController {

	@RequestMapping(value="/")
	public String SendEmail()
	{
		System.out.println("Controller called");
		return "Input";
	}
	@RequestMapping(value="/EmailCodePlanet")
	public String EmailCodePlanet(HttpServletRequest req,HttpSession session)throws AddressException, MessagingException, IOException {
		System.out.println("!!!!Controller called!!!!");
		
		
		String content="<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <link href=\"https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css\" rel=\"stylesheet\">\r\n" + 
				"    <title>CodePlanetEmail</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <header class=\"text-gray-700 body-font\">\r\n" + 
				"        <div class=\"container mx-auto flex flex-wrap p-5 flex-col md:flex-row items-center\">\r\n" + 
				"          <a class=\"flex title-font font-medium items-center text-gray-900 mb-4 md:mb-0\">\r\n" + 
				"            <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"none\" stroke=\"currentColor\" stroke-linecap=\"round\" stroke-linejoin=\"round\" stroke-width=\"2\" class=\"w-10 h-10 text-white p-2 bg-orange-500 rounded-full\" viewBox=\"0 0 24 24\">\r\n" + 
				"              <path d=\"M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5\"></path>\r\n" + 
				"            </svg>\r\n" + 
				"            <span class=\"ml-3 text-xl\">CodePlanet</span>\r\n" + 
				"          </a>\r\n" + 
				"          <nav class=\"md:ml-auto flex flex-wrap items-center text-base justify-center\">\r\n" + 
				"            <a href=\"https://www.codeplanet.co.in/\" class=\"ml-3 text-xl\">CodePlanet</a>\r\n" + 
				"             <a href=\"http://www.google.com/calendar/event?action=TEMPLATE&text=CodePlanet%20New%20Batches&dates=20200910T130000/20200910T140000&details=New%20Java%20Batches%20Starts%20Soon%20Join%20Fast&location=Pratap%20Nagar%2C%20CodePlanet%20Technologies%2C%20Jaipur\" class=\"ml-3 text-xl\">Add to Google Calendar</a>\r\n" + 
				"          </nav>\r\n" + 
				"        </div>\r\n" + 
				"      </header>\r\n" + 
				"\r\n" + 
				"      <section class=\"text-gray-700 body-font\">\r\n" + 
				"        <div class=\"container px-5 py-24 mx-auto\">\r\n" + 
				"          <div class=\"xl:w-1/2 lg:w-3/4 w-full mx-auto text-center\">\r\n" + 
				"            <svg xmlns=\"http://www.w3.org/2000/svg\" fill=\"currentColor\" class=\"inline-block w-8 h-8 text-gray-400 mb-8\" viewBox=\"0 0 975.036 975.036\">\r\n" + 
				"              <path d=\"M925.036 57.197h-304c-27.6 0-50 22.4-50 50v304c0 27.601 22.4 50 50 50h145.5c-1.9 79.601-20.4 143.3-55.4 191.2-27.6 37.8-69.399 69.1-125.3 93.8-25.7 11.3-36.8 41.7-24.8 67.101l36 76c11.6 24.399 40.3 35.1 65.1 24.399 66.2-28.6 122.101-64.8 167.7-108.8 55.601-53.7 93.7-114.3 114.3-181.9 20.601-67.6 30.9-159.8 30.9-276.8v-239c0-27.599-22.401-50-50-50zM106.036 913.497c65.4-28.5 121-64.699 166.9-108.6 56.1-53.7 94.4-114.1 115-181.2 20.6-67.1 30.899-159.6 30.899-277.5v-239c0-27.6-22.399-50-50-50h-304c-27.6 0-50 22.4-50 50v304c0 27.601 22.4 50 50 50h145.5c-1.9 79.601-20.4 143.3-55.4 191.2-27.6 37.8-69.4 69.1-125.3 93.8-25.7 11.3-36.8 41.7-24.8 67.101l35.9 75.8c11.601 24.399 40.501 35.2 65.301 24.399z\"></path>\r\n" + 
				"            </svg>\r\n" + 
				"            <p class=\"leading-relaxed text-lg\">Thank you for Chosing CODEPLANT TECHNOLOGIES. We are Glad To Inform you that our New Adv Java batch wiil start from 1 september you can join in early bird Registration</p>\r\n" + 
				"            <span class=\"inline-block h-1 w-10 rounded bg-indigo-500 mt-8 mb-6\"></span>\r\n" + 
				"            <h2 class=\"text-gray-900 font-medium title-font tracking-wider text-sm\">ABHISHEK SAHU</h2>\r\n" + 
				"            <p class=\"text-gray-500\">CodePlanet Technologies</p>\r\n" + 
				"          </div>\r\n" + 
				"        </div>\r\n" + 
				"      </section>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>";
		
		
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
		Message msg=new MimeMessage(session1);
		msg.setFrom(new InternetAddress(req.getParameter("SenderUsername")));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(req.getParameter("ReceiverUsername")));
		msg.setSubject("Manipulated Pdf");
		msg.setContent(content, "text/html");	
		Transport.send(msg);
		System.out.println("success");
		return "Index";
	}
	
}