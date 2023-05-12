package org.icoffee.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author Administrator
 * @name GatewayConfig
 * @description
 * @since 2023-05-12 17:52
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route", r -> r.path("/test")
                        .uri("http://localhost:8181"))
                .build();
    }


    /**
     *  通过配置断言和过滤器，可以让Spring Cloud Gateway将请求路由到指定的服务上。
     *  但是，如果我们想要在Spring Cloud Gateway中直接处理请求，而不是将请求路由到指定的服务上，
     *  那么我们就需要使用Handler Function。
     */
    @Autowired
    private MyHandlerFunction myHandlerFunction;
    @Bean
    public RouterFunction<ServerResponse> htmlRouterFunction() {
        return RouterFunctions.route(RequestPredicates.path("/fallback"), myHandlerFunction);
    }



}
