package com.sood.vaibhav.restfulWebservices;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	  public static final Contact DEFAULT_CONTACT = new Contact("Vaibhav SOod", "", "testemail");
	  public static final ApiInfo DEFAULT = new ApiInfo("TEst Api", "Api Documentation", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	private static final Set<String> DEFAUL_PRIDUCES_AND_CONSUMES = new HashSet<>();
	@Bean
	public Docket api() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2);
				DEFAUL_PRIDUCES_AND_CONSUMES.add("application/json");
				DEFAUL_PRIDUCES_AND_CONSUMES.add("application/jxml");
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT).produces(DEFAUL_PRIDUCES_AND_CONSUMES).consumes(DEFAUL_PRIDUCES_AND_CONSUMES);
	}

}
