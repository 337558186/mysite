package com.dc.mysite.configure;

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
 * Author:magician
 * Date:2022-12-2022/12/21 13:36
 * Description:  Swagger 配置文件
 **/

//开启Swagger使用(项目注释文档)
@EnableSwagger2
//标明是配置类
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                //用于生成API信息
                .apiInfo(apiInfo())
                //select()函数返回一个ApiSelectorBuilder实例,用来控制接口被swagger做成文档
                .select()
                //用于指定扫描哪个包下的接口
                .apis(RequestHandlerSelectors.basePackage("com.dc.mysite"))
                //选择所有的API,如果你想只为部分API生成文档，可以配置这里
                .paths(PathSelectors.any())
                .build();
    }

    /*
     *用于定义API主界面的信息，比如可以声明所有的API的总标题、描述、版本
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //用来自定义API的标题
                .title("myite")
                //用来描述整体的API
                .description("接口文档")
                //创建人信息
                .contact(new Contact("测试员:magician","http://http://localhost:8081/swagger-ui.html","xxxxxxxx@163.com"))
                //用于定义服务的域名
                //.termsOfServiceUrl("")
                .version("1.0") //可以用来定义版本
                .build();
    }
}