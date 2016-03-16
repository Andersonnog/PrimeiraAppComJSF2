package email;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Email {
	
	public void sendEmail() throws EmailException {
	    
		   SimpleEmail email = new SimpleEmail();
		   //Utilize o hostname do seu provedor de email
		   System.out.println("alterando hostname...");
		   email.setHostName("smtp.gmail.com");
		   //Quando a porta utilizada n�o � a padr�o (gmail = 465)
		   email.setSmtpPort(465);
		   //Adicione os destinat�rios
		   email.addTo("xxx@xxx.com", "Jose");
		   //Configure o seu email do qual enviar�
		   email.setFrom("seuemail@seuprovedor.com", "Seu nome");
		   //Adicione um assunto
		   email.setSubject("Test message");
		   //Adicione a mensagem do email
		   email.setMsg("This is a simple test of commons-email");
		   //Para autenticar no servidor � necess�rio chamar os dois m�todos abaixo
		   System.out.println("autenticando...");
		   email.setSSL(true);
		   email.setAuthentication("username", "senha");
		   System.out.println("enviando...");
		   email.send();
		   System.out.println("Email enviado!");
		}

}
