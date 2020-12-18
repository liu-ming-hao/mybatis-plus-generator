package com.zhengqing.aigou;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerApp
 *
 * @author 刘明浩
 * @Description
 * @since 2020/12/12 9:39
 */
@Configuration
@EnableSwagger2
public class SwaggerApp {
    @Bean
    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.zhengqing.aigou.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个      http://localhost:8686/swagger-ui.html
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("mybatis-plus-generator 使用 Swagger2 构建RESTful API")
                //创建人
                .contact(new Contact("Bryan", "http://blog.bianxh.top/", ""))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }
}
