package com.swagger.doc;

/**
 * Created by haoyifen on 16-9-28 2016 下午5:43
 */

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class MySwaggerConfig {

    // @Bean
    // public Docket restApi() {
    //     return new Docket(DocumentationType.SWAGGER_2)
    //             // .groupName("")
    //             .apiInfo(apiInfo())
    //             // .groupName("")
    //             // .securitySchemes(asList(
    //             //         new OAuth(
    //             //                 "petstore_auth",
    //             //                 asList(new AuthorizationScope("write_pets", "modify pets in your account"),
    //             //                         new AuthorizationScope("read_pets", "read your pets")),
    //             //                 Arrays.<GrantType>asList(new ImplicitGrant(new LoginEndpoint("http://petstore.swagger.io/api/oauth/dialog"), "tokenName"))
    //             //         ),
    //             //         new ApiKey("api_key", "api_key", "header")
    //             // ))
    //             .select()
    //             .paths(Predicates.and(ant("/**"), Predicates.not(ant("/error")), Predicates.not(ant("/management/**")), Predicates.not(ant("/management*"))))
    //             .build()
    //             .pathMapping("/");
    //             // .pathProvider(new BasePathAwareRelativePathProvider("/"));
    // }
    //
    //
    // private ApiInfo apiInfo() {
    //     return new ApiInfoBuilder()
    //             .title("API Test  ")
    //             .description("MyAPITest Description")
    //             .contact(new Contact("haoyifen", "http://blog.csdn.net/haoyifen", "haoyifen@yy.com"))
    //             .license("Apache 2.0")
    //             .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
    //             .version("1.0.0")
    //             .build();
    // }
}
