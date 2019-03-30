package rest.proj.config;


import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
 * @author z475684/ wangqi3
 * 
 */
@Configuration
@EnableSwagger2
// http://localhost:9007/swagger-ui.html
public class SwaggerConfig {

	@Bean
	public Docket documentation() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any()).paths(paths())
				.build().apiInfo(metadata());
	}

	private Predicate<String> paths() {
		Predicate<String> or = regex("/restpoj-service.*");
		return or;
	}

	private ApiInfo metadata() {
		return new ApiInfoBuilder().title("Web Services to mock")
				.description("WEB-SERVICES").version("1.0")
				.contact("L@webservice.com").build();
	}

	@Bean
	UiConfiguration uiConfig() {
		return new UiConfiguration("validatorUrl");
	}

}