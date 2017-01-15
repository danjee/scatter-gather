package ro.oss.thirdparty;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		PippoGateway g = context.getBean(PippoGateway.class);
		List<String> response = g.hello("test");
		System.out.println(response);
	}
}
