package com.amazingJava.microservices.apigateway;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class ApiGateWayConfiguration {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){

        return builder.routes()
                .route(p ->p.path("/get")
                        .filters(f->f   //we can add custom path and header , parameter, also authentication token....
                                .addRequestHeader("myHeader","myHeader")
                                .addRequestParameter("params","parameter"))
                        .uri("http://httpbin.org:80"))
                .route(p->p.path("/currency-exchange/**")
                        .uri("lb://currency-exchange"))   //name of the eureka server
                .route(p->p.path("/currency-conversion/**")
                        .uri("lb://currency-conversion-service"))   //name of the eureka server
                .route(p->p.path("/currency-conversion-feign/**")
                        .uri("lb://currency-conversion-service"))   //name of the eureka server

                .route(p->p.path("/currency-conversion-new/**")     //new dileo jeno feign er url execute kore
                        .filters(f->f.rewritePath("/currency-conversion-new/(?<segment>.*)"
                                ,"/currency-conversion-feign/${segment}"))
                        .uri("lb://currency-conversion-service"))   //name of the eureka server
                .build();
    }
}
