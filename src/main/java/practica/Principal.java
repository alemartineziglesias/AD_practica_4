package practica;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal
{
	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("xml/beans.xml");
		Casa principal = appContext.getBean("Casa", Casa.class);
		System.out.println(principal);
		((ClassPathXmlApplicationContext) appContext).close();
	}
}