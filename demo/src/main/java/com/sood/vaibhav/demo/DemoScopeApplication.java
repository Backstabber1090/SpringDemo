package com.sood.vaibhav.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sood.vaibhav.demo.scope.PersonDAO;

@Configuration
@ComponentScan
public class DemoScopeApplication {

	static
	 PersonDAO personDao;
	//static Logger LOGGER = LoggerFactory.getLogger(DemoScopeApplication.class);
	
	
	public static void main(String[] args) {
	//	BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSort());
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoScopeApplication.class);
		//ConfigurableApplicationContext ctx=		SpringApplication.run(DemoScopeApplication.class, args);
		personDao = ctx.getBean(PersonDAO.class);
	
		//LOGGER.info("{}",personDao.getJdbcConnection());
		PersonDAO personDao2 = ctx.getBean(PersonDAO.class);
	//	LOGGER.info("{}",personDao2.getJdbcConnection());
		System.out.println(personDao   +"" +  personDao2 +    "     " + 	ctx.toString());
		ctx.close();
	}

}
