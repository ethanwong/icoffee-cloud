package org.icoffee.example;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author Administrator
 * @name MyHandlerFunction
 * @description
 *
 * 通过配置断言和过滤器，可以让Spring Cloud Gateway将请求路由到指定的服务上。
 * 但是，如果我们想要在Spring Cloud Gateway中直接处理请求，而不是将请求路由到指定的服务上，
 * 那么我们就需要使用Handler Function。
 *
 * @since 2023-05-12 18:19
 */
@Component
public class MyHandlerFunction implements HandlerFunction<ServerResponse> {

    @Override
    public Mono<ServerResponse> handle(ServerRequest request) {
        return ServerResponse.ok().body(BodyInserters.fromObject("hello world"));
    }
}

