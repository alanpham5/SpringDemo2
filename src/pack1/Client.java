package pack1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		
		// Object constructed by developer
/*		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("John Smith");
		eRef.setEaddress("Irvine");
		
		System.out.println("Employee Details: "+eRef);*/
		
		// Spring Way: IOC (Inversion Of Control)
		
		
		// Factory Container Method:
		
		// Constructs objects upon request
		/*
		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee e1 = (Employee)factory.getBean("emp1");
		Employee e2 = factory.getBean("emp2",Employee.class);
		
		System.out.println("Employee1 Details: "+e1);
		System.out.println("Employee2 Details: "+e2);
		*/
		
		// Application Context Container Method:
		// Constructs objects right away
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		Employee e1 = (Employee)context.getBean("emp1");
		System.out.println("Employee1 Details: " +e1);
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); // Close the context
	}

}
