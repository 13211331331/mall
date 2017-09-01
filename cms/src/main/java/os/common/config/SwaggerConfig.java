package os.common.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/*@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages = {"os.controller"})*/
public class SwaggerConfig {

   @Bean  
    public Docket platformApi() {  
        return new Docket(DocumentationType.SWAGGER_2)  
        		.groupName("morning-os-web")
                .apiInfo(apiInfo())  
                .forCodeGeneration(true);
    }  

    private ApiInfo apiInfo() {  
        return new ApiInfoBuilder()  
                .title("morning-os-web RESTful APIs")  
                .description("Copyright © 2017, XingXing.Chen, Morning. All Rights Reserved.")
                .contact(new Contact("ChenXingXing", "https://git.oschina.net/Morning_/Morning", "chenxingxing1994@foxmail.com"))
                .license("Apache License Version 2.0")
                .termsOfServiceUrl("https://git.oschina.net/Morning_/Morning")  
                .version("3.0.0-SNAPSHOT")  
                .build();  
    }  
}
